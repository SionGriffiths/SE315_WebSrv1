package com.siongriffiths.se315.orders;

/**
 * Created by sig2 on 01/12/2015.
 *
 * Class is used to wrap up a recieved wine order line
 *
 */
public class OrderDetail {

    private String wineName;
    private String productNumber;
    private String quantity;

    public String getWineName() {
        return wineName;
    }

    public void setWineName(String wineName) {
        this.wineName = wineName;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "Product number : " + productNumber + " | Wine name : " + wineName + " | Quantity : " + quantity;
    }
}
