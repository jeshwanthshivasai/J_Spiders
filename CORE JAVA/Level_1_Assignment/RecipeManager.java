public class RecipeManager {
    public void addIngredient() {
        System.out.println("Added Ingredient");
        RecipeManager rp1 = new RecipeManager();
        rp1.removeIngredient();
        rp1.prepareRecipe();
    }
    public void removeIngredient() {
        System.out.println("Removed Ingredient");
        calculateTotalCalories();
    }
    public void prepareRecipe() {
        System.out.println("Prepared Recipe");
    }
    public static void calculateTotalCalories() {
        System.out.println("Calculating Total Calories");
    }
    public static void printRecipe() {
        System.out.println("Printing Recipe");
    }
    public static void main(String[] args) {
        RecipeManager rp = new RecipeManager();
        rp.prepareRecipe();
    }
}
