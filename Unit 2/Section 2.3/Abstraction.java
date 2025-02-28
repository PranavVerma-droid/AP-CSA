public class Abstraction {
    public static void main(String[] args) {
        Letter myLetter = new Letter("Gracy");
        myLetter.writeLetter();
    }
}

class Letter {
    String personName = "";
    public Letter(String name) {
        personName = name;
    }

    public void writeLetter() {
        greet();
        closing();
    }

    private void greet() {
        System.out.println("Hello, " + personName + "!");
    }

    private void closing() {
        System.out.println("Goodbye!");
    }

}
