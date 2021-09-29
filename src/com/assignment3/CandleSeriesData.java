package com.assignment3;

import java.time.*;

public class CandleSeriesData {
    private LocalDateTime time;
    private String symbol;
    private double price;

    public CandleSeriesData(LocalDateTime time, String symbol, double price) {
        this.time = time;
        this.symbol = symbol;
        this.price = price;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}