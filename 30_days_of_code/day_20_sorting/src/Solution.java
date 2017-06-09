import java.util.Scanner;


public class Solution {

    public static int bubbleSort(int[] arr){
	int sumSwaps;
		
	sumSwaps = 0;
	for(int i=0;i<arr.length-1;i++){
	    
	    for(int j=0;j<arr.length-1-i;j++){
		if(arr[j] > arr[j+1]){
		    arr[j] += arr[j+1];
		    arr[j+1] = arr[j] - arr[j+1];
		    arr[j] -= arr[j+1];
		    
		    sumSwaps++;
		}
	    }
	}
	
		
	return sumSwaps;
    }
	
	
    public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	int n, numSwaps;
	int[] arr;
	
	n = sc.nextInt();
	arr = new int[n];
		
	for(int i=0;i<n;i++){
	    arr[i] = sc.nextInt();
	}
		
	numSwaps = Solution.bubbleSort(arr);
		
	System.out.println("Array is sorted in " +numSwaps+ " swaps.");
	System.out.println("First Element: " + arr[0]);
	System.out.println("Last Element: " + arr[arr.length-1]);
	
    }	
}
