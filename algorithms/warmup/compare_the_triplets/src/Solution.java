import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		int a[], b[];
		int pointsA, pointsB;

		//read
		a = new int[3];
		b = new int[3];
		Scanner in = new Scanner(System.in);


		a[0] = in.nextInt();
		a[1] = in.nextInt();
		a[2] = in.nextInt();
		b[0] = in.nextInt();
		b[1] = in.nextInt();
		b[2] = in.nextInt();

		in.close();

		//compare
		pointsA = pointsB = 0;

		for(int i=0; i<a.length; i++){

			if (a[i] == b[i]){
				continue;
			}

			if( a[i] > b[i]){
				pointsA++;
			}else{
				pointsB++;
			}
		}

		//output
		System.out.println(pointsA+" "+pointsB);
		
	}
}
