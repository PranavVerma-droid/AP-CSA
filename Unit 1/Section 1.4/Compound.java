// Compound Assignment Operators Demonstration

public class Compound {
    public static void main(String[] args){
        int x = 0;

        /*  Instructions when using Compound Operators:        
         * 1. Take the Value Currently Stored in 'x'
         * 2. Add 7 to it.
         * 3. Assign the Result back to 'x'
         */

        x += 7;
        x = x + 7;
        // Both of the Above are the Same.

        System.out.println(x);

        x %= 10;
        System.out.println(x);
    }
}
