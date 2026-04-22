package JDBC;
import java.sql.*;
import java.util.*;
public class HospitalPatientRecordSystem {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/test";
        String u = "root";
        String p = "root";
        Connection con = DriverManager.getConnection(url, u, p);
        Statement st = con.createStatement();
        st.executeUpdate("create table if not exists patients(id int, name varchar(50), disease varchar(50))");
        System.out.println("Enter id name disease:");
        int id = sc.nextInt();
        String n = sc.next();
        String d = sc.next();
        PreparedStatement ps = con.prepareStatement("insert into patients values(?,?,?)");
        ps.setInt(1, id);
        ps.setString(2, n);
        ps.setString(3, d);
        ps.executeUpdate();
        System.out.println("Enter disease to search:");
        String s = sc.next();
        PreparedStatement ps2 = con.prepareStatement("select * from patients where disease = ?");
        ps2.setString(1, s);
        ResultSet rs = ps2.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
        System.out.println("Enter id to update disease:");
        int i = sc.nextInt();
        System.out.println("Enter new disease:");
        String nd = sc.next();
        PreparedStatement ps3 = con.prepareStatement("update patients set disease=? where id=?");
        ps3.setString(1, nd);
        ps3.setInt(2, i);
        ps3.executeUpdate();
        System.out.println("Enter id to delete:");
        int x = sc.nextInt();
        PreparedStatement ps4 = con.prepareStatement("delete from patients where id=?");
        ps4.setInt(1, x);
        ps4.executeUpdate();
        System.out.println("Final Data:");
        rs = st.executeQuery("select * from patients");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
        con.close();
        sc.close();
    }
}