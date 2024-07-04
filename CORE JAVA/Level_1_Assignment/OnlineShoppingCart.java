import java.util.zip.CheckedOutputStream;

public class OnlineShoppingCart {
    public void addItem() {
        System.out.println("Added Item");
        calculateTotal();
    }
    public void removeItem() {
        System.out.println("Removed Item");
        calculateTotal();
    }
    public void checkout() {
        System.out.println("Checked Out");
//        OnlineShoppingCart cart = new OnlineShoppingCart();
        addItem();
        removeItem();
        generateInvoice();
    }
    public static void calculateTotal() {
        System.out.println("Calculating Total");
    }
    public static void generateInvoice() {
        System.out.println("Generating Invoice");
        OnlineShoppingCart cart1 = new OnlineShoppingCart();
        cart1.checkout();
    }
    public static void main(String[] args) {
        OnlineShoppingCart cart2 = new OnlineShoppingCart();
        cart2.checkout();
    }
}
