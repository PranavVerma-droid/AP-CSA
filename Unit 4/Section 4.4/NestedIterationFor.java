public class NestedIterationFor {
    public static void main(String[] args) {
        for (int row = 1; row < 6; row++) {
            // Original loop inside
            for(int count = 1; count < 6; count++) {
                System.out.print(count * row + " " );
            }
            System.out.println();
        }
    }
}
