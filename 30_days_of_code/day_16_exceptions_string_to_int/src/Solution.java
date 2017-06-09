import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
	
	Scanner sc;
	String s;
		
	sc  = new Scanner(System.in);
	s = sc.next();
	sc.close();
		
	try{
	    System.out.println(Integer.parseInt(s));
	}catch (NumberFormatException e){
	    System.out.println("Bad String");
	}
    }
}
