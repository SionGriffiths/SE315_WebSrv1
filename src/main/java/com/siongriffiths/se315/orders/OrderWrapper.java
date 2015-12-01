package com.siongriffiths.se315.orders;

import com.siongriffiths.se315.customer.Customer;
import com.siongriffiths.se315.wine.Wine;

import java.util.List;

/**
 * Created by sig2 on 01/12/2015.
 */
public class OrderWrapper {

    private List<OrderDetail> orderDetails;

    private Customer customer;

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Customer getCustomer ()
    {
        return customer;
    }

    public void setCustomer (Customer customer)
    {
        this.customer = customer;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n>>>>>>>>>>>>>>>>>>>>>>>\n")
                .append("Order received : \n")
                .append("Customer name : ").append(customer.getFirst_name()).append(" ").append(customer.getSecond_name()).append("\n")
                .append("Customer address : ").append(customer.getAddress()).append("\n")
                .append(">>>>>>>>>>>>>>>>>>>>>>>\n")
                .append("Order Details :");
        for(OrderDetail orderDetail : orderDetails){
            sb.append("\n");
            sb.append(orderDetail.toString());
        }
        sb.append("\n>>>>>>>>>>>>>>>>>>>>>>>\n");
        return sb.toString();
    }
}
