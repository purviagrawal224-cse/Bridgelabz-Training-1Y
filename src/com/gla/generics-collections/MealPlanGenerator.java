import java.util.*;
interface MealPlan {
    void show();
}
class VegetarianMeal implements MealPlan {
    String n;
    VegetarianMeal(String n) {
        this.n = n;
    }
    public void show() {
        System.out.println("Vegetarian: " + n);
    }
}
class VeganMeal implements MealPlan {
    String n;
    VeganMeal(String n) {
        this.n = n;
    }
    public void show() {
        System.out.println("Vegan: " + n);
    }
}
class KetoMeal implements MealPlan {
    String n;
    KetoMeal(String n) {
        this.n = n;
    }
    public void show() {
        System.out.println("Keto: " + n);
    }
}
class HighProteinMeal implements MealPlan {
    String n;
    HighProteinMeal(String n) {
        this.n = n;
    }
    public void show() {
        System.out.println("HighProtein: " + n);
    }
}
class Meal<T extends MealPlan> {
    ArrayList<T> l = new ArrayList<>();
    void addMeal(T x) {
        l.add(x);
    }
    void displayMeals() {
        for (T i : l) {
            i.show();
        }
    }
}
public class MealPlanGenerator {
    static <T extends MealPlan> void generateMeal(T m) {
        m.show();
    }
    public static void main(String[] args) {
        Meal<VegetarianMeal> v = new Meal<>();
        v.addMeal(new VegetarianMeal("Salad"));
        v.addMeal(new VegetarianMeal("Paneer"));
        Meal<VeganMeal> vg = new Meal<>();
        vg.addMeal(new VeganMeal("Tofu"));
        vg.addMeal(new VeganMeal("Smoothie"));
        System.out.println("Vegetarian Meals:");
        v.displayMeals();
        System.out.println("Vegan Meals:");
        vg.displayMeals();
        System.out.println("Generated Meal:");
        generateMeal(new KetoMeal("Keto Salad"));
        generateMeal(new HighProteinMeal("Chicken Bowl"));
    }
}