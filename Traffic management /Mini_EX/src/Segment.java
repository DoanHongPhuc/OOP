import java.util.ArrayList;
public class Segment{
	private String name;
	private ArrayList<Bridge> ListBridge = new ArrayList<Bridge>();
	private ArrayList<Lane> ListLane = new ArrayList<Lane>();
	private ArrayList<Alley> ListAlley = new ArrayList<Alley>();
	public Segment(String name,ArrayList<Lane> lane) {
		this.name =name;
		assert lane.size()<1 : "Can co it nhat 1 Lane trong Segment";
		this.ListLane=lane;
	};
	public Segment(String name,ArrayList<Lane> lane,ArrayList<Bridge> bridge,ArrayList<Alley> alley) {
		this.name =name;
		assert lane.size()<1 : "Can co it nhat 1 Lane trong Segment";
		this.ListLane=lane;
		this.ListAlley=alley;
		this.ListBridge=bridge;
	};
	
	
	public void setName(String name) {
		this.name = name;
	};
	
	public String getName() {
		return this.name;
	};
	
	public void add(Bridge bridge) {
		this.ListBridge.add(bridge);
	}
	public void add(Lane lane) {
		this.ListLane.add(lane);
	}
	public void add(Alley alley) {
		this.ListAlley.add(alley);
	}
	
	public ArrayList<I> block(long tE,long tS, long time){
		assert time<1800: "Thoi gian cam chay nho hon toi thieu";
		assert time<43200: "Thoi gian cam chay lon hon toi da";
		ArrayList<I> list = new ArrayList<I>();
		for(int i=0;i<ListLane.size();i++) {
			if(tS<ListLane.get(i).gettS()&&tE>ListLane.get(i).gettE()) {
				list.add(ListLane.get(i));
			}
		}
		for(int i=0;i<ListBridge.size();i++) {
			if(tS<ListBridge.get(i).gettS()&&tE>ListBridge.get(i).gettE()) {
				list.add(ListBridge.get(i));
			}
		}
		return list;	
	}	

	
}