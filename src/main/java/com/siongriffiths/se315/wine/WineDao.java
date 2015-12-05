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
 */

@Repository
@Transactional
public class WineDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public List getAllFromDate(Date modifiedDate) {
        String hql = "FROM Wine W WHERE W.lastModified > :modifiedDate";

        Query query = getSession().createQuery(hql);
        query.setParameter("modifiedDate",modifiedDate);
        List results = query.list();
        return results;
    }

    public List getAll(){
        return (List<Wine>)getSession().createQuery("from Wine").list();
    }

    public void saveWine(Wine wine){
        getSession().saveOrUpdate(wine);
    }

}
