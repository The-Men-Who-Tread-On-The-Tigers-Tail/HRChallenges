// Declare your class here. Do not use the 'public' access modifier.
// Declare the price instance variable

public class MyBook extends Book{
	
    private int price;
	
    /**   
     *   Class Constructor
     *   
     *   @param title The book's title.
     *   @param author The book's author.
     *   @param price The book's price.
     **/
    public MyBook(String title, String author, int price){
	super(title, author);
	
	this.price = price;
    }
    
    /**   
     *   Method Name: display
     *   
     *   Print the title, author, and price in the specified format.
     **/
    public void display(){
	System.out.println("Title: "+this.getTitle());
	System.out.println("Author: "+this.getAuthor());
	System.out.println("Price: "+this.price);
    }

    /**
    *
    *  getter for price
    *
    **/
    public int getPrice(){
	return this.price;
    }
}
// End class
