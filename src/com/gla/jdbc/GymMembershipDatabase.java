package JDBC;

import java.sql.*;
import java.util.*;
public class GymMembershipDatabase {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/test";
        String u = "root";
        String p = "root";
        Connection con = DriverManager.getConnection(url, u, p);
        Statement st = con.createStatement();
        st.executeUpdate("create table if not exists members(id int, name varchar(50), type varchar(20), months int)");
        System.out.println("Enter id name type months:");
        int id = sc.nextInt();
        String n = sc.next();
        String t = sc.next();
        int m = sc.nextInt();
        PreparedStatement ps = con.prepareStatement("insert into members values(?,?,?,?)");
        ps.setInt(1, id);
        ps.setString(2, n);
        ps.setString(3, t);
        ps.setInt(4, m);
        ps.executeUpdate();
        System.out.println("Premium members:");
        ResultSet rs = st.executeQuery("select * from members where type='Premium'");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
        }
        System.out.println("Enter id to extend membership:");
        int i = sc.nextInt();
        System.out.println("Enter months to add:");
        int add = sc.nextInt();
        PreparedStatement ps2 = con.prepareStatement("update members set months = months + ? where id = ?");
        ps2.setInt(1, add);
        ps2.setInt(2, i);
        ps2.executeUpdate();
        System.out.println("Enter id to delete:");
        int d = sc.nextInt();
        PreparedStatement ps3 = con.prepareStatement("delete from members where id = ?");
        ps3.setInt(1, d);
        ps3.executeUpdate();
        System.out.println("Final Data:");
        rs = st.executeQuery("select * from members");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
        }
        con.close();
        sc.close();
    }
}