package JDBC;
import java.sql.*;
import java.util.*;
public class SimpleToDoTaskManager {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/test";
        String u = "root";
        String p = "root";
        Connection con = DriverManager.getConnection(url, u, p);
        Statement st = con.createStatement();
        st.executeUpdate("create table if not exists tasks(id int, title varchar(100), status varchar(20))");
        System.out.println("Enter id title status:");
        int id = sc.nextInt();
        String t = sc.next();
        String s = sc.next();
        PreparedStatement ps = con.prepareStatement("insert into tasks values(?,?,?)");
        ps.setInt(1, id);
        ps.setString(2, t);
        ps.setString(3, s);
        ps.executeUpdate();
        System.out.println("Pending tasks:");
        ResultSet rs = st.executeQuery("select * from tasks where status='Pending'");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
        System.out.println("Enter id to mark completed:");
        int i = sc.nextInt();
        PreparedStatement ps2 = con.prepareStatement("update tasks set status='Completed' where id=?");
        ps2.setInt(1, i);
        ps2.executeUpdate();
        st.executeUpdate("delete from tasks where status='Completed'");
        System.out.println("Final Data:");
        rs = st.executeQuery("select * from tasks");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
        con.close();
        sc.close();
    }
}