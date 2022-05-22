package hust.soict.hedspi.aims;
import java.lang.reflect.Array;
import java.util.*;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.utils.MyDate;

public class Aims {
	
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		System.out.println("--------------------------------");
	}
	
	public static void showItem() {
		System.out.println("Item list: ");
		System.out.println("--------------------------------");
		System.out.println("1. Tay Tien (book1)");
		System.out.println("2. Tat Den (book2)");
		System.out.println("3. The Lion King (dvd1)");
		System.out.println("4. Star Wars (dvd2)");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 1-2-3-4");
		System.out.println("--------------------------------");
	}
	
	static int findID(int id , ArrayList<Order> order ) {
		for(int i = 0; i < order.size() ; i++) {
			if(order.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		ArrayList <String> authors = new ArrayList<String>();
		authors.add("Van Cao");
		authors.add("To Huu");
		Book book1 = new Book("Tay Tien","Documentory",10.5f,authors);
		book1.setId(234);
		Book book2 = new Book("Tat Den","Documentory",15.5f,authors);
		book2.setId(123);
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		dvd1.setId(111);
		
		//anOrder.addDigitalVideoDisc(dvd1); 

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		dvd2.setId(222);
		
		//anOrder.addDigitalVideoDisc(dvd2);
		
		int choice = 0 ,id = 0, index = -1;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Order> listOrder = new ArrayList<Order>();
		showMenu();
		choice = scanner.nextInt();
		while(true) {
			switch (choice) {
			case 0: {
				System.exit(0);
				break;
			}
			
			case 1: 
				Order newOrder = new Order();
					System.out.println("Input id order: ");
					id = scanner.nextInt();
					newOrder.setId(id);
					listOrder.add(newOrder);
					index += 1;
				break;
			
			
			case 2:
				if(index>=0) {
					showItem();
					MyDate day = new MyDate();
					listOrder.get(index).setDateOrdered(day);
					int idItem = 0;
					idItem = scanner.nextInt();
					switch(idItem){
					case 1:
						System.out.println("add Item "+book1.getTitle()+"to Order");
						listOrder.get(index).addMedia(book1);
						break;
					case 2:
						System.out.println("add Item "+book2.getTitle()+"to Order");
						listOrder.get(index).addMedia(book2);
						break;
					case 3:
						System.out.println("add Item "+dvd1.getTitle()+"to Order");
						listOrder.get(index).addMedia(dvd1);
						break;
					case 4:
						System.out.println("add Item "+dvd2.getTitle()+"to Order");
						listOrder.get(index).addMedia(dvd2);
						break;
					default:
						System.out.println("Error id item");
					}
				}
				else {
					System.out.println("Error!!! Create new order ");
				}
				break;
			case 3:
				if(index>=0) {
					int  deleteIDMedia = 0,IDOrder = 0;
					System.out.println("Input id media you want to delete");
					deleteIDMedia = scanner.nextInt();
					IDOrder = findID(index, listOrder);
					if(IDOrder == -1){
						System.out.println("Can't find order ! Remove error!!");
					}
					else {
						listOrder.get(index).removeMedia(deleteIDMedia);
					}
				}
				else {
					System.out.println("Error!!! Create new order ");
				}
				break;
			case 4:
				for(int  i = 0 ; i < listOrder.size(); i++) {
					Order tmp = listOrder.get(i);
					System.out.print("Order code : "+tmp.getId()+". Date ordered :" );
					tmp.getDateOrdered().print();
					for(int j = 0 ; j < tmp.getItemOrdered().size() ; j++) {
						if(tmp.getItemOrdered().get(j) instanceof DigitalVideoDisc ) {
							tmp.getItemOrdered().get(j).printList();
						}
						else if(tmp.getItemOrdered().get(j) instanceof Book ) {
							tmp.getItemOrdered().get(j).printList();
						}
					}
					
				}
				break;
			
			default:
				System.out.println("Incorrect choice !! Input again !!");
				choice = scanner.nextInt();
				break;
			}
			showMenu();
			choice = scanner.nextInt();
			
		}
		
		
	}
}
