package com.siongriffiths.se315.wine;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public static final Logger LOGGER = Logger.getLogger(WineController.class);

    @RequestMapping("/all")
    public List getWineList(){
        LOGGER.info("\n \n  ****** Get all wines query  ***** \n \n");
        return wineDao.getAll();
    }



}
