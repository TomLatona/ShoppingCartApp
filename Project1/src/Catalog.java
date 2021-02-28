import java.util.*;

public class Catalog {

	String name;
	ArrayList<Item> list = new ArrayList<Item>();
	
	public Catalog(String name) {
		name = this.name;
	}
	
	public void add(Item item) {
		list.add(item);
	}
	
	public int size() {
		return list.size();
	}
	
	public Item get(int index) {
		Item x = list.get(index);
		return x;
	}
	
	public String getName() {
		return name;
	}
}
