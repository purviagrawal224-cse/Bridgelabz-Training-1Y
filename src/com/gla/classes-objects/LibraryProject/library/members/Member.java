package library.members;
public class Member {
    private int id;
    private String n;
    public Member(int id, String n) {
        this.id = id;
        this.n = n;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return n;
    }
    public void show() {
        System.out.println("Member ID : " + id);
        System.out.println("Name      : " + n);
    }
}