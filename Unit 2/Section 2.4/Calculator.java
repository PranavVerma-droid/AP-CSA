public class Calculator {

    public void calcAverage(double num1, double num2) {
        double average = (num1 + num2) / (double) 2;
        System.out.println("The Average is " + average);
    }

    public void calcAverage(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / (double) 3;
        System.out.println("The Average is " + average);
    }
    public static void main(String[] args) {
        Calculator myAwesomeAndFamousCalculator = new Calculator();

        myAwesomeAndFamousCalculator.calcAverage((double) 24, 23.4, 23);
    }   
}
