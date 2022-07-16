
public abstract class Road {
	private float width;
	private float length;
	private int vMax;
	
	public Road(float width,float length, int vMax ) {
		this.length=length;
		this.vMax=vMax;
		this.width=width;
	}
	public Road(float width,float length ) {
		this.length=length;
		this.width=width;
	}
	public Road()  {
	}
	
	
	public float getWidth() {
		return this.width;
		
	}
	public float getLength() {
		return this.length;
	}
	public float getvMax() {
		return this.vMax;
	}
	public void setvMax(int vMax) {
		this.vMax=vMax;
	}
	
	

}
