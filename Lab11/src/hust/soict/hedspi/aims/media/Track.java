package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.PlayerException;

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
	
	@Override
	public void play() throws PlayerException {
		if (this.getLength() > 0) {
			System.out.println("Playing Track: " + this.getTitle());
			System.out.println("Track length: " + this.getLength());
		} else {
			throw new PlayerException("ERROR: Track length is non-positive");
		}
	}
	@Override
	public boolean equals(Object obj) {
		Track tmp =(Track) obj;
		if(tmp==null) return false;
		if(this.title.equals(tmp.title)&&this.length==tmp.length) return true;
		else return false;
	}
	

}
