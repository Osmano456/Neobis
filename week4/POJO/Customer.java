package week3;

public class Customer {

    private int id;
    private String firstname;
    private String LastName;
    private int telephone;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public int getTelephone() {
        return telephone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", LastName='" + LastName + '\'' +
                ", telephone=" + telephone +
                '}';
    }
}

