import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double mealCost = 0.0;
        double tipCost = 0.0;
        double taxCost = 0.0;
        
        int tipPercent = 0;
        int taxPercent = 0;
        
        int totalCost = 0;
        
        //get input values
        mealCost = scan.nextDouble(); // original meal price
        tipPercent = scan.nextInt(); // tip percentage
        taxPercent = scan.nextInt(); // tax percentage
        
        //validation TODO
        //negative values
        
        scan.close();
      
        //Calculation
        tipCost = mealCost * (tipPercent/100.);
        taxCost = mealCost * (taxPercent/100.);
        
        totalCost = (int) Math.round( mealCost + tipCost + taxCost );
      
        // Print result
        System.out.println("The total meal cost is "+totalCost+" dollars.");
        
        
    }
}
