import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();

        System.out.println(a1.size()); // Will Output 0.

        a1.add(1);

        System.out.println(a1.size()); // Will Output 1.

        a1.add(1, 10); // add 10 to index 1

        System.out.println(a1.get(1) + a1.get(0)); // Will Output 11.

        a1.remove(a1.size() - 1); // Will Remove the Last Index.
    } 
}
