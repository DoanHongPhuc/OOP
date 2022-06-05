package hust.soict.hedspi.aims;
import java.util.ArrayList;

import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.order.Order;

public class DiskTest {

	public static void main(String[] args) {
		ArrayList <String> authors = new ArrayList<String>();
		authors.add("Van Cao");
		authors.add("To Huu");
		Book book1 = new Book("Tay Tien","Documentory",10.5f,authors,1);
		Book tmp = book1;
		if(book1.equals(tmp)) {
			System.out.println("true");
		}
		
		
	}
}
