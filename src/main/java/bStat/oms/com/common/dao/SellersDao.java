package bStat.oms.com.common.dao;

import bStat.oms.com.common.models.tables.Orders;
import bStat.oms.com.common.models.tables.Sellers;
import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.HibernateBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yashi Agarwal on 25-05-2017.
 */
public class SellersDao extends AbstractDAO<Sellers> {

    private static final Logger logger = LoggerFactory.getLogger(SellersDao.class);

    @Inject
    public SellersDao(HibernateBundle bundle) {
        super(bundle.getSessionFactory());
    }

    public Sellers saveInDB(Sellers Sellers) {
        return persist(Sellers);
    }
}
