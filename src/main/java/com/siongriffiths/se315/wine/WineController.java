package com.siongriffiths.se315.wine;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sig2 on 23/11/2015.
 */
@RestController
public class WineController {




//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/test")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new String("Test");
    }




}
