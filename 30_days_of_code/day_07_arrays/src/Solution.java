import java.io.*;
import java.util.*;


public class Solution {

    public static void reverseIntArr(int[] arr){
		
	int tmp;
	
	for(int i=0;i<arr.length/2;i++){
	    tmp = arr[i];
	    
	    arr[i] = arr[arr.length-1-i];
	    arr[arr.length-1-i] = tmp;
	}
    }
    
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();

        reverseIntArr(arr);
        
        for(int i : arr){
	    System.out.print(i+" ");
        }
    }
}
