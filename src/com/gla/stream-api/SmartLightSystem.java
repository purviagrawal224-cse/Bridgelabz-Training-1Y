package Lambda;
import java.util.*;
interface LightAct {
    void run();
}
public class SmartLightSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, LightAct> m = new HashMap<>();
        m.put("motion", () -> System.out.println("Motion -> Lights ON (100%)"));
        m.put("night", () -> System.out.println("Night -> Lights DIM (30%)"));
        m.put("voice", () -> System.out.println("Voice -> Lights COLOR change"));
        m.put("away", () -> System.out.println("Away Mode -> Lights OFF"));
        System.out.println("Enter room: ");
        String r = sc.next().toLowerCase();
        System.out.println("Enter trigger:");
        String t = sc.next().toLowerCase();
        if (m.containsKey(t)) {
            System.out.println("Room: " + r);
            m.get(t).run();
        }
	else System.out.println("Invalid trigger");
        sc.close();
    }
}