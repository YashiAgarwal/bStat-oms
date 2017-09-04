package bStat.oms.com.common.dao;

import bStat.oms.com.common.models.tables.InvoiceDetails;
import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.HibernateBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yashi Agarwal on 25-05-2017.
 */
public class BillDetailsDao extends AbstractDAO<InvoiceDetails> {

    private static final Logger logger = LoggerFactory.getLogger(BillDetailsDao.class);

    @Inject
    public BillDetailsDao(HibernateBundle bundle) {
        super(bundle.getSessionFactory());
    }

    public InvoiceDetails saveInDB(InvoiceDetails InvoiceDetails) {
        return persist(InvoiceDetails);
    }

}
