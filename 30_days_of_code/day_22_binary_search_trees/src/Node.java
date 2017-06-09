

public class Node{

    private Node left;
    private Node right;

    private int data;

    public Node(int data){	
        this.data = data;
        this.left = null;
	this.right = null;
    }

    public Node getLeft(){
	return this.left;
    }

    public void setLeft(Node n){
	this.left = n;
    }

    public Node getRight(){
	return this.right;
    }

    public void setRight(Node n){
	this.right = n;
    }

    public int getData(){
	return this.data;
    }
    
}
