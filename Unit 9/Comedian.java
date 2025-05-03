import java.util.ArrayList;

public class Comedian extends Performer{
    private ArrayList<String> jokes;

    public Comedian(String n, int a) {
        super(n, a);
    }

    public void writeJoke(String joke) {
        jokes.add(joke);
    }

    // This will override the perform() function from Performer.java
    public void perform() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
    
}
