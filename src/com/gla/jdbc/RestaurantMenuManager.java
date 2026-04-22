package JDBC;

import java.sql.*;
import java.util.*;
public class RestaurantMenuManager {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/test";
        String u = "root";
        String p = "root";
        Connection con = DriverManager.getConnection(url, u, p);
        Statement st = con.createStatement();
        st.executeUpdate("create table if not exists menu(id int, itemName varchar(50), price double)");
        System.out.println("Enter id itemName price:");
        int id = sc.nextInt();
        String n = sc.next();
        double pr = sc.nextDouble();
        PreparedStatement ps = con.prepareStatement("insert into menu values(?,?,?)");
        ps.setInt(1, id);
        ps.setString(2, n);
        ps.setDouble(3, pr);
        ps.executeUpdate();
        System.out.println("Items below 200:");
        ResultSet rs = st.executeQuery("select * from menu where price < 200");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
        }
        System.out.println("Enter id to update price:");
        int i = sc.nextInt();
        System.out.println("Enter new price:");
        double np = sc.nextDouble();
        PreparedStatement ps2 = con.prepareStatement("update menu set price=? where id=?");
        ps2.setDouble(1, np);
        ps2.setInt(2, i);
        ps2.executeUpdate();
        System.out.println("Enter id to delete:");
        int d = sc.nextInt();
        PreparedStatement ps3 = con.prepareStatement("delete from menu where id=?");
        ps3.setInt(1, d);
        ps3.executeUpdate();
        System.out.println("Final Data:");
        rs = st.executeQuery("select * from menu");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
        }
        con.close();
        sc.close();
    }
}