package hust.soict.hedspi.aims.media;

public class media {
	private String title;
	private String category;
	private float cost;
	private int id;
	
	public media() {
		
	}
	public media (String titte) {
		this.title = titte;
	}
	
	public media (String title, String category) {
		this(title);
		this.category = category;
	}
	
	public media(String title, String category, float cost) {
		this(title,category);
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void printList() {
		System.out.print( " Title : "+title +" - "+ "Category : "+category +" - "+"Cost : "+ cost);
	}
	

}

