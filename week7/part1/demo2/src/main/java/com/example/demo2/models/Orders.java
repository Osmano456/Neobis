package com.example.demo2.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Orders {

    @Id
    @GeneratedValue
    private int id;
    private int customerid;
    private Date date;

    public Orders() {
    }

    public Orders(int id, int customerid, Date date) {
        this.id = id;
        this.customerid = customerid;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", customerid=" + customerid +
                ", date=" + date +
                '}';
    }
}
