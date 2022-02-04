package week3;

public class Cake {
    private int id;
    private String type;
    private int price;
    private String icing;

    public Cake(){

    }

    public Cake(String type, int price, String icing) {
        this.type = type;
        this.price = price;
        this.icing = icing;
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

    @Override
    public String toString() {
        return "Cake{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", icing='" + icing + '\'' +
                '}';
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

    public String getIcing() {
        return icing;
    }

    public void setIcing(String icing) {
        this.icing = icing;
    }

}
