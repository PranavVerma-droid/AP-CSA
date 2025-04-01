public class Mutable {
    private int value;

    public Mutable(int start) {
        value = start;
    }
    
    public void incrementValue() {
        value++;
    }

    public int getValue() {
        return value;
    }
}
