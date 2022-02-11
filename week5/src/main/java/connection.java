import java.sql.*;


class connection{

    // Test methods
    public static void main(String[] args){

        insert(1, "Chocolate",20,"no");
        insert(2, "Strawberry",30,"yes");
        insert(3, "Vanilla",35,"yes");
        delete(3);
        update(1,"Banana",30,"no");
        select();
    }


    public static Connection connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cafe","root","");

        } catch (Exception throwables) {
            throwables.printStackTrace();

        }
        return null;
    }



    public static void select(){
        try{
            Connection con = connect();
            assert con != null;
            Statement stmt =  con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from cake");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }



    public static void insert(int id, String type,int price, String icing){


        try {
            Connection con = connect();
            assert con != null;
            String sql = "INSERT INTO Cake VALUES (?,?, ?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,id);
            pstmt.setString(2,type);
            pstmt.setInt(3,price);
            pstmt.setString(4,icing);
            pstmt.executeUpdate();
            System.out.println("Inserted cake with parameters: "+id +" "+  type+" "+ price+" "+ icing);
            con.close();

        }

        catch(Exception e){ System.out.println(e);}

    }


    public static void delete(int id){


        try {
            Connection con = connect();
            assert con != null;
            Statement stmt = con.createStatement();
            String sql = "Delete from cake where id = " + id;
            System.out.println("Deleted Cake with id " + id );
            stmt.executeUpdate(sql);
            con.close();

        }

        catch(Exception e){ System.out.println(e);}
    }


    public static void update(int id, String type, int price, String icing){


        try {
            PreparedStatement pstmt;
            Connection con = connect();
            assert con != null;
            String sql = "UPDATE CAKE SET type = ?, Price = ?, icing = ? WHERE id = " + id ;
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,type);
            pstmt.setInt(2,price);
            pstmt.setString(3,icing);
            pstmt.executeUpdate();
            System.out.println("Updated Cake with id " + id);
            con.close();

        }

        catch(Exception e){ System.out.println(e);}

    }


}