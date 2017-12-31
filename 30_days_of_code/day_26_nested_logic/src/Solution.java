import java.util.Scanner;

public class Solution {


    private static int sameMonthFee(int days){
	return days * 15;
    }

    private static int sameYearFee(int months){
	return months * 500;
    }

    private static int fixMaxFee(){
	return 10000;
    }



    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int[] actuallyReturned = new int[3];
	int[] dueDate = new int[3];
	int fine;

	for(int i=0;i<3;i++){
	    actuallyReturned[i] = sc.nextInt();
	}

	for(int i=0;i<3;i++){
	    dueDate[i] = sc.nextInt();
	}
	sc.close();

	fine = 0;
	if( actuallyReturned[2] == dueDate[2]){

	    if(actuallyReturned[1] == dueDate[1] && actuallyReturned[0] >= dueDate[0]){
				
		fine = Solution.sameMonthFee(actuallyReturned[0] - dueDate[0]);					

	    }else if (actuallyReturned[1] > dueDate[1]){
		fine = Solution.sameYearFee(actuallyReturned[1] - dueDate[1]);
	    }

	}else if (actuallyReturned[2] > dueDate[2]){
	    fine = Solution.fixMaxFee();
	}

	System.out.println(fine);

    }
}
