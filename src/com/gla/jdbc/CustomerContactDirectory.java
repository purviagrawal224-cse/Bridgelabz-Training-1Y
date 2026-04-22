package JDBC;
import java.sql.*;
import java.util.*;
public class CustomerContactDirectory {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/test";
        String u = "root";
        String p = "root";
        Connection con = DriverManager.getConnection(url, u, p);
        Statement st = con.createStatement();
        st.executeUpdate("create table if not exists customers(id int, name varchar(50), phone varchar(15))");
        System.out.println("Enter id name phone:");
        int id = sc.nextInt();
        String n = sc.next();
        String ph = sc.next();
        PreparedStatement ps = con.prepareStatement("insert into customers values(?,?,?)");
        ps.setInt(1, id);
        ps.setString(2, n);
        ps.setString(3, ph);
        ps.executeUpdate();
        System.out.println("Enter name to search:");
        String s = sc.next();
        PreparedStatement ps2 = con.prepareStatement("select * from customers where name like ?");
        ps2.setString(1, "%" + s + "%");
        ResultSet rs = ps2.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
        System.out.println("Enter id to update phone:");
        int i = sc.nextInt();
        System.out.println("Enter new phone:");
        String np = sc.next();
        PreparedStatement ps3 = con.prepareStatement("update customers set phone=? where id=?");
        ps3.setString(1, np);
        ps3.setInt(2, i);
        ps3.executeUpdate();
        System.out.println("Enter id to delete:");
        int d = sc.nextInt();
        PreparedStatement ps4 = con.prepareStatement("delete from customers where id=?");
        ps4.setInt(1, d);
        ps4.executeUpdate();
        System.out.println("Final Data:");
        rs = st.executeQuery("select * from customers");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
        con.close();
        sc.close();
    }
}