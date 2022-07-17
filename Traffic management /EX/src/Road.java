
public class Road {
	private int vMax;
	private float width;
	private float length;
	
	public Road() {
		
	}
	public Road(float width,float length) {
		this.length=length;
		this.width = width;
	}
	
	public Road(int vMax,float width,float length) {
		this.length=length;
		this.width = width;
		this.vMax = vMax;
	}
	
	public int getVMAX() {
		return this.vMax;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public float getLength() {
		return this.length;
	}
	
	public void setLength(float length) {
		this.length=length;
	}
	public void setWidth(float width) {
		this.width=width;
	}
	public void setVMax(int vMax) {
		this.vMax=vMax;
	}

}
