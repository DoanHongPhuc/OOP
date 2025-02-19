package hust.soict.hedspi.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	public int length;
	public float cost;

	public DigitalVideoDisc() {
	}
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	public String getTitle() {
		return title;
	}	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
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
	
	public float getCost() {
		return cost;
	}
	
	public void setCost(float cost) {
		this.cost = cost;
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
	
}
