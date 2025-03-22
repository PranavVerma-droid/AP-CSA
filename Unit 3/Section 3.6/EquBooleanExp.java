import java.util.Scanner;

public class EquBooleanExp {
    /*
    

    Augustus De Morgan was a British mathematician who devised two laws to help understand equivalent boolean expressions.
        not(A and B) is the same as (not A) or (not B)
        not(A or B) is the same as (not A) and (not B)
    Collectively these two laws are known as De Morgan’s Law. At the heart of these laws, De Morgan is saying that you can transform one 
    expression into an equivalent expression. In terms of boolean expressions, you saw that 2 expressions are equivalent if they both evaluate to the 
    same value for all cases. In the case of De Morgan’s law, that means that regardless of whether A is true or false and B is true or false, not(A and B) 
    will always be the same as (not A) or (not B). Likewise, not(A and B) will always be the same as (not A) and (not B).

     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Ask the user if they have a bike
        System.out.println("Do you have a bike? Enter true or false.");
        boolean hasBike = input.nextBoolean();
      
        //Ask the user if they have a helmet
        System.out.println("Do you have a helmet? Enter true or false.");
        boolean hasHelmet = input.nextBoolean();
        
        // Negating an AND statement. A person cannot bike if it's true 
        // that they do NOT have a helment AND a bike
        boolean cannotBike = !(hasBike && hasHelmet);
        
        // This is an equivalent statement as the Boolean statement 
        // above using De Morgan's Laws.
        // If a person either does NOT have a bike OR does NOT have a helmet,
        // he or she cannot bike
        boolean cannotBikeDeMorgan = !hasBike || !hasHelmet;
        
        // This checks the Boolean value of cannotBike to let the person 
        // know if they can bike or not.
        if(cannotBike)
        {
            System.out.println("You may not bike.");
        }
        else
        {
            System.out.println("You may bike!");
        }
        
        // This checks the Boolean value of cannotBikeDeMorgan to let the person 
        // know if they can bike or not. This will produce the SAME results
        // as the if-else above because of De Morgan's Laws!
        if(cannotBikeDeMorgan)
        {
            System.out.println("You may not bike with De Morgan.");
        }
        else
        {
            System.out.println("You may bike with De Morgan!");
        }
        
        // This checks (verifies in this case) that the 
        // 2 Boolean values are indeed equivalent
        if(cannotBike == cannotBikeDeMorgan)
        {
            System.out.println("De Morgan was right!");
        }
    }
}
