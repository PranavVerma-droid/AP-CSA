import java.util.ArrayList;

public class TraversingArrayLists {
    public static void main(String[] args) {
        int sum = 0;
        ArrayList<String> roster = new ArrayList<String>(10);

        for (int i = 0; i <= roster.size() - 1; i++) {
            sum = sum + roster.get(i).length();
        }

        System.out.println(sum);

        // Using Enhanced For Loops

        sum = 0;

        for (String name : roster) {
            sum = sum + name.length();
        }

        System.out.println(sum);
    }
}
