package com.siongriffiths.se315.wine;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * Created by sig2 on 23/11/2015.
 */
@RestController
@RequestMapping(value="/wine")
public class WineController {

    @Autowired WineService wineService;
    @Autowired WineDao wineDao;

//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/test")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return wineService.wineServiceTest();
    }

    @RequestMapping("/all")
    public String getWineList(){
        List all = wineDao.getAll();
        StringBuilder sb = new StringBuilder();
        for(Object obj : all){
            sb.append(obj.toString());
        }
        return sb.toString();
    }



}
