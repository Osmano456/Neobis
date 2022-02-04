package week3;

import java.util.Date;

public class Orders {

    int id;
    int customerId;
    Date date;

    public Orders(int id, int customerId, Date date) {
        this.id = id;
        this.customerId = customerId;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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
                ", customerId=" + customerId +
                ", date=" + date +
                '}';
    }
}
