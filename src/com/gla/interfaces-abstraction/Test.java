interface A {
    default void show() {
        System.out.println("A show");
    }
}
interface B {
    default void show() {
        System.out.println("B show");
    }
}
class C implements A, B {
    public C() {
        System.out.println("Object created");
    }
    @Override
    public void show() {
        A.super.show();
        B.super.show();
        System.out.println("C show");
    }
}
public class Test {
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}