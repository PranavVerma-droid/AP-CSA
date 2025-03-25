public class NestedIterationWhile {
    public static void main(String[] args) {
        int line = 1;
        while(line < 6) {
            int number = 1;
            while(number < 6) {
                System.out.print(number*line +" ");
                number++;
            }
            System.out.println();
            line++;
        }
    }
}
