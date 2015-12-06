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

    /**
     * # Recieve a POST request containing order data in json format (default)
     * @param orderWrapper Object used to wrap the expected json object format
     */
    @RequestMapping(value = "/new" , method=RequestMethod.POST)
    public void makeNewOrder(@RequestBody OrderWrapper orderWrapper){
       LOGGER.info(orderWrapper.toString());
    }




}
