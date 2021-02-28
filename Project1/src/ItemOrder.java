
public class ItemOrder {

	Item item;
	int quantity;
	
	public ItemOrder(Item item, int quantity) {
		item = this.item;
		quantity = this.quantity;
	}
	
	public double getPrice() {
		double total = item.priceFor(quantity);
		return total;
	}
	
	public Item getItem() {
		return this.item;
	}
}
