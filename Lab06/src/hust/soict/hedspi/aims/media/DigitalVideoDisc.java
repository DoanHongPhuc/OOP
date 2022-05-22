package hust.soict.hedspi.aims.media;


public class DigitalVideoDisc extends media  {
	private String director;
	public int length;
	
	public DigitalVideoDisc() {
		super();
	}
	
	public DigitalVideoDisc(String title) {
		super(title);
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
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
		System.out.print("\t"+super.getId()+ ". Dvd. ");
		super.printList();
		System.out.println(" - Director : "+ director + " - " + "length : " + length);
		
	}

}