import java.io.*;
import java.util.*;

public class Node {

    private int data;
    private Node next;

    Node(int d) {
        data = d;
        next = null;
    }
    
    public int getData(){
	return this.data;
    }
    
    public Node getNext(){
	return this.next;
    }

    public void setNext(Node n){
	this.next = n;
    }
}


