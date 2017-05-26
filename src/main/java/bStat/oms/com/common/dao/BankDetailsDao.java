package bStat.oms.com.common.dao;

import bStat.oms.com.common.models.tables.BankDetails;
import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.HibernateBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yashi Agarwal on 25-05-2017.
 */
public class BankDetailsDao extends AbstractDAO<BankDetails> {

    private static final Logger logger = LoggerFactory.getLogger(BankDetailsDao.class);

    @Inject
    public BankDetailsDao(HibernateBundle bundle) {
        super(bundle.getSessionFactory());
    }

    public BankDetails saveInDB(BankDetails BankDetails) {
        return persist(BankDetails);
    }

}
