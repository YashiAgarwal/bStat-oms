package bStat.oms.com.common.dao;

import bStat.oms.com.common.models.tables.Offers;
import bStat.oms.com.common.models.tables.Orders;
import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.HibernateBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yashi Agarwal on 25-05-2017.
 */
public class OrdersDao extends AbstractDAO<Orders> {

    private static final Logger logger = LoggerFactory.getLogger(OffersDao.class);

    @Inject
    public OrdersDao(HibernateBundle bundle) {
        super(bundle.getSessionFactory());
    }

    public Orders saveInDB(Orders Orders) {
        return persist(Orders);
    }

}
