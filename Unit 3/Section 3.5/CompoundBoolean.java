public class CompoundBoolean {
    public static void main(String[] args) {
        /*
        There are three fundamental logical operators:
            NOT
            OR
            AND

        */

        /*
        AND is represented in Java as: &&. An expression using AND is true only when all its component parts are true. If any of the boolean values are false, the whole expression evaluates to false.
        For example, if it is 6:30am AND it is a school day, you should wake up. You can test the expression of “6:30am AND a school day.” If both are true, then the whole expression evaluates to true. If either or both are false, then the whole expression is false, and you should stay in bed.
        */
        boolean sixThirty = true;
        boolean schoolDay = false;
        System.out.println(sixThirty && schoolDay);  // because both values aren't true, it prints "false"


        // OR is represented in Java as ||. An expression using OR is true when all or any of its parts are true. It is only false when all of the boolean values are false.
        // Say that you are trying to decide whether to wear a coat today. You’ll wear your coat if it is raining right now or if it is cold outside. You can evaluate this expression based on the answers to those two boolean values. If it’s raining, cold, or raining and cold, then you will wear your coat. The only case in which you would not wear your coat is if it’s neither raining nor cold.

        boolean isRaining = true;
        boolean isCold = false;
        System.out.println(isRaining || isCold); // it's not cold, but it is raining, so it prints true

        // NOT is represented in Java as !. When placed in front of a boolean value, NOT causes the boolean to take on its opposite value. For example “NOT true” gives the answer “false.” This is fairly intuitive – if something is not true, then it must be false. Similarly, if something is not false, then it must be true.
        // The example below sets up a variable hungry as being true. Then it prints out NOT hungry.

        boolean hungry = true;
        System.out.println(!hungry);  // prints "false"
    } 
}
