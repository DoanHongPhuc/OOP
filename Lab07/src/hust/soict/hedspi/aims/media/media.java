package hust.soict.hedspi.aims.media;

public abstract class media  {
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
	
	public media(String title, String category, float cost, int id) {
		this(title,category);
		this.cost = cost;
	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	
	public int getId() {
		return id;
	}
	
	public void printList() {
		System.out.print( " Title : "+title +" - "+ "Category : "+category +" - "+"Cost : "+ cost);
	}
	

}

