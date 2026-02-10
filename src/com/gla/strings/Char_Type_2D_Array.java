import java.util.Scanner;
public class Char_Type_2D_Array {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static String checkType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "Vowel";
            else return "Consonant";
        }
        if (ch >= '0' && ch <= '9') return "Digit";
        return "Special";
    }
    public static String[][] create2DArray(String str) {
        int len = findLength(str);
        String[][] data = new String[len][2];
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            data[i][0] = String.valueOf(ch);
            data[i][1] = checkType(ch);
        }
        return data;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String txt = sc.nextLine();
        String[][] res = create2DArray(txt);
        System.out.println("Char\tType");
        for (int i = 0; i < res.length; i++) System.out.println(res[i][0] + "\t" + res[i][1]);
    }
}
