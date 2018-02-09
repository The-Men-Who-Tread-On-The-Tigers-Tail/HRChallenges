import java.util.Arrays;
import java.util.Scanner;


public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int height[] = new int[n];
    int count;

    for(int height_i=0; height_i < n; height_i++){
      height[height_i] = in.nextInt();
    }

    Arrays.sort(height);

    count = 1;
    for(int i = height.length-2;i>=0;i--){
      if(height[i+1]>height[i]){
        break;
      }
      count++;
    }

    System.out.println(count);
    in.close();
  }
}

