package bStat.oms.com.common.dao;

import bStat.oms.com.common.models.tables.BankDetails;
import bStat.oms.com.common.models.tables.BillDetails;
import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.HibernateBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yashi Agarwal on 25-05-2017.
 */
public class BillDetailsDao extends AbstractDAO<BillDetails> {

    private static final Logger logger = LoggerFactory.getLogger(BillDetailsDao.class);

    @Inject
    public BillDetailsDao(HibernateBundle bundle) {
        super(bundle.getSessionFactory());
    }

    public BillDetails saveInDB(BillDetails BillDetails) {
        return persist(BillDetails);
    }

}
