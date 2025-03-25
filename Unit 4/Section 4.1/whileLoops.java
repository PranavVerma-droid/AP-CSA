public class whileLoops {
    public static void main(String[] args) {
        // As long as the boolean expression remains true, code within the while loop will be executed. 
        // The moment that the boolean expression becomes false, code outside of the while loop will be executed; the loop is done. 
        int i = 1;
        while (i == 1) {
            System.out.println("While Loop Works!");
            i += 1;
        }

        i = 5;
        System.out.println("Initiating countdown:");
        while(i >= 0) {
        System.out.println(i + "...");
        i--;
        }

        // You first declare a variable i and set it equal to 5. Before the while loop, you print out a message letting the user know that the countdown is about to begin. Your while loop starts by checking to see if the boolean expression, i >= 0, is true. The current value of i is 5. 5 >= 0 is true, so the code within the while loop gets executed. It prints out the number 5 and then decrements it by subtracting 1.

        // i is now set to 4. Our while loop then checks to see if 4 >= 0. Since this condition is still true, the code within the while loop gets executed again. This will continue until i gets down to 0. After 0 gets printed to the screen, you decrement i so that it is now set to -1. Your while loop tests to see if -1 >= 0. Since -1 is not greater than or equal to 0, the boolean expression is false. The code within the while loop is skipped. The while loop has finished its execution.
    }
}