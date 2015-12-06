package com.siongriffiths.se315.wine;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by sig2 on 23/11/2015.
 */
@RestController
@RequestMapping(value="/wine")
public class WineController {

    @Autowired private WineDao wineDao;
    public static final Logger LOGGER = Logger.getLogger(WineController.class);

    @RequestMapping("/all")
    public List getWineList(HttpServletRequest request){
        String modDate = request.getHeader("if-modified-since");

        Date modifiedDate = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            modifiedDate = sdf.parse(modDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        LOGGER.info("\n \n  ****** Get wines query  ***** \n");
        List result = wineDao.getAllFromDate(modifiedDate);
        LOGGER.info(" ****** "+ result.size() +" updated results  ***** \n \n");
        return result;
    }


//

    /**
     * FOR DEMO ONLY
     * This method is just in order to help show the update functionality
     * @return name of created Wine object
     */
    @RequestMapping("/create")
    public String makeAWine(){
        Wine wine = new Wine();
        wine.setBottleSize("50cl");
        wine.setCountryOfOrigin("China");
        wine.setGrapeType("Zinfandel");
        wine.setLongDescription("This is a wine that has just been created on the webservice");
        wine.setName("AATest DB update Wine");
        wine.setPrice(1.99);
        wine.setProductNumber("1234");
        wine.setShortDescription("test DB wine");
        wine.setVegetarian(true);
        wine.setPictureURL("");
        wine.updateTimeStamps();
        wineDao.saveWine(wine);

        return "Created wine " + wine.getName();
    }

    /**
     * FOR DEMO ONLY
     * This method is just in order to update timestamps in the database
     * to showcase update functionality
     * @return status indication
     */
    @RequestMapping("/update")
    public String updateWines(){

        List<Wine> wineList = (List<Wine>)wineDao.getAll();
        for(Wine wine : wineList ){
            wine.updateTimeStamps();
            wineDao.saveWine(wine);
        }
        return "done";
    }
}
