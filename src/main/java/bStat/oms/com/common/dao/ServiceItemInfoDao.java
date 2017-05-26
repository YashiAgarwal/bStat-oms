package bStat.oms.com.common.dao;

import bStat.oms.com.common.models.tables.Orders;
import bStat.oms.com.common.models.tables.ServiceItemInfo;
import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.HibernateBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yashi Agarwal on 25-05-2017.
 */
public class ServiceItemInfoDao extends AbstractDAO<ServiceItemInfo> {

    private static final Logger logger = LoggerFactory.getLogger(ServiceItemInfoDao.class);

    @Inject
    public ServiceItemInfoDao(HibernateBundle bundle) {
        super(bundle.getSessionFactory());
    }

    public ServiceItemInfo saveInDB(ServiceItemInfo ServiceItemInfo) {
        return persist(ServiceItemInfo);
    }
}
