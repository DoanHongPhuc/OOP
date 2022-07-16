
public class Lane extends Road implements I{
	private long tS;
	private long tE;
	private String name;
	private int id;
	
	public Lane (float width, float length, int vMax) {
		super(width,length,vMax);
	}
	
	public Lane (float width, float length,int vMax,String name,long tS,long tE) {
		super(width,length,vMax);
		this.name=name;
		this.tE=tE;
		this.tS=tS;
	}
	
	public String getName() {
		return this.name;
	}
	
	public long gettS() {
		return this.tS;
	}
	
	public long gettE() {
		return this.tE;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void settS(long tS) {
		this.tS=tS;
	}
	public void settE(long tE) {
		this.tE = tE;
	}
	public int getId() {
		return this.id;
	}

}
