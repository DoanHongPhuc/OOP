
public class Bridge implements I {
	private int id;
	private float width;
	private float length;
	private long tE;
	private long tS;
	
	public Bridge(int id) {
		this.id = id;
	}
	public Bridge(int id, float width,float length,long tS,long tE) {
		this.id=id;
		this.width=width;
		this.length=length;
		this.tE=tE;
		this.tS=tE;
	}
	
	public long gettS() {
		return this.tS;
	}
	
	public long gettE() {
		return this.tE;
	}
	
	public int getId() {
		return this.id;
	}
	
	public float getWidth() {
		return this.width;
		
	}
	public float getLength() {
		return this.length;
	}
	
	public void settS(long tS) {
		this.tS=tS;
	}
	public void settE(long tE) {
		this.tE = tE;
	}
	public void setWidth(float width) {
		this.width=width;
	} 
	public void setLength(float length) {
		this.length = length; 
	}
	

	
	

}
