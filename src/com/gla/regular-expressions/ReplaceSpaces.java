package Regex;
import java.util.*;
public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String s = sc.nextLine();
        s = s.replaceAll("\\s+", " ");
        System.out.println(s);
        sc.close();
    }
}