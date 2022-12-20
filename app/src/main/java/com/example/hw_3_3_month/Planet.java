package com.example.hw_3_3_month;

public class Planet {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public String getLife() {
        return life;
    }

    public void setLife(String life) {
        this.life = life;
    }

    int image ;

    public Planet(String name, int image, String radius, String life) {
        this.name = name;
        this.image = image;
        this.radius = radius;
        this.life = life;
    }

    String radius;
String life;



}
