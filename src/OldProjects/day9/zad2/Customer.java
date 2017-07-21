package OldProjects.day9.zad2;

import java.util.HashSet;

/**
 * Created by sp0rk on 06/07/17.
 */
public class Customer {
    private HashSet<Ingredient> allergies = new HashSet<>();

    public void addAllergy(Ingredient ingredient) {
        allergies.add(ingredient);
    }

    public boolean isDead(Meal meal) {
        for (Ingredient ingredient : allergies) {
            if (meal.getIngredients().contains(ingredient)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String description = "Customer allergic to: ";
        for (Ingredient ingredient : allergies) {
            description += "<" + ingredient + ">, ";
        }
        return description;
    }

}

