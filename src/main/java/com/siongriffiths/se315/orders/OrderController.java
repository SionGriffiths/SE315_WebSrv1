package com.siongriffiths.se315.orders;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
    public void getWineList(@RequestBody OrderWrapper orderWrapper, HttpServletRequest request){
//        logOrder(request.getParameterMap());
        LOGGER.info(orderWrapper);
    }

    private void logOrder( Map<String, String[]> parameterMap){}


}
