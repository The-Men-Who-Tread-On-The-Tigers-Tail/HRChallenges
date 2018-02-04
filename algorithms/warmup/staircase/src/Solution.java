import java.util.Scanner;


/**
 * 
 * @author lena
 *
 */
public class Solution {

  /**
   * 
   * @param n
   */
  public static void printStairCases(int n){

    for(int i=0;i<n;i++){

      for(int j=0;j<n-1-i;j++){
        System.out.print(" ");
      }

      for(int j=0;j<i+1;j++){
        System.out.print("#");
      }
      System.out.print("\n");
    }

  }


  /**
   * 
   * @param args
   */
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    Solution.printStairCases(sc.nextInt());
    sc.close();

  }   
}

