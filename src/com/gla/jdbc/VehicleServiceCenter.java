package JDBC;
import java.sql.*;
import java.util.*;
public class VehicleServiceCenter {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/test";
        String u = "root";
        String p = "root";
        Connection con = DriverManager.getConnection(url, u, p);
        Statement st = con.createStatement();
        st.executeUpdate("create table if not exists vehicles(regNo varchar(20), owner varchar(50), status varchar(20))");
        System.out.println("Enter regNo owner status:");
        String r = sc.next();
        String o = sc.next();
        String s = sc.next();
        PreparedStatement ps = con.prepareStatement("insert into vehicles values(?,?,?)");
        ps.setString(1, r);
        ps.setString(2, o);
        ps.setString(3, s);
        ps.executeUpdate();
        System.out.println("Pending vehicles:");
        ResultSet rs = st.executeQuery("select * from vehicles where status='Pending'");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
        System.out.println("Enter regNo to update:");
        String x = sc.next();
        PreparedStatement ps2 = con.prepareStatement("update vehicles set status='Completed' where regNo=?");
        ps2.setString(1, x);
        ps2.executeUpdate();
        System.out.println("Enter regNo to delete:");
        String d = sc.next();
        PreparedStatement ps3 = con.prepareStatement("delete from vehicles where regNo=?");
        ps3.setString(1, d);
        ps3.executeUpdate();
        System.out.println("Final Data:");
        rs = st.executeQuery("select * from vehicles");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
        con.close();
        sc.close();
    }
}