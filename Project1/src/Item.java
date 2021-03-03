import java.text.*;

public class Item {

	String name;
	double price;
	int bulkQuantity;
	double bulkPrice;
	
	NumberFormat nf = NumberFormat.getCurrencyInstance();
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
		
		if(this.price < 0) {
			throw new IllegalArgumentException("Negative price not accepted");
		}
	}
	
	
	public Item(String name, double price, int bulkQuantity, double bulkPrice) {
		this.name = name;
		this.price = price;
		this.bulkQuantity = bulkQuantity;
		this.bulkPrice = bulkPrice;
		
		if(this.price < 0 || this.bulkQuantity < 0 || this.bulkPrice < 0) {
			throw new IllegalArgumentException("Negative value not accepted");
		}
	}
	
	
	public double priceFor(int quantity) {
		double xprice=0.0;
		
		if(bulkQuantity > 0) { //seperates the two Item objects (2 and 4)
			
			if(quantity == bulkQuantity) {
				price = bulkPrice/quantity; 
				return price*quantity;
			}
			if(quantity >= bulkQuantity) {
				int remainingItems = quantity % bulkQuantity;
				int bulkQuantityTotal = (quantity - remainingItems)/bulkQuantity; //in case user inputs a multiple of the bulkQuantity
				xprice = bulkPrice*bulkQuantityTotal + (price*remainingItems); //gives the bulk discount and the regular price for the extra items
				return xprice;
			}
			else {
				return price*quantity; //in case user enters less quantity than the bulk quantity
			}
		}
		double qprice = price * quantity; //for the Items with only name and price
		return qprice;
	}
	
	
	public String toString() {
		
		String priceText = nf.format(price);
		String bulkpriceText = nf.format(bulkPrice);
        
		String statement = (name + ", " + price);
        
        if(bulkPrice > 0) {
            statement = (name + ", "+priceText+". or "+bulkQuantity+" for "+bulkpriceText);
        }
        return statement;
    }
}
