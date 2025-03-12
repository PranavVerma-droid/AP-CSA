public class stringObjects {
    public static void main(String[] args) {
        /*
         * Concatenate is a fancy word for joining or linking two things together. To concatenate two or more Strings means that you are 
         * joining them together to form one String. You can do this in Java by using the addition operator, +, or +=.
         * In this example, you concatenate two separate Strings, "Mc" and "Donald's", to form one String, "McDonald's".
         */
        String one = "Mc";
        String two = "Donald's";
        String concatenate = one + two;
        System.out.println(concatenate);

        int number = 24;
        System.out.println("This String is concatenated with an integer at the end: " + number);
        // You can also concatenate Strings with other primitive types like char, boolean, and double. 
        // When you concatenate a String with a primitive variable, 
        // there is an implicit conversion of the primitive variable to a String to perform the conversion.


        /*In Java, you create string literals using quotation marks, but what if you want to print a string with quotes, for example "Hello, Karel," said Tracy.
        Java uses the concept of an escape sequence to essentially send a signal to the compiler to treat a character a little differently. In Java, the escape character is a backslash, \. When Java sees a backslash inside of quotation marks, 
        it knows that it is a signal to treat the next character differently within the literal string. For example, if you want to include quotation marks in your output, you would use a \".  */

        // Print "Hello, Karel," said Tracy
        System.out.println("\"Hello, Karel,\" said Tracy");

        /*
          -  \" 	"\"Allows for quotations\"" 	"Allows for quotations"
          -  \\ 	 "Includes a backslash\\" 	    Includes a backslash\
          -  \n 	 "This creates \na line break" 	This creates a 
                                                    line break
          -  \t 	 "This adds a \ttab space" 	    This adds a   tab space
         */

                // Create a String
                String stats = "Health: 100";
                System.out.println("Newly created: " + stats);
                
                // This line does nothing
                // In fact, it throws an error
                // Concatenation creates a NEW String
                // You have to store the new String
                
                // stats + "\n" + "Speed: 75";
                
                // This line updates stats to 
                // refer to the new String
                stats += "\n" + "Speed: 75";
                
                // The \n before Updated adds an extra
                // line between the last print statement
                // and this one
                System.out.println("\nUpdated: ");
                System.out.println(stats);
                
                // You don't have to separate the 
                // escape characters
                stats += "\nPower: 94";
                
                // Note there is no space between \n and Combining
                // A space would put a space as the first
                // character of the line before Combining
                System.out.println("\nCombining escape characters: ");
                System.out.println(stats);
                
                
                // What if we wanted Power to be 96?
                // We can't modify the string
                // Have to create a new one entirely
                // This one creates the entire string all at once
                stats = "Health: 100\nSpeed: 75\nPower: 96";
                System.out.println(); // print a blank line
                System.out.println(stats);


        // Be careful when concatenating Strings!
        // The + operator works from left to right
        // Sometimes the result is not what you'd expect:
        
        System.out.println("Testing Out String Concatenation!");
        System.out.println("=================================");
        System.out.println();
        
        // int + int + String
        String testString1 = 5 + 5 + "hello";
        System.out.println("5 + 5 + \"hello\" = " + testString1);
        System.out.println("The first '+' adds 5 + 5, resulting in 10");
        System.out.println("The second '+' adds 10 + \"hello\", resulting in \"10hello\"");
        System.out.println();
        
        // String + int + int
        String testString2 = "hello" + 5 + 5;
        System.out.println("\"hello\" + 5 + 5 = " + testString2);
        System.out.println("The first '+' adds \"hello\" + 5, resulting in \"hello5\"");
        System.out.println("The second '+' adds \"hello5\" + 5, resulting in \"hello55\"");
        System.out.println();
        
        // String + (int + int)
        String testString3 = "hello" + (5 + 5);
        System.out.println("\"hello\" + (5 + 5) = " + testString3);
        System.out.println("Parentheses take precedence over '+'");

        /*
         * Rectangle is the name of the class. Every Rectangle
         * has a width and a height. But the specific instances
         * have their own dimensions.
         */
        Rectangle r1 = new Rectangle(10, 2);
        System.out.println(r1.printDims());
        
        // Rectangle is the class and also the type of this object.
        Rectangle r2 = new Rectangle(5, 15);
        System.out.println(r2.printDims());
    }
}
