public class Musician extends Performer {
    private String instrument;

    public Musician() {
        super(); // super() will call the default constructores of the super class.
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
