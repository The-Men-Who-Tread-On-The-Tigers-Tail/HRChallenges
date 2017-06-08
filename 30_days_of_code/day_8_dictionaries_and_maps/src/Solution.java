import java.util.*;
import java.io.*;

class Solution{
	
    public static void main(String []argh){
    	
        Scanner in = new Scanner(System.in);
        int n;
        
        Map<String,Integer> phoneBook = new HashMap<String, Integer>();
        String inputName;
        
        n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            
            phoneBook.put(name, phone);
        }
        
        while(in.hasNext()){
            inputName = in.next();
            if (phoneBook.containsKey(inputName)){
            	System.out.println(inputName+"="+phoneBook.get(inputName));
            }else{
            	System.out.println("Not found");
            }
        
        }
        in.close();
    }
}

