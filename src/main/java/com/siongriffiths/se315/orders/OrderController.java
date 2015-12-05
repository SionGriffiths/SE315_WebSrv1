package com.siongriffiths.se315.orders;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;


/**
 * Created by sig2 on 23/11/2015.
 */
@RestController
@RequestMapping(value = "order")
public class OrderController {

    public static final Logger LOGGER = Logger.getLogger(OrderController.class);

    @Autowired OrderDao orderDao;

    @RequestMapping(value = "/new" , method=RequestMethod.POST)
    public void makeNewOrder(@RequestBody OrderWrapper orderWrapper){
       LOGGER.info(orderWrapper.toString());
    }




}
