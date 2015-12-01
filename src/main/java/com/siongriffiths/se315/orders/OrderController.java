package com.siongriffiths.se315.orders;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by sig2 on 23/11/2015.
 */
@RestController
@RequestMapping(value = "order")
public class OrderController {

    public static final Logger LOGGER = Logger.getLogger(OrderController.class);

    @Autowired OrderService orderService;
    @Autowired OrderDao orderDao;

    @RequestMapping(value = "/new" , method=RequestMethod.POST)
    public void getWineList(@RequestBody String json){

    }


}
