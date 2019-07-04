package com.zmxka.bean;

public class Car {
    private String name;
    private String corp;
    private double price;
    private int speed;

    public Car() {
    }

    public Car(String name, String corp, double price) {
        this.name = name;
        this.corp = corp;
        this.price = price;
    }

    public Car(String name, String corp, int speed) {
        this.name = name;
        this.corp = corp;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }
}
