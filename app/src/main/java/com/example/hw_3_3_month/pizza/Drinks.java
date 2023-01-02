package com.example.hw_3_3_month.pizza;

import java.io.Serializable;

public class Drinks implements Serializable {

    String name;
    int Price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public Drinks(String name, int price) {
        this.name = name;
        Price = price;
    }
}
