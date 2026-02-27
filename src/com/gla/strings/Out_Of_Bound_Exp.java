public class Out_Of_Bound_Exp {
    public static void generate_Exp() {
        String txt = "Java";
        System.out.println(txt.charAt(10));
    }
    public static void handle_Exp() {
        try {
            String txt = "Java";
            System.out.println(txt.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }
    public static void main(String[] args) {
        try {
            generate_Exp();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception generated");
        }
        handle_Exp();
    }
}