package bStat.oms.com.common.dao;

import bStat.oms.com.common.exceptions.ApiException;
import bStat.oms.com.common.exceptions.ResponseErrorMsg;
import bStat.oms.com.common.models.tables.Address;
import bStat.oms.com.common.utils.HSession;
import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.HibernateBundle;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Yashi Agarwal on 25-05-2017.
 */
public class AddressDao extends AbstractDAO<Address> {

    private static final Logger logger = LoggerFactory.getLogger(AddressDao.class);

    @Inject
    public AddressDao(HibernateBundle bundle) {
        super(bundle.getSessionFactory());
    }

    public void save(Address address) {
        currentSession().save(address);
    }

    public List<Address> getAllAddresses(){
        Criteria cr = currentSession().createCriteria(Address.class);
        return cr.list();
    }

    public Address getAddressWithAddressId(long addressId){
        Criteria cr = currentSession().createCriteria(Address.class);
        cr.add(Restrictions.eq("id", addressId));
        List<Address> list = cr.list();
        if(list != null && !list.isEmpty())
            return list.get(0);
        return null;
    }

    public void deleteAddressRowWithTxn(long addressId) {
        HSession hSession = new HSession();
        hSession.openWithTransaction();
        try {
            Address address = get(addressId);
            if(address!=null){
                currentSession().delete(address);
            }else{
                throw new ApiException(Response.Status.BAD_REQUEST, ResponseErrorMsg.NOT_AVAILABLE,
                        "No such raw material Id found in DB: "+addressId);
            }
            hSession.commit();
        } catch (Exception e) {
            logger.error("Error while fetching deleteAddressRowWithTxn in Store table " + e.getMessage(), e);
        } finally {
            hSession.close();
        }
    }
}


