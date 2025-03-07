public class Frog {

    public void move(int numHops) {
        System.out.println("The Frog Moved Forward " + numHops + " hops.");
    }
    public void move() {
        System.out.println("The Frog Moved Forward 1 hop.");
    }
    public void move(String direction, int numHops) {
        System.out.println("The Frog Moved " + direction + " " + numHops + " hops.");
    }
    public static void main(String[] args) {
        Frog newFrog = new Frog();

        newFrog.move();
        newFrog.move(10);
        newFrog.move("Left", 10);
        newFrog.move("Right", 10);
    }
}
 