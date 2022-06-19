package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable  {
	
	public DigitalVideoDisc() {
		super();
	}
	
	public DigitalVideoDisc(String title) {
		super(title);
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost,int id) {
		super(title,category,cost,id,length,director);
	}
	
	
	public boolean search(String title) {
		boolean r= true;
		String splitString=" ";
		title=title.toLowerCase();
		String discString=this.getTitle();
		discString=discString.toLowerCase();
		String[] splitArray=title.split(splitString);
		for(int i=0;i<splitArray.length;i++) {
			r=discString.contains(splitArray[i]);
			if(r==false) return r;
		}
		return r;
	}
	
	public void printList() {
		super.printList();
	}
	@Override
	public void play() throws PlayerException {
		if (this.getLength() > 0) {
			System.out.println("Playing DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
		} else {
			throw new PlayerException("ERROR: DVD length is non-positive!");
		}
	}

}