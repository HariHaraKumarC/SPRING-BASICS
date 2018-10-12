package hari.edu.spring.pojo;

import java.util.List;

public class Trally {

    int price;
    int maxKg;
    List<String> fruits;

    public Trally(int price, int maxKg, List<String> fruits) {
        this.price = price;
        this.maxKg = maxKg;
        this.fruits = fruits;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxKg() {
        return maxKg;
    }

    public void setMaxKg(int maxKg) {
        this.maxKg = maxKg;
    }

    public List<String> getFruits() {
        return fruits;
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }
}
