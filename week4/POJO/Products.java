package week3;

public class Products {

    int id;
    int cakeid;
    int donutid;

    public Products(int id, int cakeid, int donutid) {
        this.id = id;
        this.cakeid = cakeid;
        this.donutid = donutid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCakeid() {
        return cakeid;
    }

    public void setCakeid(int cakeid) {
        this.cakeid = cakeid;
    }

    public int getDonutid() {
        return donutid;
    }

    public void setDonutid(int donutid) {
        this.donutid = donutid;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", cakeid=" + cakeid +
                ", donutid=" + donutid +
                '}';
    }
}
