public class Num_Format_Exp {
    public static void generate_Exp() {
        String txt = "abc";
        int num = Integer.parseInt(txt);
        System.out.println(num);
    }
    public static void handle_Exp() {
        try {
            String txt = "abc";
            int num = Integer.parseInt(txt);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        }
    }
    public static void main(String[] args) {
        try {
            generate_Exp();
        } catch (NumberFormatException e) {
            System.out.println("Exception generated");
        }
        handle_Exp();
    }
}