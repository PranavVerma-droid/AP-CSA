public class Boolean1 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        boolean loggedIn = false;

        System.out.println("User logged in?: " + loggedIn);

        /*
         * Comparison operators allow you to compare two values against one another. A comparison returns a boolean result of either true or false.

            The table below lists each of the common comparison operators and their usages:
            Operator 	Usage
            
            > 	        Greater Than
            < 	        Less Than
            >= 	        Greater Than Or Equal To
            <= 	        Less Than Or Equal To
            == 	        Equal To
            != 	        Not Equal To
         */


        int x_1 = 10;
        int y_1 = 8;
        boolean z_1 = x_1 > y_1;
        System.out.println(z_1);

        // Declare some integer variables to use for practice comparisons below.
        int a = 3;
        int b = 5;
        int c = 2;
        int d = 3;

        // You store the boolean results of each comparison into boolean variables t-z.
        boolean t = a > 0; // true
        boolean u = a == d; // true
        boolean v = d >= b; // false
        boolean w = b > c; // true
        boolean x = a != d; // false
        boolean y = d <= a; // true
        boolean z = 4 <= c; // false

        boolean boolComparison1 = t == u; // true
        boolean boolComparison2 = t == w; // true
        boolean boolComparison3 = t != u; // false
        boolean boolComparison4 = x != y; // true
    }
}
