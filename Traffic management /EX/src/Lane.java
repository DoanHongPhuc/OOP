import java.util.*;
public class Lane extends Road {
	private String name;
	private ArrayList<Alley> listAlley = new ArrayList<Alley>();
	private ArrayList<Bridge> listBridge = new ArrayList<Bridge>();
	
	private long tE;
	private long tS;
	
	public Lane() {}
	
	public Lane(String name,int vMax,float length, float width,long tE,long tS) {
		super(vMax,width,length);
		this.name=name;
		this.tE = tE;
		this.tS = tS;
	}
	public Lane(String name,int vMax,float length,float width,long tE,long tS, ArrayList<Alley> listAlley) {
		super(vMax,width,length);
		this.tE = tE;
		this.tS = tE;
		this.listAlley=listAlley;
		this.name = name;
	}
	public Lane(String name,int vMax,float length,float width,long tE,long tS, ArrayList<Alley> listAlley, ArrayList<Bridge> listBridge) {
		super(vMax,width,length);
		this.tE = tE;
		this.tS = tE;
		this.listAlley=listAlley;
		this.listBridge = listBridge;
		this.name= name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public long getTE() {
		return this.tE;
	}
	
	public long getTS() {
		return this.tS;
	}
	
	public ArrayList<Alley> getlistAlley(){
		return this.listAlley;
	}
	
	public ArrayList<Bridge> getlistBridge(){
		return this.listBridge;
	}

	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setTE(long tE) {
		this.tE=tE;
	}
	
	public void setTS(long tS) {
		this.tS=tS;
	}
	
	public void addAlley(Alley alley) {
		this.listAlley.add(alley);
	}
	
	public void addBridge(Bridge bridge) {
		this.listBridge.add(bridge);
	}
}
