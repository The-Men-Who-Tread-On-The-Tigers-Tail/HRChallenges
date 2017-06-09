import java.util.Scanner;

public class Solution{

    /**
     * 
     * @param root
     * @return
     */
    public static int getHeight(Node root){
	int height;
	
	if(root == null){
	    height = -1;
	}else{
	    height = 1 + Math.max(Solution.getHeight(root.getLeft()), Solution.getHeight(root.getRight()));
	}
	
	return height;
    }    

    
    public static Node insert(Node root,int data){
	Node cur;

        if(root == null){
	    root = new Node(data);
	    
	}else if(data <= root.getData()){
	    cur = insert(root.getLeft(),data);
	    root.setLeft(cur);
	    
	}else{
	    cur = insert(root.getRight(),data);
	    root.setRight(cur);
	}
	
	return root;
    }

    
    public static void main(String args[]){
	
        Scanner sc=new Scanner(System.in);
	Node root=null;

        int t, data;

	t = sc.nextInt();
        while(t-->0){
            data=sc.nextInt();
            root=insert(root,data);
        }
	sc.close();
	
        System.out.println(getHeight(root));
    }
}
