

public class Alley extends Road {
	private int id;
	
	public Alley(int id) {
		super();
		this.id=id;
	}
	public Alley(int id, float width,float length,int vMax) {
		super(width,length,vMax);
		this.id=id;
		if(length*width<=5){
			super.setvMax(0);
			System.out.print("Kich thuoc qua nho toc do toi da la 0");
		}
	}
	public int getId() {
		return this.id;
	}
	


}
