package com.siongriffiths.se315.orders;


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
public class OrderDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public List getAll() {
        return (List<Order>)getSession().createQuery("from Order").list();
    }

}
