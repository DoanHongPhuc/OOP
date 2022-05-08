public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered = 0;
	private MyDate dateOrdered;
	
	static public class NbOdered{
		public static final int MAX_LIMITTED_ORDERS = 5;
		private static int nbOrders = 0;
		public static int getNbOrders() {
			return nbOrders;
		}
		public static void setNbOrders(int nbOrders) {
			NbOdered.nbOrders = nbOrders;
		}
		
	}
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	public Order() {
		super();
		if( NbOdered.getNbOrders() >= NbOdered.MAX_LIMITTED_ORDERS) {
			System.out.println("Too much order");
		}
		else {
			this.dateOrdered = new MyDate();
			NbOdered.setNbOrders(NbOdered.getNbOrders() + 1);
			for(int i=0;i<MAX_NUMBER_ORDERED;i++) {
				itemOrdered[i] = new DigitalVideoDisc(null,null,null,0,0);
			}
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
		if(this.getQtyOrdered() < MAX_NUMBER_ORDERED) {
			this.itemOrdered[qtyOrdered]=dvd;
			this.qtyOrdered += 1;
		}
		else {
			System.out.println("Error out of memory !!!");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0 ; i < this.qtyOrdered ; i++) {
			if(this.itemOrdered[i].getCategory() == disc.getCategory() &&
				this.itemOrdered[i].getCost() == disc.getCost()&&
				this.itemOrdered[i].getDirector() == disc.getDirector()&&
				this.itemOrdered[i].getLength() == disc.getLength()&&
				this.itemOrdered[i].getTitle() == disc.getTitle() )
			{
					for(int j = i ; j < this.qtyOrdered -1; j++) {
						this.itemOrdered[j] = this.itemOrdered[j+1]; 
					}
					this.itemOrdered[this.qtyOrdered - 1].setCost(0f);
					this.itemOrdered[this.qtyOrdered - 1].setCategory(null);
					this.itemOrdered[this.qtyOrdered - 1].setDirector(null);
					this.itemOrdered[this.qtyOrdered - 1].setLength(0);
					this.itemOrdered[this.qtyOrdered - 1].setTitle(null);
					this.qtyOrdered -= 1;
			}
		}
	}
	
	public float totalCost() {
		float total = 0.0f;
		for(int i = 0; i <= qtyOrdered - 1; i++) {
			total += itemOrdered[i].getCost();
		}
		return total;
	}
	
	
	//Lad 04(addDigitalVideoDisc(DigitalVideoDisc [] dvdList)) 
	
	
	public void addDigitalVideoDiscList(DigitalVideoDisc [] dvdList) {
		for(int i=0; i<dvdList.length; i++) {
			if(this.getQtyOrdered() < MAX_NUMBER_ORDERED) {
				this.itemOrdered[qtyOrdered]=dvdList[i];
				System.out.println(dvdList[i].getTitle() + ":successfuly");
				this.qtyOrdered += 1;
				
			}
			else {
				System.out.println(dvdList[i].getTitle() + "cannot add order because of full order");
				break;
			}
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
		for(int i=0; i<dvdList.length; i++) {
			if(this.getQtyOrdered() < MAX_NUMBER_ORDERED) {
				this.itemOrdered[qtyOrdered]=dvdList[i];
				System.out.println(dvdList[i].getTitle() + ":successfuly");
				this.qtyOrdered += 1;
			}
			else {
				System.out.println(dvdList[i].getTitle() + "cannot add order because of full order");
				break;
			}
		}
		
	} 
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if(this.getQtyOrdered() > MAX_NUMBER_ORDERED-2) {
			System.out.println(dvd1.getTitle() + "cannot add order because of full order");
		}
		else {
			this.itemOrdered[qtyOrdered]=dvd1;
			System.out.println(dvd1.getTitle() + ":successfuly");
			this.qtyOrdered += 1;
			
			this.itemOrdered[qtyOrdered]=dvd1;
			System.out.println(dvd2.getTitle() + ":successfuly");
			this.qtyOrdered += 1;
		}
		
	}
	
	public void printOrder() {
		System.out.println("**********Order**********");
		this.dateOrdered.print();
		System.out.println("Total cost: " + this.totalCost() + "\nOrdered items: ");
		for(int i = 0; i < qtyOrdered; i++) {
			System.out.println("DVD" + itemOrdered[i].getTitle() + " - " + itemOrdered[i].getCategory() + " - " + itemOrdered[i].getDirector() + " : " + itemOrdered[i].getCost());;
		}
		
		System.out.println("*************************" + NbOdered.nbOrders);
	}
	
}
