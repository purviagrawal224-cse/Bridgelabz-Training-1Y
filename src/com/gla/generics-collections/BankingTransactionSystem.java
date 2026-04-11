import java.util.*;
class Transaction {
    int id;
    String acc;
    double amt;
    Transaction(int id, String acc, double amt) {
        this.id = id;
        this.acc = acc;
        this.amt = amt;
    }
    public String toString() {
        return id + " " + acc + " " + amt;
    }
}
class Account {
    String id;
    Account(String id) {
        this.id = id;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account a = (Account) o;
        return id.equals(a.id);
    }
    public int hashCode() {
        return Objects.hash(id);
    }
}
public class BankingTransactionSystem {
    public static void main(String[] args) {
        List<Transaction> all = new ArrayList<>();
        Queue<Transaction> q = new LinkedList<>();
        Set<Account> accs = new HashSet<>();
        accs.add(new Account("A1"));
        accs.add(new Account("A2"));
        Stack<Transaction> st = new Stack<>();
        q.add(new Transaction(1, "A1", 1000));
        q.add(new Transaction(2, "A3", 2000));
        q.add(new Transaction(3, "A2", 1500));
        while (!q.isEmpty()) {
            Transaction t = q.remove();
            if (accs.contains(new Account(t.acc))) {

                System.out.println("Processed: " + t);
                all.add(t);
                st.push(t);

            }
	    else System.out.println("Invalid Account: " + t);
        }
        System.out.println("Rollback Last Transaction:");
        if (!st.isEmpty()) {
            Transaction t = st.pop();
            all.remove(t);
            System.out.println("Rolled Back: " + t);
        }
        System.out.println("Final Transactions:");
        for (Transaction t : all) {
            System.out.println(t);
        }
    }
}