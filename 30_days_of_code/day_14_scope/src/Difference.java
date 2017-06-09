import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Difference {

    private int[] elements;

    private int maximumDifference;

  	
    public Difference(int[] elements){
	this.elements = elements.clone();	
	this.realComputeDifference(); //init maximumDifference
    }
    
    public void computeDifference(){
	this.realComputeDifference();
    }
	
    private void realComputeDifference(){
	int[] tmpElements = this.elements.clone();
	
	Arrays.sort(tmpElements);
	this.maximumDifference = tmpElements[tmpElements.length-1] - tmpElements[0];
    }

    public int getMaxDiff(){
	return this.maximumDifference;
    }
    
} // End of Difference class
