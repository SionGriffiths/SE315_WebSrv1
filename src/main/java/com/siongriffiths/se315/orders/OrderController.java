package com.siongriffiths.se315.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sig2 on 23/11/2015.
 */
@RestController
@RequestMapping(value = "order")
public class OrderController {

    @Autowired OrderService orderService;
    @Autowired OrderDao orderDao;

    @RequestMapping("/all")
    public String getWineList(){
        List all = orderDao.getAll();
        StringBuilder sb = new StringBuilder();
        for(Object obj : all){
            sb.append(obj.toString());
        }
        return sb.toString();
    }


}
