import java.util.Scanner;

/**
 * 
 * @author lena
 *
 */
public class Solution {


  /**
   * 
   * @param args
   */
  public static void main(String[] args){

    //INPUT 
    Scanner sc = new Scanner(System.in);
    long[] values = new long[5];
    long min;
    long max;
    long sum;

    for(int i=0; i<values.length;i++){
      values[i] = sc.nextInt();
    }
    sc.close();

    //CALCULATE
    min = Long.MAX_VALUE;
    max = 0;
    for(int i=0;i<values.length;i++){

      sum = 0;
      for(int j=0;j<values.length;j++){
        if(j != i){
          sum += values[j];
        }
      }

      if (sum < min){
        min = sum;
      }

      if (sum > max){
        max = sum;
      }     
    }

    //OUTPUT    
    System.out.println(min+" "+max);
  }
}

