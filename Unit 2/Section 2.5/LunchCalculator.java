public class LunchCalculator {
    public double calculateEachPersonBill(int noOfPersons, double totalBillAmount){
        return totalBillAmount / (double) noOfPersons;
    }
    public static void main(String[] args){
        LunchCalculator myLunchCalculator = new LunchCalculator();
        
        System.out.println(myLunchCalculator.calculateEachPersonBill(10, 1000));
    }
}
