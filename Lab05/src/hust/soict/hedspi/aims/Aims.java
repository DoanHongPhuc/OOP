package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Aims {

	public static void main(String[] args) {
		Order anOrder = new Order();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");// Khởi tạo object dvd1
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		
		//anOrder.addDigitalVideoDisc(dvd1);// thêm vào đơn hàng 

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		
		//anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		
		//anOrder.addDigitalVideoDisc(dvd3);
		//anOrder.removeDigitalVideoDisc(dvd3);
		
		//System.out.println("Total cost is: ");
		//System.out.println(anOrder.totalCost());
		
		DigitalVideoDisc addList[] = new DigitalVideoDisc[3];
		addList[0] = dvd1;
		addList[1] = dvd2;
		addList[2] = dvd3;
	
		anOrder.addDigitalVideoDisc(addList);
		
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
		anOrder.printOrder();
	}
}
