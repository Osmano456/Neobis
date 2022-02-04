package week3;

public class Donut {
    private int id;
    private String type;
    private int price;
    private int size;

    public Donut(){
    }

    public Donut(String type, int price , int size) {
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Donut{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
