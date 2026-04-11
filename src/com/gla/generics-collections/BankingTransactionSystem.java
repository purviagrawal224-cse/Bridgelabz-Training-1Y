import java.util.*;
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
class Transaction {
    String accId;
    int amount;
    Transaction(String accId, int amount) {
        this.accId = accId;
        this.amount = amount;
    }
    public String toString() {
        return accId + " " + amount;
    }
}
public class BankingTransactionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Account> accounts = new HashSet<>();
        Map<String, Account> map = new HashMap<>();
        Queue<Transaction> q = new LinkedList<>();
        Stack<Transaction> st = new Stack<>();
        List<Transaction> history = new ArrayList<>();
        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            Account a = new Account(id);
            accounts.add(a);
            map.put(id, a);
        }
        System.out.print("Enter number of transactions: ");
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String id = sc.nextLine();
            int amt = sc.nextInt();
            sc.nextLine();
            if (!map.containsKey(id)) {
                System.out.println("Invalid account: " + id);
                continue;
            }
            q.add(new Transaction(id, amt));
        }
        System.out.println("Processing Transactions:");
        while (!q.isEmpty()) {
            Transaction t = q.remove();
            System.out.println("Processed: " + t);
            history.add(t);
            st.push(t);
        }
        System.out.println("Rollback last transaction? (yes/no)");
        String ans = sc.nextLine();
        if (ans.equalsIgnoreCase("yes") && !st.isEmpty()) {
            Transaction t = st.pop();
            history.remove(t);
            System.out.println("Rolled back: " + t);
        }
        System.out.println("Final Transactions:");
        for (Transaction t : history) System.out.println(t);
    }
}
