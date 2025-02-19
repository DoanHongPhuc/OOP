package hust.soict.hedspi.aims.media;

public class Track implements Playable {
	private int length;
	private String title;
	public Track() {
		
	}
	
	public Track (String title,int length) {
		this.length=length;
		this.title=title;
		
	}
	
	public int getLength() {
		return length;

	}
	public String getTitle() {
		return title;
	}
	
	public void play() {
		System.out.println("Playing the Track: " + this.getTitle());
		System.out.println(" Track length : "+this.getLength());
	}
	@Override
	public boolean equals(Object obj) {
		Track tmp =(Track) obj;
		if(tmp==null) return false;
		if(this.title.equals(tmp.title)&&this.length==tmp.length) return true;
		else return false;
	}
	

}
