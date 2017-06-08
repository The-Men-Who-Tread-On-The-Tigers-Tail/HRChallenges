import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
   	
    	Scanner sc = new Scanner(System.in);
    	
    	int n, max, counter;
    	String binary;
    	
    	n = sc.nextInt();
    	sc.close();
    	
    	binary = Integer.toBinaryString(n);
    	
    	max = 0;
    	counter = 0;
    	for(char c : binary.toCharArray()){

    		counter = (c == '1') ? counter+1 : 0;
    		    		
			if(counter > max){
				max = counter;
			}

    	}
    	    	
    	System.out.println(max);
    }
}
