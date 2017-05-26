package bStat.oms.com.common.dao;

import bStat.oms.com.common.models.tables.Orders;
import bStat.oms.com.common.models.tables.Purchaser_Customer;
import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.HibernateBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yashi Agarwal on 25-05-2017.
 */
public class Purchaser_CustomerDao extends AbstractDAO<Purchaser_Customer> {

    private static final Logger logger = LoggerFactory.getLogger(Purchaser_CustomerDao.class);

    @Inject
    public Purchaser_CustomerDao(HibernateBundle bundle) {
        super(bundle.getSessionFactory());
    }

    public Purchaser_Customer saveInDB(Purchaser_Customer Purchaser_Customer) {
        return persist(Purchaser_Customer);
    }
}
