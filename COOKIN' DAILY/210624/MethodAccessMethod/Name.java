package MethodAccessMethod;

public class Name {
    public static void main(String[] args) {
        System.out.println("Name Starts");
        Name name = new Name();
        name.boyname();
    }
    public void boyname() {
        System.out.println("Boy Name");
        girlname();
    }
    public void girlname() {
        System.out.println("Girl Name");
    }
}
