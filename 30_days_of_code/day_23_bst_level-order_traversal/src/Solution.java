import java.util.Scanner;
import java.util.LinkedList;

public class Solution{

    /**
     * 
     * breadth-first search
     * 
     * @param root
     */
    private static void levelOrder(Node root){
	
	LinkedList<Node> ls = new LinkedList<Node>();
	Node currNode;
	
	if (root != null){
	    
	    ls.addLast(root);
			
	    while(!ls.isEmpty()){
		
		currNode = ls.pollFirst();
		
		System.out.print(currNode.getData()+" ");
		
		if (currNode.getLeft() != null){
		    ls.addLast(currNode.getLeft());
		}
		
		if (currNode.getRight() != null){
		    ls.addLast(currNode.getRight());
		}
	    }
	    System.out.println();
	}
    }
    
    
    private static Node insert(Node root,int data){
	Node cur;
	
        if(root == null){
            root = new Node(data);

        } else if(data <= root.getData()){
	    cur = insert(root.getLeft(), data);
	    root.setLeft(cur);
	    
	}else{
	    cur = insert(root.getRight(), data);
	    root.setRight(cur);
	}

	return root;
    }

    
    public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	Node root=null;
	
	int t, data;

	t = sc.nextInt();
	while(t-->0){
	    data = sc.nextInt();
	    root = insert(root,data);
	}
	sc.close();
	
	levelOrder(root);
    }
}
