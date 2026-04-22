package JDBC;
import java.sql.*;
import java.util.*;
public class MovieTicketBookingSystem {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/test";
        String u = "root";
        String p = "root";
        Connection con = DriverManager.getConnection(url, u, p);
        Statement st = con.createStatement();
        st.executeUpdate("create table if not exists movies(id int, name varchar(50), seats int)");
        System.out.println("Enter id name seats:");
        int id = sc.nextInt();
        String n = sc.next();
        int s = sc.nextInt();
        PreparedStatement ps = con.prepareStatement("insert into movies values(?,?,?)");
        ps.setInt(1, id);
        ps.setString(2, n);
        ps.setInt(3, s);
        ps.executeUpdate();
        System.out.println("Available movies:");
        ResultSet rs = st.executeQuery("select * from movies where seats > 0");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
        }
        System.out.println("Enter movie id to book:");
        int i = sc.nextInt();
        System.out.println("Enter seats to book:");
        int b = sc.nextInt();
        PreparedStatement ps2 = con.prepareStatement("update movies set seats = seats - ? where id = ? and seats >= ?");
        ps2.setInt(1, b);
        ps2.setInt(2, i);
        ps2.setInt(3, b);
        ps2.executeUpdate();
        System.out.println("Enter movie id to delete:");
        int d = sc.nextInt();
        PreparedStatement ps3 = con.prepareStatement("delete from movies where id = ?");
        ps3.setInt(1, d);
        ps3.executeUpdate();
        System.out.println("Final Data:");
        rs = st.executeQuery("select * from movies");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
        }
        con.close();
        sc.close();
    }
}