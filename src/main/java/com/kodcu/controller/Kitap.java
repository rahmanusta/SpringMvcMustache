package com.kodcu.controller;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 2/13/13
 * Time: 11:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Kitap {

    private String ad;
    private Double fiyat;
    private String yazar;
    private Boolean goster;

    public Kitap(String ad, Double fiyat, String yazar, Boolean goster) {
        this.ad = ad;
        this.fiyat = fiyat;
        this.yazar = yazar;
        this.goster = goster;
    }

    public Kitap() {
    }

    public Boolean getGoster() {
        return goster;
    }

    public void setGoster(Boolean goster) {
        this.goster = goster;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }
}
