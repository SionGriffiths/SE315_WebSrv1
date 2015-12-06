package com.siongriffiths.se315.wine;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * Created by sig2 on 23/11/2015.
 *
 * Database Access Object for Wine table
 *
 */

@Repository
@Transactional
public class WineDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    /**
     * Selects all wines with lastmodified dates after the parameter time
     * @param modifiedDate param from consuming webapp
     * @return list of wines that have been modified since paramter time
     */
    @SuppressWarnings("unchecked")
    public List getAllFromDate(Date modifiedDate) {
        String hql = "FROM Wine W WHERE W.lastModified > :modifiedDate";

        Query query = getSession().createQuery(hql);
        query.setParameter("modifiedDate",modifiedDate);
        List results = query.list();
        return results;
    }

    /**
     * Selects all wines in the wines table
     * @return list of all persisted wines
     */
    public List getAll(){
        return (List<Wine>)getSession().createQuery("from Wine").list();
    }

    /**
     * Persist a wine
     * @param wine
     */
    public void saveWine(Wine wine){
        getSession().saveOrUpdate(wine);
    }

}
