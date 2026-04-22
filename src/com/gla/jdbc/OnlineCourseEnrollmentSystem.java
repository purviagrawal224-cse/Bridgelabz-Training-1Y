package JDBC;
import java.sql.*;
import java.util.*;
public class OnlineCourseEnrollmentSystem {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/test";
        String u = "root";
        String p = "root";
        Connection con = DriverManager.getConnection(url, u, p);
        Statement st = con.createStatement();
        st.executeUpdate("create table if not exists enrollments(id int, student varchar(50), course varchar(50))");
        System.out.println("Enter id student course:");
        int id = sc.nextInt();
        String s = sc.next();
        String c = sc.next();
        PreparedStatement ps = con.prepareStatement("insert into enrollments values(?,?,?)");
        ps.setInt(1, id);
        ps.setString(2, s);
        ps.setString(3, c);
        ps.executeUpdate();
        System.out.println("Enter course to search:");
        String x = sc.next();
        PreparedStatement ps2 = con.prepareStatement("select * from enrollments where course=?");
        ps2.setString(1, x);
        ResultSet rs = ps2.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
        System.out.println("Enter id to update course:");
        int i = sc.nextInt();
        System.out.println("Enter new course:");
        String nc = sc.next();
        PreparedStatement ps3 = con.prepareStatement("update enrollments set course=? where id=?");
        ps3.setString(1, nc);
        ps3.setInt(2, i);
        ps3.executeUpdate();
        System.out.println("Enter id to delete:");
        int d = sc.nextInt();
        PreparedStatement ps4 = con.prepareStatement("delete from enrollments where id=?");
        ps4.setInt(1, d);
        ps4.executeUpdate();
        System.out.println("Final Data:");
        rs = st.executeQuery("select * from enrollments");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
        con.close();
        sc.close();
    }
}