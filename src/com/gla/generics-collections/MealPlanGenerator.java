import java.util.*;
interface MealPlan {
    String getType();
}
class VegetarianMeal implements MealPlan {
    public String getType() {
        return "Vegetarian";
    }
}
class VeganMeal implements MealPlan {
    public String getType() {
        return "Vegan";
    }
}
class KetoMeal implements MealPlan {
    public String getType() {
        return "Keto";
    }
}
class HighProteinMeal implements MealPlan {
    public String getType() {
        return "HighProtein";
    }
}
class Meal<T extends MealPlan> {
    T plan;
    Meal(T plan) {
        this.plan = plan;
    }
    void show() {
        System.out.println("Meal Plan: " + plan.getType());
    }
}
public class MealPlanGenerator {
    static <T extends MealPlan> void generateMeal(T plan) {
        Meal<T> m = new Meal<>(plan);
        m.show();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        if (ch == 1) generateMeal(new VegetarianMeal());
        else if (ch == 2) generateMeal(new VeganMeal());
        else if (ch == 3) generateMeal(new KetoMeal());
        else if (ch == 4) generateMeal(new HighProteinMeal());
        else System.out.println("Invalid Choice");
    }
}
