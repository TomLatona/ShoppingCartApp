
public class Item {

	String name;
	double price;
	int bulkQuantity;
	double bulkPrice;
	
	public Item(String name, double price) {
		name = this.name;
		price = this.price;
	}
	
	public Item(String name, double price, int bulkQuantity, double bulkPrice) {
		name = this.name;
		price = this.price;
		bulkQuantity = this.bulkQuantity;
		bulkPrice = this.bulkPrice;
	}
	
	public double priceFor(int quantity) {
		if(quantity >= bulkQuantity) {
			price = bulkPrice;
		}
		double qprice = price * quantity;
		return qprice;
	}
	
	public String toString() {
		String statement = (name + ", " + price);
		if(bulkPrice > 0) {
			statement = (name + ", "+price+". or "+bulkQuantity+" for "+bulkPrice);
		}
		return statement;
	}
}
