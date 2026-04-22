package JDBC;
import java.sql.*;
import java.util.*;
public class BankingAccountManager {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/test";
        String u = "root";
        String p = "root";
        Connection con = DriverManager.getConnection(url, u, p);
        Statement st = con.createStatement();
        st.executeUpdate("create table if not exists accounts(accNo int, name varchar(50), balance double)");
        System.out.println("Enter accNo name balance:");
        int a = sc.nextInt();
        String n = sc.next();
        double b = sc.nextDouble();
        PreparedStatement ps = con.prepareStatement("insert into accounts values(?,?,?)");
        ps.setInt(1, a);
        ps.setString(2, n);
        ps.setDouble(3, b);
        ps.executeUpdate();
        System.out.println("Balance > 10000:");
        ResultSet rs = st.executeQuery("select * from accounts where balance > 10000");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
        }
        System.out.println("Enter accNo:");
        int x = sc.nextInt();
        System.out.println("1.Deposit 2.Withdraw");
        int ch = sc.nextInt();
        System.out.println("Enter amount:");
        double amt = sc.nextDouble();
        PreparedStatement ps2;
        if (ch == 1) ps2 = con.prepareStatement("update accounts set balance = balance + ? where accNo = ?");
        else ps2 = con.prepareStatement("update accounts set balance = balance - ? where accNo = ?");
        ps2.setDouble(1, amt);
        ps2.setInt(2, x);
        ps2.executeUpdate();
        System.out.println("Enter accNo to delete:");
        int d = sc.nextInt();
        PreparedStatement ps3 = con.prepareStatement("delete from accounts where accNo = ?");
        ps3.setInt(1, d);
        ps3.executeUpdate();
        System.out.println("Final Data:");
        rs = st.executeQuery("select * from accounts");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
        }
        con.close();
        sc.close();
    }
}