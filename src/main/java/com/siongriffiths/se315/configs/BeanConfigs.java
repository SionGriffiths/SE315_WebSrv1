package com.siongriffiths.se315.configs;

import com.siongriffiths.se315.orders.OrderService;
import com.siongriffiths.se315.wine.WineService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sig2 on 23/11/2015.
 */
@Configuration
public class BeanConfigs {

    @Bean
    public OrderService orderService(){
        return new OrderService();
    }
    @Bean
    public WineService WineService(){
        return new WineService();
    }

}
