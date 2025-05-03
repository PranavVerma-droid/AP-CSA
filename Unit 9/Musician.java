public class Musician extends Performer {
    private String instrument;

    public Musician() {
        /*
         * A Java keyword used to refer to the superclass object. In this lesson we saw
         * it used to call the superclass constructor and other methods from the
         * superclass.
         */
        super();
        instrument = "Piano";
    }

    public Musician(String inst) {
        instrument = inst;
    }

    public Musician(String inst, String n, int a) {
        super(n, a); // This will call the custom constructor.
        instrument = inst;
    }

    public String getInstrument() {
        return instrument;
    }

    public void playInstrument() {
        System.out.println("Playing Now!");
    }
}
