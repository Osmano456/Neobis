package com.example.demo2.models;


import javax.persistence.*;

@Entity
@Table(name = "cake")
public class Cake {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "type")
    private String type;
    @Column(name = "price")
    private int price;
    @Column(name = "icing")
    private String icing;
    @Column(name = "weight")
    private int weight;

    public Cake() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Cake(int id, String type, int price, String icing, int weight) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.icing = icing;
        this.weight = weight;
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

    public String getIcing() {
        return icing;
    }

    public void setIcing(String icing) {
        this.icing = icing;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", icing='" + icing + '\'' +
                ", weight=" + weight +
                '}';
    }
}
