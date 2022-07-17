
public class Bridge implements I{
	private float length;
	private float width;
	private String name;
	
	public Bridge(String name,float width, float length) {
		this.name = name;
		this.length = length;
		this.width = width;
	}
	
	public Bridge() {}
	
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
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}

}
