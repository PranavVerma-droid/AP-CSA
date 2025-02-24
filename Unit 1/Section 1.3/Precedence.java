// Operator Precedence Demonstration

public class Precedence {
    public static void main(String[] args) {
        /* Operator Precedence:
         * 1. [() (Parenthesis)] => Left to Right
         * 2. [* (Multiplication), / (Division), % (Modulus)] => Left to Right 
         * 3. [+ (Addition), - (Subtraction)] => Left to Right
         * 4. [= (Assignment)] => Right to Left
        */

        System.out.println(8 * 6 - 14 % 3 + 8 / 2); // Output: 50
    }
}
