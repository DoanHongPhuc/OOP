package hust.soict.hedspi.aims.media;

public abstract class Media implements Comparable  {
	private String title;
	private String category;
	private float cost;
	private int id;
	private int length;
	
	public Media() {
		
	}
	public Media (String titte) {
		this.title = titte;
	}
	
	public Media (String title, String category) {
		this(title);
		this.category = category;
	}
	
	public Media(String title, String category, float cost, int id) {
		this(title,category);
		this.id=id;
		this.cost = cost;
	}
	public Media(String title, String category, float cost, int id,int length ) {
		this(title,category,cost,id);
		this.length = length;
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
		return this.id;
	}
	public int getLength() {
		return length;
	}
	
	public void printList() {
		System.out.print( " Title : "+title +" - "+ "Category : "+category +" - "+"Cost : "+ cost);
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			Media tmp = (Media) obj;
		} catch (ClassCastException e){
			System.err.println("ERROR :" + e + " - Unable to cast type!");
		} catch (NullPointerException e){
			System.err.println("ERROR :" + e + " - Pointing to null object");
		}
		Media tmp =(Media) obj;
		if(tmp==null) return false;
		if(this.id==tmp.id) return true;
		else return false;
	}
	
	private static int stringCompare(String str1, String str2)
    {
  
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);
  
        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);
  
            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
        if (l1 != l2) {
            return l1 - l2;
        }
  
        // If none of the above conditions is true,
        // it implies both the strings are equal
        else {
            return 0;
        }
    }
	
	public int compareTo(Object obj) {
		try {
			Media tmp = (Media) obj;
		} catch (ClassCastException e){
			System.err.println("ERROR :" + e + " - ???Unable to cast type???");
		} catch (NullPointerException e){
			System.err.println("ERROR :" + e + " - ???Pointing to null object???");
		}
		Media tmp = (Media) obj;
		if ( tmp == null) return 0;
		else {
			
			if (this.cost > tmp.getCost()) return 1;
			else if (this.cost < tmp.getCost()) return -1;
				else {
					if (stringCompare(this.title,tmp.getTitle())>0) return 1;
					else if (stringCompare(this.title,tmp.getTitle())<0) return -1;
				}
		}
		return 0;
	}
}

