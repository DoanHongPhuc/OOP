
public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered = 0;
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	public Order() {
		for(int  i = 0 ; i < MAX_NUMBER_ORDERED ;i++) {
			itemOrdered[i] = new DigitalVideoDisc(null,null,null,0,0);
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
		if(this.getQtyOrdered() < MAX_NUMBER_ORDERED) {
			this.itemOrdered[qtyOrdered].setTitle(dvd.getTitle());
			this.itemOrdered[qtyOrdered].setCategory(dvd.getCategory());
			this.itemOrdered[qtyOrdered].setDirector(dvd.getDirector());
			this.itemOrdered[qtyOrdered].setLength(dvd.getLength());
			this.itemOrdered[qtyOrdered].setCost(dvd.getCost());
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
		float total = 0 ;
		for(int i = 0 ; i < MAX_NUMBER_ORDERED ; i++) {
			total += itemOrdered[i].getCost();
		}
		return total;
	}
	
}
