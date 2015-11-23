package com.siongriffiths.se315.wine;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="wines")
public class Wine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 2, max = 250)
    private String shortDescription;

    @NotNull
    @Size(min = 2, max = 1500)
    private String longDescription;

    @NotNull
    @Size(min = 2, max = 50)
    private String countryOfOrigin;

    @NotNull
    @Size(min = 2, max = 50)
    private String grapeType;

    @NotNull
    @Size(min = 2, max = 50)
    private String bottleSize;

    @NotNull
    private boolean vegetarian;

    @NotNull
    private double price;

    public Wine() { }

    public Wine(long id) {
        this.id = id;
    }

    public Wine(String shortDescription, String longDescription, String countryOfOrigin,
                String grapeType, String bottleSize, boolean vegetarian, double price) {
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.countryOfOrigin = countryOfOrigin;
        this.grapeType = grapeType;
        this.bottleSize = bottleSize;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getGrapeType() {
        return grapeType;
    }

    public void setGrapeType(String grapeType) {
        this.grapeType = grapeType;
    }

    public String getBottleSize() {
        return bottleSize;
    }

    public void setBottleSize(String bottleSize) {
        this.bottleSize = bottleSize;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
