import java.util.Scanner;

public class Solution {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String time;
    String[] parts;
    int offset;

    time = sc.nextLine().toUpperCase();
    parts = time.split(":");

    offset = 0;
    if (parts[2].indexOf('P') != -1){
      offset = 12;
    }

    parts[0] = Integer.toString(Integer.parseInt(parts[0])%12 +offset);
    parts[0] = (parts[0].length() == 1) ? "0"+parts[0] : parts[0];
    //parts[1] dont change
    parts[2] = parts[2].replaceAll("[AP]{1}M", "");

    time = parts[0]+":"+parts[1]+":"+parts[2];

    System.out.println(time);

    sc.close();
  }
}

