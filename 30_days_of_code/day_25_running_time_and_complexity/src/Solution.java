import java.util.Scanner;


/**
 * 
 *
 */
public class Solution {

    private static boolean isPrime(int n){
	boolean res =true;

	if(n == 1){
	    res = false;
	}else{
	    for(int i=2; i*i<=n;i++){
		if(n%i == 0){
		    res = false;
		    break;
		}
	    }
	}
	return res;
    }
	
    /**
     * 
     * @param args
     */
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n;
	int arr[];

	n = sc.nextInt();
	arr = new int[n];
	for(int i=0;i<n;i++){
	    arr[i] = sc.nextInt();
	}
	sc.close();
		
	for(int i=0;i<n;i++){
	    if(Solution.isPrime(arr[i])){
		System.out.println("Prime");
	    }else{
		System.out.println("Not prime");
	    }
	}
    }
}
