import java.io.*;
import java.util.*;
import java.security.InvalidParameterException;

public class Solution {

    public static long diagonalDifference(int[][] matrix){
		
	long diagDiff = 0;
	int n = matrix.length;
		
	for(int i=0;i<n; i++){
	    diagDiff += matrix[i][i];
	    diagDiff -= matrix[i][(n-1)-i];
	}
		
	return Math.abs(diagDiff);
    }
	
	
    public static void main(String[] args) {

    	Scanner sn = new Scanner(System.in);
    	
    	int n;
    	
    	int matrix[][];
    	
    	n = sn.nextInt();
    	
    	if (n <= 0){
	    throw new InvalidParameterException("it should be at least a 1x1 matrix.");
    	}
    	
    	matrix = new int[n][n];
    	
    	for(int i=0;i<n;i++){
	    sn.nextLine();

	    for(int j=0;j<n;j++){    	
		matrix[i][j] = sn.nextInt();    			
	    }
    	}

    	System.out.println(Solution.diagonalDifference(matrix));

    }
}
