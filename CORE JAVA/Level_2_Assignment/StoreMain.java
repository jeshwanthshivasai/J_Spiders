class Store {
    public void sellProduct() {
        System.out.println("Selling Product");
        Product.displayDetails();
    }
    public void restockProduct() {
        System.out.println("Restocking Product");
    }
    public void checkInventory() {
        System.out.println("Checking Inventory");
    }
}
class Product {
    public static void displayDetails() {
        System.out.println("Displaying Product Details");
        Store s1 = new Store();
        s1.checkInventory();
    }
    public static void orderProduct() {
        System.out.println("Ordering Product");
        Store s2 = new Store();
        s2.restockProduct();
    }
}
class Category {
    public static void createCategory() {
        System.out.println("Creating Category");
        Store s3 = new Store();
        s3.sellProduct();
    }
    public void categorizeProduct() {
        System.out.println("Categorizing Product");
        Product.orderProduct();
    }
}
public class StoreMain {
    public static void main(String[] args) {
        Store s4 = new Store();
        s4.sellProduct();
        Product.orderProduct();
        Category c = new Category();
        c.categorizeProduct();
    }
}
