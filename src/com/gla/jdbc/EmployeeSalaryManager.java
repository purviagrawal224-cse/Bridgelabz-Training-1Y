package JDBC;
import java.sql.*;
import java.util.*;
public class EmployeeSalaryManager {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/test";
        String u = "root";
        String p = "root";
        Connection con = DriverManager.getConnection(url, u, p);
        Statement st = con.createStatement();
        st.executeUpdate("create table if not exists employee(id int, name varchar(50), salary double)");
        System.out.println("Enter id name salary: ");
        int id = sc.nextInt();
        String n = sc.next();
        double s = sc.nextDouble();
        PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
        ps.setInt(1, id);
        ps.setString(2, n);
        ps.setDouble(3, s);
        ps.executeUpdate();
        System.out.println("Salary > 30000:");
        ResultSet rs = st.executeQuery("select * from employee where salary > 30000");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
        }
        System.out.println("Enter id to increase salary:");
        int i = sc.nextInt();
        PreparedStatement ps2 = con.prepareStatement("update employee set salary = salary * 1.1 where id = ?");
        ps2.setInt(1, i);
        ps2.executeUpdate();
        st.executeUpdate("delete from employee where salary < 15000");
        System.out.println("Final Data:");
        rs = st.executeQuery("select * from employee");
        while (rs.next()){
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
        }
        con.close();
        sc.close();
    }
}