/*
 * Casting in Java Demo.
 * Change the Data type of a variable from one type to another.
 * 
 * Casting Operators: (DATA_TYPE)
 */

public class Casting {
    public static void main(String[] args) {
        System.out.println(6 / 4); // Result: int
        System.out.println(6.0 / 4); // Result: double
        System.out.println(6 / 4.0); // Result: double
        System.out.println((double) 6 / 4); // Result: double


        double number = 11.0 / 4;
        int roundedNumber = (int) (number + 0.5);

        double negativeNumber = -number;
        int roundedNegativeNumber = (int) (negativeNumber - 0.5);


        System.out.println(number);
        System.out.println(roundedNumber);
        System.out.println(roundedNegativeNumber);
    }
}