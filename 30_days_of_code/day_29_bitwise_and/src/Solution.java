import java.util.*;

public class Solution {

    public static int solution(int n, int k){
	int max;
	int bitwiseAnd;
		
	max = 0;
		
	outerloop:
	for(int i=1;i<=n-1;i++){
	    for(int j=i+1;j<=n;j++){
				
		bitwiseAnd = i&j;
		if(bitwiseAnd < k && bitwiseAnd > max){
		    max  = bitwiseAnd;
					
		    if(max == k-1){
			break outerloop;
		    }
		}
	    }
	}	
	return max;
    }
	
	
    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
        int[][] values;
    	
	/*
	 *  INPUT
	 */
        int t = in.nextInt();
        
        values = new int[t][2];
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            
            values[a0][0] = n;
            values[a0][1] = k;
        }
        
	/*
	 * 	OUTPUT
	 */
        for(int i=0; i<values.length;i++){
            System.out.println(Solution.solution(values[i][0], values[i][1]));        	
        }
    }
}
