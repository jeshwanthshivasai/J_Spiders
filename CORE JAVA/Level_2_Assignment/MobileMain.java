class Mobile {
    public void storePower() {
        System.out.println("Storing Power");
    }
}
class Charger {
    public void providePower() {
        System.out.println("Charging");
    }
}
class MobileMain {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.storePower();
        Charger charger = new Charger();
        charger.providePower();
    }       
}
