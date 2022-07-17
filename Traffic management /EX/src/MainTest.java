import java.util.ArrayList;
public class MainTest {
	public static void main(String arg[]) {
		
		Bridge bri1 = new Bridge("A", 10,50);
		Bridge bri2 = new Bridge("B", 10,50);
		Alley alley1 = new Alley(1,6,100,40);
		Alley alley2 = new Alley(2,7,200,40);
		
		ArrayList<Alley> listAlley = new ArrayList<Alley>();
		ArrayList<Bridge> listBridge = new ArrayList<Bridge>();
		
		listAlley.add(alley1);
		listAlley.add(alley2);
		
		listBridge.add(bri1);
		listBridge.add(bri2);
		
		Lane lane = new Lane("Hai Ba Trung",50,1000,30,15000,10000,listAlley,listBridge);
		
		ArrayList<Lane> listLane = new ArrayList<Lane>();
		listLane.add(lane);
		
		Segment S = new Segment("Thang Long",listLane);
		
		System.out.println("Danh Sach bi cam chay:");
		System.out.println("------------------------------------------------------");
		ArrayList<I> result1 = new ArrayList<I>();
		result1 = S.block(9000, 16000);
		System.out.println("Cac ngo bi cam:");
		System.out.println("------------------------------------------------------");
		for(I i:result1) {
			if(i instanceof Alley) {
				Alley alley = (Alley) i;
				System.out.println(alley.getID());
			}
			
		}
		System.out.println("Cac cau bi cam:");
		System.out.println("------------------------------------------------------");
		for(I i:result1) {
			if(i instanceof Bridge) {
				Bridge bri = (Bridge) i;
				System.out.println(bri.getName());
			}
			
		}
		System.out.println("------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Danh Sach can phai don dep");
		System.out.println("------------------------------------------------------");
		ArrayList<Road> result2 = new ArrayList<Road>();
		result2 = S.clear(16000, 19000);
		System.out.println("Danh Sach cac duong can phai don dep:");
		System.out.println("------------------------------------------------------");
		for(Road road: result2) {
			if(road instanceof Lane) {
				Lane l = (Lane) road;
				System.out.println(l.getName());
			}
		}
		System.out.println("Danh sach cac ngo can don dep:");
		System.out.println("------------------------------------------------------");
		
		for(Road road: result2) {
			if(road instanceof Alley) {
				Alley alley = (Alley) road;
				System.out.println(alley.getID());
			}
		}
		System.out.println("------------------------------------------------------");
		
		
		
		
		
	}
	
	

}
