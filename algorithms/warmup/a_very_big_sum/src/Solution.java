import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {

		int n;
		int arr[];
		long sum;
		//read
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		arr = new int[n];
		
		for(int arr_i=0; arr_i < n; arr_i++){
			arr[arr_i] = in.nextInt();
		}
		
		//calculate
		sum=0L;
		
		for (int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		
		
		//output (sum)
		System.out.println(sum);
		
	}
}
