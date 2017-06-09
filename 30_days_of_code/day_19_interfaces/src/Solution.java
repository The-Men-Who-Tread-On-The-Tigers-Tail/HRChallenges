import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
	
        Scanner scan = new Scanner(System.in);
      	AdvancedArithmetic myCalculator = new Calculator(); 
	
        int n, sum;
	
	n = scan.nextInt();
        scan.close();
        
        sum = myCalculator.divisorSum(n);
	
	System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
	System.out.println(sum);
    }    
}
