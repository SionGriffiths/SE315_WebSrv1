package com.siongriffiths.se315.orders;

import com.siongriffiths.se315.customer.Customer;
import com.siongriffiths.se315.wine.Wine;

import javax.persistence.*;
import java.util.List;

/**
 * Created by sig2 on 23/11/2015.
 */

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Customer customer;

    @ElementCollection
    private List<Wine> orderDetails;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Wine> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<Wine> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
