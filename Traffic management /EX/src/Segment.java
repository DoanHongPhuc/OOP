import java.util.*;
public class Segment implements Environment{
	private String name;
	private ArrayList<Lane> listLane = new ArrayList<Lane>();
	public Segment(String name,ArrayList<Lane> listLane) {
		assert listLane.size()<1 : "Segment can chua it nhat la 1 Lane";
		this.name = name;
		this.listLane = listLane;
	}
	
	public String getName() {
		return this.name;
	}
	
	public ArrayList<Lane> getListLane(){
		return this.listLane;
	}
	
	public void addLane(Lane lane) {
		this.listLane.add(lane);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<I> block(long tS, long tE) {
		long time;
		ArrayList<I> result = new ArrayList<I>();
		time = tE - tS;
		if (time>1800 && time<43200) {
			for(Lane lane: this.listLane) {
				if(tS<lane.getTS()&&tE>lane.getTS()) {
					for(Bridge bridge:lane.getlistBridge()) {
						result.add(bridge);
					}
					for(Alley alley: lane.getlistAlley()) {
						result.add(alley);
					}
				}
			}
		}
		else System.out.println("Thoi gian cam duong qua it hoac qua dai");
		
		return result;
	}
	
	public ArrayList<Road> clear(long tE,long tS){
		ArrayList<Road> result = new ArrayList<Road>();
		for(Lane lane: this.listLane) {
			if((tE<lane.getTS()&&tS<lane.getTS())||(tE>lane.getTE()&&tS>lane.getTE())) {
				result.add(lane);
				for(Alley alley: lane.getlistAlley()) {
					result.add(alley);
				}
			}
		}
		return result;	
	}
	
	

}
