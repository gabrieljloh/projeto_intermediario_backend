package com.example.projeto_intermediario.model;


import java.math.BigInteger;
import java.net.URL;


public class AmazonProduct {
    private String title;
    private String brand;
    private URL mainImageUrl;
    private BigInteger ratingsTotal;
    private Float rating;

    public Market market(){
        return new Market();
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public URL getMainImageUrl() {
        return mainImageUrl;
    }

    public void setMainImageUrl(URL mainImageUrl) {
        this.mainImageUrl = mainImageUrl;
    }

    public BigInteger getRatingsTotal() {
        return ratingsTotal;
    }

    public void setRatingsTotal(BigInteger ratingsTotal) {
        this.ratingsTotal = ratingsTotal;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }
}
