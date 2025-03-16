public class Wrapper {
    public static void main(String[] args) {
        /*
         * Autoboxing is the automatic conversion that the Java compiler makes between primitive types and their corresponding object wrapper classes. This includes converting an int to an Integer and a double to a Double. 
        */

        Double varDbl = 15.3;
        double dbNum = varDbl.doubleValue();    // non-static method

        System.out.println("Value of double: " + dbNum);
        System.out.println("Max Integer Value: " + Integer.MAX_VALUE);    // static method

                // Explictly create an integer
                Integer x = new Integer(12);
        
                // Use autoboxing to have
                // Java convert the integer value
                // to an Integer object
                // Autoboxing: turning an int into an Integer
                Integer y = 12;
                
                // Use unboxing to convert the Integer
                // back to an int to print
                System.out.println("x: " + x);
                System.out.println("y: " + y);
                
                
                // Use the methods to get the values
                // of x and y
                int sum = x.intValue() + y.intValue();
                String equation = x.toString() + " + " + y.toString();
                equation += " = " + sum;
                System.out.println(equation);
                
                // Can use Integers exactly like
                // you can use ints because
                // of unboxing
                // Unboxing: turning an Integer into an int
                int difference = x - y;
                equation = x + " - " + y + " = " + difference;
                System.out.println(equation);
    }
}