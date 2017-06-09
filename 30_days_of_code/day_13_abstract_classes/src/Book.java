import java.util.*;

public abstract class Book {
    private String title;
    private String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public abstract void display();

    public String getTitle(){
	return this.title;
    }

    public String getAuthor(){
	return this.author;
    }
}
