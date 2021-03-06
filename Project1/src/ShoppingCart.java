import java.util.*;

public class ShoppingCart {

	ArrayList<ItemOrder> cart = new ArrayList<ItemOrder>();
	double discount = 1.0;
	
	public ShoppingCart() {
		 this.cart = cart;
	}
	
	public void add(ItemOrder order) { 
		
		cart.add(order);
		
		for(int i = 0; i < cart.size()-1; i++) {
            if(order.getItem() == (cart.get(i).getItem())) {
                cart.remove(i);
            }
        }
	}
	
	public void setDiscount(boolean value) {
		if(value == true) { //changes variable to apply 10% discount
			discount=0.9;
		}
		if(value == false) { //changes back to multiply by 1 so user can click discount button 
			//and it won't keep adding discounted amount to total
			discount=1.0;
		}
	}
	
	public double getTotal() {
		double totalPrice = 0;
		for(ItemOrder x : cart) { //iterate thru cart and add prices of each item to get total
			totalPrice+= x.getPrice();
		}
		return totalPrice*discount;
	}
}
