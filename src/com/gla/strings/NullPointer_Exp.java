public class NullPointer_Exp {
    public static void generate_Exp() {
        String txt = null;
        txt.length();
    }
    public static void handle_Exp() {
        try {
            String txt = null;
            txt.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }
    public static void main(String[] args) {
        try {
            generate_Exp();
        } catch (NullPointerException e) {
            System.out.println("Exception generated");
        }
        handle_Exp();
    }
}
