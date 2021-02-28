import java.util.*;

public class ShoppingCart {

	ArrayList<ItemOrder> cart = new ArrayList<ItemOrder>();
	
	public ShoppingCart() {
		cart = this.cart;
	}
	
	public void add(ItemOrder order) {
		//if(!cart.contains(order.getItem())) {
			cart.add(order);
		//}
	}
	
	public void setDiscount(boolean value) {
		//if the current item quantity is >= bulk price, value=true
		
	}
	
	public double getTotal() {
		double totalPrice = 0;
		for(ItemOrder x : cart) {
			totalPrice+= x.getPrice();
		}
		return totalPrice;
	}
}
