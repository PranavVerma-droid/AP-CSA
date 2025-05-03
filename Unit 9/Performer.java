public class Performer {
    private String name;
    private int age;

    public Performer() {
        name = "A Generic Perfomer";
        age = 18;
    }

    public Performer(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void practice() {
        System.out.println("I'm Practicing Now!");
    }

    public void perform() {
        System.out.println("I'm Performing Now!");
    }

    public static void main(String[] args) {
        /*
         * An object can take on different forms depending on its implementation. Java
         * can call the correct method even when an object is disguised as a more
         * generic reference type
         */

         Performer myStudent = new BalletDancer();
    }
}
