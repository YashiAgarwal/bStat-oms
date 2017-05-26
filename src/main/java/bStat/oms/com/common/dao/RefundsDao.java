package bStat.oms.com.common.dao;

import bStat.oms.com.common.models.tables.Orders;
import bStat.oms.com.common.models.tables.Refunds;
import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.HibernateBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yashi Agarwal on 25-05-2017.
 */
public class RefundsDao extends AbstractDAO<Refunds> {

    private static final Logger logger = LoggerFactory.getLogger(RefundsDao.class);

    @Inject
    public RefundsDao(HibernateBundle bundle) {
        super(bundle.getSessionFactory());
    }

    public Refunds saveInDB(Refunds Refunds) {
        return persist(Refunds);
    }
}
