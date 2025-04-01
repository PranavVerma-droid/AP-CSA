public class Cow {
    private String cowType;
    private String cowSound;
    private int numMilkings;

    // Constructors
    public Cow() {
        cowType = "";
        cowSound = "moo";
        numMilkings = 0;
    }

    public Cow(String type) {
        cowType = type;
        cowSound = "moo";
        numMilkings = 0;
    }

    public Cow(String type, String sound) {
        cowType = type;
        cowSound = sound;
        numMilkings = 0;
    }

    // Getter Methods
    public String getType() {
        return cowType;
    }

    public String getSound() {
        return cowSound;
    }

    public int getNumMilkings() {
        return numMilkings;
    }

    // Void Methods
    public void milkCow() {
        numMilkings = numMilkings + 1;
    }

    public void milkCow(int numberOfTimes) {
        numMilkings = numMilkings + numberOfTimes;
    }
}
