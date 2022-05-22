package hust.soict.hedspi.aims.media;

import java.util.List;
import java.util.ArrayList;
public class Book extends media {
	private List<String> authors = new ArrayList<String>();
	public Book(){
		super();
	}
	public Book(String title, String category,float cost,ArrayList<String> authors) {
		super(title,category,cost);
		this.authors = authors;
	}
	
	public ArrayList<String> getAuthors() {
		return (ArrayList<String>) authors;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		
		if(authorName.contains(authorName)) 
			System.out.println("The list contains"+authorName);
		else {
			authors.add(authorName);
		}
	}
	
	public void removeAuthor(String authorName) {
		
		if(!authorName.contains(authorName)) 
			System.out.println("Author Name ("+authorName+")not found");
		else {
			authors.remove(authorName);
		}	
	}
	
	public void printList() {
		System.out.print("\t"+super.getId()+ ". Book.  ");
		super.printList();
		System.out.print(" - Authors: ");
		for(String authorName : authors) {
			System.out.print(authorName + ", ");
		}	
		System.out.println();
	}


}

