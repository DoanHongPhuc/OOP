package hust.soict.hedspi.aims.media;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	private String content;
	private List<String> contentTokens = new ArrayList<String>();
	private Map<String,Integer> wordFrequency ;
	public Book(){
		super();
	}
	public Book(String title, String category,float cost,ArrayList<String> authors,int id ) {
		super(title,category,cost,id);
		this.authors = authors;
	}
	
	public ArrayList<String> getAuthors() {
		return (ArrayList<String>) authors;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content=content;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	public List<String> getContentTokens() {
		return contentTokens;
	}

	public void setContentTokens(List<String> contentTokens) {
		this.contentTokens = contentTokens;
	}

	public Map<String, Integer> getWordFrequency() {
		return wordFrequency;
	}

	public void setWordFrequency(Map<String, Integer> wordFrequency) {
		this.wordFrequency = wordFrequency;
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
	int Frequency (String[] list,String word) {
		int count = 0;
		for(String str : list) {
			if(str.compareTo(word) == 0)
				count += 1;
		}
		return count;
	}
	
	public void processContent() {
		String listString[] = content.split(" ");
		for(String str : listString) {
			contentTokens.add(str);
		}
		java.util.Collections.sort((java.util.List)contentTokens);
		Iterator iterator = contentTokens.iterator();
		
		TreeMap<String, Integer> map1 =  new TreeMap<String, Integer>() ;
		while(iterator.hasNext()) {
			String temp = (String)iterator.next();
			map1.put(temp, Frequency(listString,temp ));
		}
		wordFrequency = (Map<String, Integer>)map1;
	}


}

