package JDBC;
import java.sql.*;
import java.util.*;
public class BookstoreSalesTracking {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/test";
        String u = "root";
        String p = "root";
        Connection con = DriverManager.getConnection(url, u, p);
        Statement st = con.createStatement();
        st.executeUpdate("create table if not exists sales(id int, bookName varchar(100), quantity int, price double)");
        System.out.println("Enter id bookName quantity price:");
        int id = sc.nextInt();
        String n = sc.next();
        int q = sc.nextInt();
        double pr = sc.nextDouble();
        PreparedStatement ps = con.prepareStatement("insert into sales values(?,?,?,?)");
        ps.setInt(1, id);
        ps.setString(2, n);
        ps.setInt(3, q);
        ps.setDouble(4, pr);
        ps.executeUpdate();
        System.out.println("Sales with quantity > 1:");
        ResultSet rs = st.executeQuery("select * from sales where quantity > 1");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getDouble(4));
        }
        System.out.println("Enter id to update quantity:");
        int i = sc.nextInt();
        System.out.println("Enter new quantity:");
        int nq = sc.nextInt();
        PreparedStatement ps2 = con.prepareStatement("update sales set quantity=? where id=?");
        ps2.setInt(1, nq);
        ps2.setInt(2, i);
        ps2.executeUpdate();
        System.out.println("Enter id to delete:");
        int d = sc.nextInt();
        PreparedStatement ps3 = con.prepareStatement("delete from sales where id=?");
        ps3.setInt(1, d);
        ps3.executeUpdate();
        System.out.println("Final Data:");
        rs = st.executeQuery("select * from sales");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getDouble(4));
        }
        con.close();
        sc.close();
    }
}