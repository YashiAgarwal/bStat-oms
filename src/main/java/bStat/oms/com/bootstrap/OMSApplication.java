package bStat.oms.com.bootstrap;


import bStat.oms.com.common.models.tables.*;
import bStat.oms.com.common.utils.GuiceInjector;
import bStat.oms.com.config.OMSConfiguration;
import bStat.oms.com.resources.DataResource;
import com.codahale.metrics.JmxReporter;
import com.codahale.metrics.MetricRegistry;
import com.google.inject.Guice;
import com.google.inject.Injector;
import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.Validator;

/**
 * Created by prashant170392 on 01/05/2017
 */
public class OMSApplication extends Application<OMSConfiguration> {

    private static final Logger logger = LoggerFactory.getLogger(OMSApplication.class);

    public static void main(String[] args) throws Exception {
        new OMSApplication().run(args);
    }

    private final HibernateBundle<OMSConfiguration> hibernate = new HibernateBundle<OMSConfiguration>(Address.class,
            BankDetails.class, InvoiceDetails.class, Offers.class, OrderItems.class, Orders.class,
            Payments.class, Purchaser_Customer.class, Refunds.class, Sellers.class, ServiceItemInfo.class) {
        @Override
        public DataSourceFactory getDataSourceFactory(OMSConfiguration omsConfiguration) {
            logger.info("Configuring database ...");
            return omsConfiguration.getDatabase();
        }
    };


    @Override
    public void initialize(Bootstrap<OMSConfiguration> bootstrap) {
        bootstrap.addBundle(hibernate);

        bootstrap.addBundle(new SwaggerBundle<OMSConfiguration>() {
            @Override
            public SwaggerBundleConfiguration getSwaggerBundleConfiguration(OMSConfiguration configuration) {
                return configuration.getSwagger();
            }
        });
    }

    @Override
    public void run(OMSConfiguration config, Environment environment) throws Exception {
        logger.info("Starting Up the bStat OMS Application ... ");
        Validator validator = environment.getValidator();

        // ---------- register metrioms ---------
        MetricRegistry metricRegistry = environment.metrics();
        MetricsService.setRegistry(metricRegistry);
        JmxReporter.forRegistry(environment.metrics()).build().start();

        Injector injector = Guice.createInjector(new OMSModule(hibernate, config, validator, metricRegistry));
        GuiceInjector.assignInjector(injector);

        //------- registering app resources -----------
        environment.jersey().register(injector.getInstance(DataResource.class));

        environment.lifecycle().manage(injector.getInstance(OMSManagedService.class));
    }
}