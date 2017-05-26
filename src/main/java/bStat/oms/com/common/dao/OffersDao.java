package bStat.oms.com.common.dao;

import bStat.oms.com.common.models.tables.BillDetails;
import bStat.oms.com.common.models.tables.Offers;
import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.HibernateBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yashi Agarwal on 25-05-2017.
 */
public class OffersDao extends AbstractDAO<Offers> {

    private static final Logger logger = LoggerFactory.getLogger(OffersDao.class);

    @Inject
    public OffersDao(HibernateBundle bundle) {
        super(bundle.getSessionFactory());
    }

    public Offers saveInDB(Offers Offers) {
        return persist(Offers);
    }

}
