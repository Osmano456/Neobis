package week3;

public class OrderProduct {

    int orderid;
    int productid;

    int quantity;

    public OrderProduct(int orderid, int productid, int quantity) {
        this.orderid = orderid;
        this.productid = productid;
        this.quantity = quantity;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderProduct{" +
                "orderid=" + orderid +
                ", productid=" + productid +
                ", quantity=" + quantity +
                '}';
    }
}
