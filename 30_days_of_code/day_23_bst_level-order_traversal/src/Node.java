
public class Node{

    private Node left;
    private Node right;

    private int data;

    Node(int data){
        this.data = data;
        this.left = null;
	this.right = null;
    }

    public int getData(){
	return this.data;
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
}
