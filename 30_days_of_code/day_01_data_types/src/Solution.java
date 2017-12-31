import java.util.Scanner;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int myI =0;
        double myD =0.0;
        String myS ="";
        
        boolean test;

        test = true;
        try{
            myI = scan.nextInt();
            scan.nextLine();
            
            myD = scan.nextDouble();
            scan.nextLine();
            
            myS = scan.nextLine();
            
        } catch (Exception e) {
            e.printStackTrace();
            test = false;
        }

        if(test){
            
            System.out.println(i + myI);
            System.out.println(d + myD);
            System.out.println(s + myS);
            
        }else{
            System.err.println("Wrong input Values/Types");
        }	
	
	scan.close();
    }
}
