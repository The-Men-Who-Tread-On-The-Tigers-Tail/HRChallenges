
public class Calculator{
    
    //default constructor
    
    
    public int power(int n, int p) throws Exception{
		
	int pw;
		
	if ( n<0 || p<0 ){
	    throw new Exception("n and p should be non-negative");
	}
		
	//pw = Math.pow(n, p);		
	if ( p == 0){
	    pw = 1;
	}else {
	    pw = 1;
	    for(int i=0; i<p;i++){
		pw *= n;
	    }
	}
	
	return pw;	
    }	
}
