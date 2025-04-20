import java.util.ArrayList;

public class TestingFile {
    public static void main(String[] args) {
        ArrayList<Boolean> questions = new ArrayList<Boolean>();

        questions.add(true);
        myMethod1(questions);
        System.out.println(questions.get(0));

    }

    public static void myMethod1(ArrayList<Boolean> arr) {
        if (arr.size() > 0) {
            arr.set(0, false);
        }
    }
}
