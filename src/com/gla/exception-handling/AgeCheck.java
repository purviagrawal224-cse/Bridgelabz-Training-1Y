import java.util.*;
class InvalidAgeException extends Exception {
    InvalidAgeException(String m){
        super(m);
    }
}
public class AgeCheck {
    static void v(int a) throws InvalidAgeException {
        if(a < 18){
            throw new InvalidAgeException("x");
        }
        System.out.println("Access granted!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int a = sc.nextInt();
            v(a);
        }
        catch(InvalidAgeException e){
            System.out.println("Age must be 18 or above");
        }
    }
}