// Need this to Use Array Lists.
import java.util.ArrayList;

public class ArrayListIntro {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<String> a2 = new ArrayList<String>(5);
        ArrayList<Cow> a3 = new ArrayList<Cow>();

        // You can only create ArrayList's with Objects.
        // You cannot store primitive values in Array lists, but there is a workaround for that, use Wrapper Classes.
        // Wrapper Classes like Integer, Double, Boolean can be used to store primitive values in Array Lists.
    }
}