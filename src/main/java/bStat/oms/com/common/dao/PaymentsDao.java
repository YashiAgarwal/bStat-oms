package bStat.oms.com.common.dao;

import bStat.oms.com.common.models.tables.Orders;
import bStat.oms.com.common.models.tables.Payments;
import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.HibernateBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yashi Agarwal on 25-05-2017.
 */
public class PaymentsDao extends AbstractDAO<Payments> {

    private static final Logger logger = LoggerFactory.getLogger(PaymentsDao.class);

    @Inject
    public PaymentsDao(HibernateBundle bundle) {
        super(bundle.getSessionFactory());
    }

    public Payments saveInDB(Payments Payments) {
        return persist(Payments);
    }
}
