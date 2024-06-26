class Player {
    public static void play() {
        System.out.println("Playing");
    }
}
class Volleyball {
    public static void move() {
        System.out.println("Moving");
    }
}
public class PlayerMain {
    public static void main(String[] args) {
        Player.play();
        Volleyball.move();
    }
}