package hust.soict.hedspi.aims.order;
import java.util.ArrayList;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;


public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	public static final int MAX_LIMITED_ORDERS = 5;
	private static int nbOrders = 0;
	
	private ArrayList<Media> itemOrdered = new ArrayList<Media>();
	private MyDate dateOrdered;
	private int id;
	

	public static int getNbOrders() {
		return nbOrders;
	}

	public static void setNbOrders(int nbOrders) {
		Order.nbOrders = nbOrders;
	}

	public Order() {
		if(nbOrders > MAX_LIMITED_ORDERS - 1) {
			System.out.println( "You can't create more order"); 
		}
		else {
			nbOrders += 1;
		}
	}
	
	public ArrayList<Media> getItemOrdered() {
		return itemOrdered;
	}


	public void setItemOrdered(ArrayList<Media> itemOrdered) {
		this.itemOrdered = itemOrdered;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MyDate getDateOrdered() {
		return dateOrdered;
	}
	public void setDateOrdered(MyDate dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	
	public void addMedia(DigitalVideoDisc dvd) {
		if(this.itemOrdered.size() < MAX_NUMBER_ORDERED) {
			this.itemOrdered.add(dvd);
		}
		else {
			System.out.println("Error out of memory !!!");
		}
	}
	
	public void addMedia(Media book) {
		if(this.itemOrdered.size() < MAX_NUMBER_ORDERED && !itemOrdered.contains(book)) {
			this.itemOrdered.add(book);
		}
		else {
			System.out.println("Error out of memory !!!");
		}
	}
	
	public void removeMedia(DigitalVideoDisc dvd) {
		if(itemOrdered.contains(dvd))
			itemOrdered.remove(dvd);
		else
			System.out.println("Can't find media ! Remove error!!");
	}
	
	public void removeMedia(int id) {
		int checkRev = 0;
		for(int i = 0 ; i < itemOrdered.size();i++) {
			if(itemOrdered.get(i).getId() == id) {
				itemOrdered.remove(i);
				checkRev = 1;
			}
		}
		if(checkRev == 0) 
			System.out.println("Can't find media ! Remove error!!");
		else
			System.out.println("Remove Success!!");
		
	}
	
	public void removeMedia(Book book) {
		if(itemOrdered.contains(book))
			itemOrdered.remove(book);
		else
			System.out.println("Can't find media ! Remove error!!");
	}
	
	public float totalCost() {
		float total = 0 ;
		for(int i = 0 ; i < this.itemOrdered.size(); i++) {
			total += this.itemOrdered.get(i).getCost();
		}
		return total;
	}
	public float totalCost(DigitalVideoDisc lucky) {
		float total = this.totalCost();
		return total -= lucky.getCost();
	}
	//LAB05
	
	public Media getALuckyItem() {
		int length = itemOrdered.size();
        Media item = itemOrdered.get((int) (length* Math.random()));
        return item;
	}
	
	
}
