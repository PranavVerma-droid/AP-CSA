public class BalletDancer extends Dancer {
    public void jete() {
        System.out.println("Leaping...");
    }

    public void pirouette() {
        System.out.println("Spinning...");
    }

    /*
     * Override a method occurs when a subclass has the same method signature as a
     * superclass. When a method is overridden, Java uses the method from the
     * subclass.
     */
    public void perform() {
        jete();
        pirouette();
        super.perform();
    }
}