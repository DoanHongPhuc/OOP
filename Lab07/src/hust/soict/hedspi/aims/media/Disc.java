package hust.soict.hedspi.aims.media;

public class Disc extends media{
	private int length;
	private String director;
	public Disc() {
		
	}
	public Disc(String title) {
		super(title);
	}
	
	public Disc(String title, String category, float cost, int id) {
		super(title,category,cost,id);

	}
	
	public Disc (String title, String category, float cost, int id, int length, String director ) {
		super(title,category,cost,id);
		this.length=length;
		this.director=director;
	}
	
	public int getLength() {
		return length;
	}
	
	public String getdirector() {
		return director;
	}
	
	public void printList() {
		System.out.print("\t"+super.getId()+ ". Dvd. ");
		super.printList();
		System.out.println(" - Director : "+ director + " - " + "length : " + length);
		
	}
	
	
	
}