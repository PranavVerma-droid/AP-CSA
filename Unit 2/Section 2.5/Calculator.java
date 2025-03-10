class Calculator {

    public double calcAverage(double num1, double num2) {
        double average = (num1 + num2) / (double) 2;
        return average;
    }

    public double calcAverage(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / (double) 3;
        return average;
    }
    public static void main(String[] args) {
        Calculator myAwesomeAndFamousCalculator = new Calculator();

        System.out.println(myAwesomeAndFamousCalculator.calcAverage((double) 24, 23.4, 23));
    }   
}
