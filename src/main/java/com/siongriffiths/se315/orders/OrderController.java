package com.siongriffiths.se315.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sig2 on 23/11/2015.
 */
@RestController
public class OrderController {

    @Autowired OrderService orderService;


}
