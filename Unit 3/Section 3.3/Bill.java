public class Bill
{
	private double costOfMeal;
	private int totalCustomers;

    // Constructor
	public Bill(double totalBill, int numCustomers)
	{
		costOfMeal = totalBill;
		totalCustomers = numCustomers;
	}
	
	// Add a tip based on the number of guests
	public void addTip()
    {
        if(totalCustomers >= 8)
        {
        	costOfMeal *= 1.25;   //OR costOfMeal += costOfMeal * .25
        }
        else
        {
        	costOfMeal *= 1.20;   //OR costOfMeal += costOfMeal * .20
        }
    }


    public String toString()
    {
        // Round the bill to two decimal places
        double roundedBill = Math.round(costOfMeal * 100.0) / 100.0;
        
        return "Bill for " + totalCustomers + " comes to $" + roundedBill;
    }
	
	
}
