package hust.soict.hedspi.test.disc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King");
		swap(dvd1,dvd2);
		System.out.println("dvd1 title:"+dvd1.getTitle());
		System.out.println("dvd2 title:"+dvd2.getTitle());
		changeTitle(dvd1,dvd2.getTitle());
		System.out.println("dvd1 title: "+dvd1.getTitle());
		
		
	}
	
	public static void swap (DigitalVideoDisc o1, DigitalVideoDisc o2) {
		DigitalVideoDisc tmp = new DigitalVideoDisc(o1.getTitle(), o1.getCategory(), o1.getDirector(), o1.getLength(), o1.getCost());
		
		o1.setTitle(o2.getTitle());
		o1.setCategory(o2.getCategory());
		o1.setDirector(o2.getDirector());
		o1.setLength(o2.getLength());
		o1.setCost(o2.getCost());
		
		o2.setTitle(tmp.getTitle());
		o2.setCategory(tmp.getCategory());
		o2.setDirector(tmp.getDirector());
		o2.setLength(tmp.getLength());
		o2.setCost(tmp.getCost());
	}//Lab_04
	
	public static void changeTitle(DigitalVideoDisc dvd,String title) {
		String oldTitle=dvd.getTitle();
		dvd.setTitle(title);
		dvd=new DigitalVideoDisc(oldTitle);
	}//Lab_04

}
