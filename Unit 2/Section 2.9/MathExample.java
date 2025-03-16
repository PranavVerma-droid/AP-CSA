public class MathExample {
    public static void main(String[] args) {
        // Note here these are all static methods called on
        // the Math class, not an instance. You can tell that
        // because we never made an object of the Math class
        // with the keyword new.
        int x = Math.abs(-5);
        System.out.println("Absolute value of -5: " + x);
        
        double cos0 = Math.cos(0);
        System.out.println("Cosine of 0: " + cos0);
        
        double squared = Math.pow(10, 2);
        System.out.println("10^2 = " + (int) squared);
        
        double cubed = Math.pow(9, 3);
        System.out.println("9^3 = " + (int) cubed);

        double ranNum = Math.random();
        System.out.println(ranNum);

        // Generates a random value from 0 to 10
        ranNum = Math.random() * 10;
        System.out.println(ranNum);

        // Generates a random value from 100 to 110
        ranNum = Math.random() * 10 + 100;
        System.out.println(ranNum);

        // Generates random integers between 50 and 75 (not including 75)
        ranNum = (int)(Math.random() * 25) + 50;
        System.out.println(ranNum);
    }
}
