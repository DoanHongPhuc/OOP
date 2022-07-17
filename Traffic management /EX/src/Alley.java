
public class Alley extends Road implements I {
	private int id;
	
	public Alley(int id) {
		super();
		this.id=id;
	}
	
	public Alley(int id,float width,float length, int vMax) {
		super(vMax,width,length);
		this.id = id;
		if(width*length < 5) {
			super.setVMax(0);
		}
	}
	
	public int getID() {
		return this.id;
	}
	
	public void setID(int id) {
		this.id = id;
	}

}
