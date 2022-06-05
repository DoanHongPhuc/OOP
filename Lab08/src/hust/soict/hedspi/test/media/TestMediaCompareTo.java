package hust.soict.hedspi.test.media;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.media;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.media.CompactDisc;

public class TestMediaCompareTo {
		
public static void main(String[] args) {
		
	ArrayList <String> authors = new ArrayList<String>();
	authors.add("Van Cao");
	authors.add("To Huu");
	ArrayList <media> bookList = new ArrayList<media>();
	Book book1 = new Book("Tay Tien","Documentory",10.5f,authors,1);
	Book book2 = new Book("Tat Den","Documentory",15.5f,authors,2);
	bookList.add(book1);
	bookList.add(book2);
	ArrayList <media> discList = new ArrayList<media>();
	DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f,123);
	discList.add(dvd1);

	DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",124,24.95f,124);
	discList.add(dvd2);
	
	DigitalVideoDisc dvd3 = new DigitalVideoDisc("Ty Cuoi","Animation","Roger Allers",423,19.95f,125);
	discList.add(dvd3);

	DigitalVideoDisc dvd4 = new DigitalVideoDisc("Trang TI","Science Fiction","George Lucas",425,24.95f,126);
	discList.add(dvd4);
	//Track
	Track track1 = new Track("Bai 1",10);
	Track track2 = new Track("Bai 2",3);
	ArrayList<Track> list = new ArrayList<Track>();
	
	CompactDisc CD1= new CompactDisc("Doan Hong Phuc",list,"Lab08","hesdpi",100,2);
	CD1.addTrack(track1);
	CD1.addTrack(track2);
	
	Order anOrder = new Order();
	anOrder.addMedia(dvd1);
    anOrder.addMedia(dvd2);
    anOrder.addMedia(dvd3);
    anOrder.addMedia(dvd4);
   
    for(int i=0;i<anOrder.getItemOrdered().size();i++){
    	System.out.println("Playing DVDs: "+ anOrder.getItemOrdered().get(i).getTitle());
    	System.out.println("Length of DVDs:" +anOrder.getItemOrdered().get(i).getLength());
    }
    System.out.println("The total length of CD to add is: "+CD1.getLength());
    System.out.println("Playing CD: "+  CD1.getTitle());
    System.out.println("CD length: "+CD1.getLength());
		
			
	
	Collection<DigitalVideoDisc> collection = new java.util.ArrayList<DigitalVideoDisc>();
		
	// Add the CD, DVD or Book objects to the ArrayList
	collection.add(dvd1);
	collection.add(dvd2);
	collection.add(dvd3);
	collection.add(dvd4);
	
	Iterator<DigitalVideoDisc> iterator = collection.iterator();
	
		
	System.out.println("----------------------------------");
	System.out.println("The DVDs currently in the order are:");
	while(iterator.hasNext()) {
		System.out.println(((DigitalVideoDisc) iterator.next()).getTitle());
	}
		
	// Sort the collection of DVDs - based on the compareTo()
	// method
	Collections.sort((List<DigitalVideoDisc>) collection);
		
	// Iterate through the ArrayList and output their titles
	// (unsorted order)
	iterator = collection.iterator();
		
	System.out.println("----------------------------------");
	System.out.println("The DVDs in sorted order are:");
		
	while(iterator.hasNext()) {
		System.out.println(((DigitalVideoDisc) iterator.next()).getTitle());
	}
		
	System.out.println("----------------------------------");
		
	}


	
}
