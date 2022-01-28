public class Cake {
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

    @Override
    public String toString() {
        return "Cake{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", icing='" + icing + '\'' +
                '}';
    }
}