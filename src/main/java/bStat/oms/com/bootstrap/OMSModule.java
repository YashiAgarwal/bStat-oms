package bStat.oms.com.bootstrap;

import bStat.oms.com.config.OMSConfiguration;
import com.codahale.metrics.MetricRegistry;
import com.google.inject.AbstractModule;
import io.dropwizard.hibernate.HibernateBundle;
import org.hibernate.SessionFactory;

import javax.validation.Validator;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by prashant170392 on 01/05/2017
 */
public class OMSModule extends AbstractModule {

    private HibernateBundle<OMSConfiguration> bundle;
    private OMSConfiguration config;
    private Validator validator;
    private List<String> buckets;
    private final MetricRegistry metricRegistry;

    public OMSModule(HibernateBundle<OMSConfiguration> bundle, OMSConfiguration config, Validator validator,
                     final MetricRegistry metricRegistry) {
        this.bundle = bundle;
        this.config = config;
        this.validator = validator;
        this.metricRegistry = metricRegistry;
    }

    @Override
    protected void configure() {
        bind(HibernateBundle.class).toInstance(bundle);
        bind(OMSConfiguration.class).toInstance(config);
        bind(Validator.class).toInstance(validator);
        bind(SessionFactory.class).toInstance(bundle.getSessionFactory());
        buckets = new ArrayList<String>();
        buckets.add(this.config.getConfigParams().getBucket());
    }

}
