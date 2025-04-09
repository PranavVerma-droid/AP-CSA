public class TraverseArrays {
    public static void main(String[] args) {
        // Traversing means accessing each element.

        // Creates a new list like this:
        // [0, 0, 0, 0, 0]
        int [] list = new int[5];

        for (int index = 0; index < list.length; index++) {
            list[index] = (int) (Math.random() * 10);
        }
    }
}