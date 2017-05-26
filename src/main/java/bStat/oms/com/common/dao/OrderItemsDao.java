package bStat.oms.com.common.dao;

import bStat.oms.com.common.models.tables.Offers;
import bStat.oms.com.common.models.tables.OrderItems;
import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.HibernateBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yashi Agarwal on 25-05-2017.
 */
public class OrderItemsDao extends AbstractDAO<OrderItems> {

    private static final Logger logger = LoggerFactory.getLogger(OrderItemsDao.class);

    @Inject
    public OrderItemsDao(HibernateBundle bundle) {
        super(bundle.getSessionFactory());
    }

    public OrderItems saveInDB(OrderItems OrderItems) {
        return persist(OrderItems);
    }

}
