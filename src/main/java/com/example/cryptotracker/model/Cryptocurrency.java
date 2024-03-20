package com.example.cryptotracker.model;

public class Cryptocurrency {
    private String name;
    private double price;
    private double marketCap;
    private double percentChange24h;

    public Cryptocurrency(String name, double price, double marketCap, double percentChange24h) {
        this.name = name;
        this.price = price;
        this.marketCap = marketCap;
        this.percentChange24h = percentChange24h;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public double getPercentChange24h() {
        return percentChange24h;
    }

    public void setPercentChange24h(double percentChange24h) {
        this.percentChange24h = percentChange24h;
    }
}
