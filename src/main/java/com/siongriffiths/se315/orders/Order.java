package com.siongriffiths.se315.orders;

import com.siongriffiths.se315.wine.Wine;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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

    @NotNull
    @Size(min = 2, max = 50)
    private String customerID;

    @ElementCollection
    private List<Wine> orderDetails;

}
