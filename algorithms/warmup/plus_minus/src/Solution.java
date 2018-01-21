import java.io.*;
import java.util.*;

import javax.management.InvalidApplicationException;
import javax.naming.directory.InvalidAttributeIdentifierException;

public class Solution{
    
    public static float positiveFraction(int[] values){
	int counter =0;
	
	for(int value : values){
	    if (value > 0){
		counter++;
	    }
	}
	
	return counter/(float)values.length;
    }
    
    
    public static float negativeFraction(int[] values){
	int counter =0;
	
	for(int value : values){
	    if (value < 0){
		counter++;
	    }
	}
	
	return counter/(float)values.length;
    }
    
    public static float zeroesFraction(int[] values){
	int counter =0;
	
	for(int value: values){
	    if(value == 0){
		counter++;
	    }
	}
	
	return counter/(float)values.length;
    }

    
    public static void main(String[] args) throws InvalidAttributeIdentifierException{
	
	int n;
	int[] values;
	Scanner sc = new Scanner(System.in);
	
	n = sc.nextInt();
	
	if (n <= 0){
	    throw new InvalidAttributeIdentifierException("n>0");
	}
	
	values = new int[n];
	
	for (int i=0; i<n; i++){
	    values[i]  = sc.nextInt();
	}
	
	System.out.println(String.format("%.6f", Solution.positiveFraction(values)));
	System.out.println(String.format("%.6f", Solution.negativeFraction(values)));
	System.out.println(String.format("%.6f",Solution.zeroesFraction(values)));
	
    }
}
