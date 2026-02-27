import java.util.Scanner;
public class Replace_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String sent = sc.nextLine();
        System.out.print("Enter word to replace : ");
        String old_Word = sc.nextLine();
        System.out.print("Enter new word : ");
        String new_Word = sc.nextLine();
        String[] words = sent.split(" ");
        String res = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(old_Word)) res += new_Word + " ";
            else res += words[i] + " ";
        }
        System.out.println("Modified Sentence is "+ res.trim());
        sc.close();
    }
}