import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	
    	char[] even = new char[5001];
    	char[] odd = new char[5001];
    	
    	int howManyStrings;
    	char[] inputChars;
    	
    	int counter;
    	
    	Scanner sn = new Scanner(System.in);
    	
    	//read input
    	howManyStrings = sn.nextInt();
    	sn.nextLine();

    	
    	//processing
    	for(int i=0;i<howManyStrings;i++){
    	
    		inputChars = sn.nextLine().toCharArray();   		
    		
    		for(int j=0;j<inputChars.length;j++){
    		
	    		if(j%2 == 0){	
	    			even[j/2] = inputChars[j];
	    			even[j/2+1] = 0;
	    			
	    		}else{
	    			odd[j/2] = inputChars[j];
	    			odd[j/2+1] = 0;
	    			
	    		}
    		}  		
    		
        	//output
    		counter =0;
    		while( (int) even[counter] != 0){
    			System.out.print(even[counter]);
    			counter++;
    		}
    		System.out.print(" ");
 
    		counter =0;
    		while( (int) odd[counter] != 0){
    			System.out.print(odd[counter]);
    			counter++;
    		}
    		System.out.print("\n");
     	} 	    	
     }
}
