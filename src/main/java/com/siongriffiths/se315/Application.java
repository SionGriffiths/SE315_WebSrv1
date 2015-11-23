package com.siongriffiths.se315;

import com.siongriffiths.se315.orders.OrderService;
import com.siongriffiths.se315.wine.WineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by sig2 on 27/10/2015.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


