import java.util.Scanner;

public class Solution{

    public static void main(String[] args) {
	
        Scanner in = new Scanner(System.in);
	Calculator myCalculator = new Calculator();

        int t, n ,p;

	t = in.nextInt();	
        while (t-- > 0) {
	    
            n = in.nextInt();
            p = in.nextInt();

	    try {
                System.out.println(myCalculator.power(n, p));
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
