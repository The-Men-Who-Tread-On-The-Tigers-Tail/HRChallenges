import java.util.Scanner;

public class Solution{

    public static  Node insert(Node head,int data) {

    	Node newNode, tmpNode; 
    	
    	newNode = new Node(data);
    	
    	if (head == null){
	    head = newNode;
    	} else {
	    tmpNode = head;
	    while(tmpNode.getNext() != null){
		tmpNode = tmpNode.getNext();
	    }
	    
	    tmpNode.setNext(newNode);
    	}
    	
    	return head;
    }


    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.getData() + " ");
            start = start.getNext();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
