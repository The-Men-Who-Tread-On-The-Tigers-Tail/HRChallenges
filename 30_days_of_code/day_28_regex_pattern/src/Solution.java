import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

	Scanner sc = new Scanner(System.in);
	int n;
	String tmpS;
	ArrayList<String> validRows = new ArrayList<String>();
	Pattern p;
	Matcher m;
				
	p = Pattern.compile(".*@gmail\\.com.*");
		
	n = sc.nextInt();
	sc.nextLine();

	for(int i=0;i<n;i++){
	    tmpS = sc.nextLine();
			
	    m = p.matcher(tmpS);
			
	    if(m.matches()){
		validRows.add(tmpS);
	    }
	}
		
	sc.close();
		
	Collections.sort(validRows);
		
	p = Pattern.compile("^[a-zA-Z]+");
	for(String row : validRows){
			
	    m = p.matcher(row);
	    if(m.find()){
		System.out.println(m.group());
	    }
	}

    }	
}
