package JDBC;

import java.sql.*;
import java.util.*;
public class LibraryBookManager {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/test";
        String u = "root";
        String p = "root";
        Connection con = DriverManager.getConnection(url, u, p);
        Statement st = con.createStatement();
        st.executeUpdate("create table if not exists books(id int, title varchar(100), author varchar(50), status varchar(10))");
        System.out.println("Enter id title author status:");
        int id = sc.nextInt();
        String t = sc.next();
        String a = sc.next();
        String s = sc.next();
        PreparedStatement ps = con.prepareStatement("insert into books values(?,?,?,?)");
        ps.setInt(1, id);
        ps.setString(2, t);
        ps.setString(3, a);
        ps.setString(4, s);
        ps.executeUpdate();
        System.out.println("Available books:");
        ResultSet rs = st.executeQuery("select * from books where status='Available'");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
        }
        System.out.println("Enter id to issue:");
        int i = sc.nextInt();
        PreparedStatement ps2 = con.prepareStatement("update books set status='Issued' where id=?");
        ps2.setInt(1, i);
        ps2.executeUpdate();
        System.out.println("Enter id to delete:");
        int d = sc.nextInt();
        PreparedStatement ps3 = con.prepareStatement("delete from books where id=?");
        ps3.setInt(1, d);
        ps3.executeUpdate();
        System.out.println("Final Data:");
        rs = st.executeQuery("select * from books");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
        }
        con.close();
        sc.close();
    }
}