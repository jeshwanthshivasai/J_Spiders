public class Main {
    public static void main(String[] args) {
    Smartphone s = new Smartphone("pixel", 20000, "black", 3000, "Oct2021", 1);
    System.out.println("Details of the device are: ");
    s.display();
    Laptop l = new Laptop("Macbook", 70000, "silver", 5000, "Oct2020", 2);
    System.out.println("Details of the device are: ");
    l.display();
    Television t = new Television("Sony", 50000, "Black", 10000, "Oct2022", 3);
    System.out.println("Details of the device are: ");
    t.display();
    Watch w = new Watch("Rolex", 10000, "Silver", 10, "Jan2023", 1);
    System.out.println("Details of the device are: ");
    w.display();
    }
}