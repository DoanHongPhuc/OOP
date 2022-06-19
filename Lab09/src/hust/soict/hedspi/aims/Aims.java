package hust.soict.hedspi.aims;
import java.lang.reflect.Array;
import javax.naming.LimitExceededException;

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
		System.out.println("Please choose a number: 0-1-2-3-4-5");
		System.out.println("--------------------------------");
	}
	
	public static void showBookList(ArrayList<Book> BookList) {
		System.out.println("Book list: ");
		System.out.println("--------------------------------");
		for(int i=0;i<BookList.size();i++) {
			System.out.println("Title:"+BookList.get(i).getTitle()+" ID: "+BookList.get(i).getId());
		}
		System.out.println("--------------------------------");
		System.out.println("Please choose a id of book");
		System.out.println("--------------------------------");
	}
	
	public static void showDiscList(ArrayList<DigitalVideoDisc> DiscList) {
		System.out.println("Disc list: ");
		System.out.println("--------------------------------");
		for(int i=0;i<DiscList.size();i++) {
			System.out.println("Title:"+DiscList.get(i).getTitle()+" ID: "+DiscList.get(i).getId());
		}
		System.out.println("--------------------------------");
		System.out.println("Please choose a id of disc");
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

	public static void main(String[] args)throws LimitExceededException {
		ArrayList <String> authors = new ArrayList<String>();
		authors.add("Van Cao");
		authors.add("To Huu");
		ArrayList <Book> bookList = new ArrayList<Book>();
		Book book1 = new Book("Tay Tien","Documentory",10.5f,authors,1);
		Book book2 = new Book("Tat Den","Documentory",15.5f,authors,2);
		bookList.add(book1);
		bookList.add(book2);
		ArrayList <DigitalVideoDisc> discList = new ArrayList<DigitalVideoDisc>();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f,123);
		discList.add(dvd1);
		//anOrder.addDigitalVideoDisc(dvd1); 
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",124,24.95f,124);
		discList.add(dvd2);
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
					MyDate day = new MyDate();
					listOrder.get(index).setDateOrdered(day);
					System.out.println("What kind you want to add in the order");
					System.out.println( " (1.Book ; 2.CompactDisc ; 3.DigitalVideoDisc)");
					int idType = 0;
					idType = scanner.nextInt();
					
					if(idType==1) {	
						int Idchoice;
						while(true) {
							showBookList(bookList);
							int isTrue=0;
							Idchoice=scanner.nextInt();
							for(int i=0;i<bookList.size();i++) {
								if (bookList.get(i).getId()==Idchoice) {
									listOrder.get(index).addMedia(bookList.get(i));
									System.out.println("Add "+bookList.get(i).getTitle()+"in Order");
									isTrue=1;
								}
							}
							if(isTrue==0) {
							System.out.println("Error!!! ID error");
							}
							else break;
						}
					}
					if(idType==2) {	
						int Idchoice;
						while(true) {
							showDiscList(discList);
							int isTrue=0;
							Idchoice=scanner.nextInt();
							for(int i=0;i<discList.size();i++) {
								if (discList.get(i).getId()==Idchoice) {
									listOrder.get(index).addMedia(discList.get(i));
									System.out.println("Add "+discList.get(i).getTitle()+"in Order");
									isTrue=1;
								}
							}
							if(isTrue==0) {
								System.out.println("Error!!! ID error");
								}
								else break;
						}
					}
					if(idType==3) {
						int play = 0;
						String  inputTitle, inputCategory,inputAuthor,inputDirector,inputArtist,inputTrackTitle;
						float inputCost =0;
						int inputID = 0,inputInt = 0 ,amount = 0,inputTrackLength =0,inputLength =0;
						ArrayList<String> inputStr = new ArrayList<String>();
						ArrayList<Track> inputTracks = new ArrayList<Track>();
						//Tonight complete this code
						System.out.println("Input Id?");
						inputID = scanner.nextInt();
						System.out.println("Input title ?");
						scanner.nextLine();
						inputTitle = scanner.nextLine();
						System.out.println("Input category ?");
						inputCategory = scanner.nextLine();
						System.out.println("Input cost ?");
						inputCost = scanner.nextFloat();
						scanner.nextLine();
						System.out.println("Input artist");
						inputArtist = scanner.nextLine();
						System.out.println("\tInput amount of Track");
						amount = scanner.nextInt();
						scanner.nextLine();
						for(int i = 0 ; i < amount ; i++) {
							System.out.println("Input Track " + (i+1));
							System.out.println("\t\tInput title");
							inputTrackTitle = scanner.nextLine();
							System.out.println("\t\tInput length");
							inputTrackLength = scanner.nextInt();
							scanner.nextLine();
							Track inputTrack = new Track(inputTrackTitle,inputTrackLength);
							inputTracks.add(inputTrack);
						}
						CompactDisc  cdNew = new CompactDisc(inputArtist, inputTracks, inputTitle, inputCategory, inputCost, id);
						listOrder.get(index).addMedia(cdNew);
						System.out.println("You want to play Dvd ? (1. Yes 0 .No)");
						play = scanner.nextInt();
						while(play !=0 && play != 1) {
							System.out.println("Choose again (1. Yes 0 .No) !!");
							play = scanner.nextInt();
						}
						if(play == 1) {
							try {
								cdNew.play();
							} catch (PlayerException e) {
								// TODO Auto-generated catch block
								//e.printStackTrace();
								System.err.println("A problem occured: " + e);
							}
						}
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
