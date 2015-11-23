package com.siongriffiths.se315.wine;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
    public List getAll() {
        return (List<Wine>)getSession().createQuery("from Wine").list();
    }

}
