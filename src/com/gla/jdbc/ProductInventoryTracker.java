package JDBC;
import java.sql.*;
import java.util.*;
public class ProductInventoryTracker {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/test";
        String u = "root";
        String p = "root";
        Connection con = DriverManager.getConnection(url, u, p);
        Statement st = con.createStatement();
        st.executeUpdate("create table if not exists product(pid int, pname varchar(50), qty int)");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter pid name qty:");
            int id = sc.nextInt();
            String n = sc.next();
            int q = sc.nextInt();
            PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, n);
            ps.setInt(3, q);
            ps.executeUpdate();
        }
        System.out.println("Low stock:");
        ResultSet rs = st.executeQuery("select * from product where qty < 10");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
        }
        System.out.println("Enter pid to update qty:");
        int id = sc.nextInt();
        System.out.println("Enter qty to add:");
        int add = sc.nextInt();
        PreparedStatement ps2 = con.prepareStatement("update product set qty = qty + ? where pid = ?");
        ps2.setInt(1, add);
        ps2.setInt(2, id);
        ps2.executeUpdate();
        System.out.println("Enter pid to delete:");
        int d = sc.nextInt();
        PreparedStatement ps3 = con.prepareStatement("delete from product where pid = ?");
        ps3.setInt(1, d);
        ps3.executeUpdate();
        System.out.println("Final Data:");
        rs = st.executeQuery("select * from product");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
        }
        con.close();
        sc.close();
    }
}