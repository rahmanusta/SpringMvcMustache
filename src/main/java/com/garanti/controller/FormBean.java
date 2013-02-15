package com.garanti.controller;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 2/15/13
 * Time: 12:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class FormBean {
    private Double sayi1;
    private Double sayi2;
    private Double toplam;

    public FormBean() {
        this.setSayi1(0d);
        this.setSayi2(0d);
        this.setToplam(0d);
    }

    public Double getToplam() {
        return toplam;
    }

    public void setToplam(Double toplam) {
        this.toplam = toplam;
    }

    public double getSayi1() {
        return sayi1;
    }

    public void setSayi1(double sayi1) {
        this.sayi1 = sayi1;
    }

    public double getSayi2() {
        return sayi2;
    }

    public void setSayi2(double sayi2) {
        this.sayi2 = sayi2;
    }

    @Override
    public String toString() {
        return "FormBean{" +
                "sayi1=" + sayi1 +
                ", sayi2=" + sayi2 +
                '}';
    }
}
