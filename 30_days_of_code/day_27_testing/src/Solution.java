import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;


/**
 * 
 * @author lena
 *
 */
public class Solution{

    /**
     * 
     * @param min
     * @param max
     * @return
     */
    public static int randomInt(int min, int max){
	Random rand = new Random();

	return min + rand.nextInt(max - min +1);
    }
	
    /**
     * 
     * @param n
     * @param offset
     * @return
     */
    public static ArrayList<Integer> shuffledIntArray(int n, int offset){
	ArrayList<Integer> arrLst = new ArrayList<Integer>();
	Collections.shuffle(arrLst);
		
	for(int i=0;i<n;i++){
	    arrLst.add(i+offset);
	}
	Collections.shuffle(arrLst);
		
	return arrLst;
    }
	
    /**
     * 
     * @param args
     */
    public static void main(String[] args){

	int testcases = 5;
	int students;
	int threshold;
	int[] arrivalTimes;
	ArrayList<Integer> threeRndIndx;
	ArrayList<Integer> studentsRandomCounts = Solution.shuffledIntArray(198, 3);

	System.out.println(testcases);

	for(int i=0;i<testcases;i++){

	    // generate n and k
	    students = studentsRandomCounts.get(i%198);
	    threshold = Solution.randomInt(1, students);

	    //generate a_i
	    arrivalTimes = new int[students];

	    for(int j=0;j<students;j++){
		arrivalTimes[j] = Solution.randomInt(-1000, 1000);
	    }			

	    threeRndIndx = Solution.shuffledIntArray(students, 0);
	    arrivalTimes[threeRndIndx.get(0)] = 0;
	    arrivalTimes[threeRndIndx.get(1)] = Solution.randomInt(1, 1000);
	    arrivalTimes[threeRndIndx.get(2)] = Solution.randomInt(-1000, -1);


	    //print input
	    System.out.println(students+" "+threshold);

	    for(int j=0;j<arrivalTimes.length;j++){
		System.out.print(arrivalTimes[j]+" ");
	    }
	    System.out.println();

	}
    }
}
