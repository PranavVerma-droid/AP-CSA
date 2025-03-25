public class forLoop {
    public static void main(String[] args) {
        // Part 1: Initialize
        // The first part of a for loop initializes some variable. In the example above, int i = 0 initially sets the variable i equal to 0.

        // Part 2: Condition
        // The second part of a for loop tests a condition. If the condition is true, the code within the for loop executes. If the condition is false, the code within the for loop is skipped. In the example above, i < 3 compares the current value of our variable i to determine if it is less than 3. Each time i is less than 3, the value of i will be printed to the screen. This happens three times.

        // Part 3: Increment/Decrement
        // The third part of a for loop changes the variable after each time the loop runs. Remember, i++ means 1 is added to i. It is incremented. Conversely, i-- means 1 is subtracted from i. It is decremented.
        for (int i = 0; i < 1; i++) 
        {  
            // Code segment that is executed COUNT times. 
            System.out.println("For Loop Works!");
        } 
    }
}
