package com.siongriffiths.se315.orders;

import com.siongriffiths.se315.customer.Customer;
import com.siongriffiths.se315.wine.Wine;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

/**
 * Created by sig2 on 23/11/2015.
 */

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderNumber;

    @ManyToOne
    private Customer customer;

    @ElementCollection
    private Map<Wine,Integer> orderDetails;

    public long getId() {
        return orderNumber;
    }

    public void setId(long id) {
        this.orderNumber = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Map<Wine, Integer> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Map<Wine, Integer> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
