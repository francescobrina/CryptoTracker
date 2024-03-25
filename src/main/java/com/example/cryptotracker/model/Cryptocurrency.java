package com.example.cryptotracker.model;

import java.math.BigInteger;

public class Cryptocurrency {
    private String id;
    private String market_cap_rank;
    private double current_price;
    private BigInteger market_cap;
    private double market_cap_change_percentage_24h;

    // Costruttore
    public Cryptocurrency(String id, String market_cap_rank, double current_price, BigInteger market_cap, double market_cap_change_percentage_24h) {
        this.id = id;
        this.market_cap_rank = market_cap_rank;
        this.current_price = current_price;
        this.market_cap = market_cap;
        this.market_cap_change_percentage_24h = market_cap_change_percentage_24h;
    }

    // Getter e Setter per id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter e Setter per market_cap_rank
    public String getMarket_cap_rank() {
        return market_cap_rank;
    }

    public void setMarket_cap_rank(String market_cap_rank) {
        this.market_cap_rank = market_cap_rank;
    }

    // Getter e Setter per current_price
    public double getCurrent_price() {
        return current_price;
    }

    public void setCurrent_price(double current_price) {
        this.current_price = current_price;
    }

    // Getter e Setter per market_cap
    public BigInteger getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(BigInteger market_cap) {
        this.market_cap = market_cap;
    }

    // Getter e Setter per market_cap_change_percentage_24h
    public double getMarket_cap_change_percentage_24h() {
        return market_cap_change_percentage_24h;
    }

    public void setMarket_cap_change_percentage_24h(double market_cap_change_percentage_24h) {
        this.market_cap_change_percentage_24h = market_cap_change_percentage_24h;
    }
}
