package com.example.demo2.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Donut {

    @Id
    @GeneratedValue
    private int id;
    private String type;
    private int price;
    private String size;

    public Donut() {
    }

    public Donut(int id, String type, int price, String size) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Donut{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
