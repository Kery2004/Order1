
public class Cuisines {
	
	String Name;
	int Price;
	
public Cuisines(String dishname, int dishprice) {
		
		Name = dishname;
		Price = dishprice;
		
	}
	
	public String getName() {
		
		return Name;
		
	}
	public int getPrice() {
		
		return Price;
		
	}
	public String toString() {
		
		return String.format("%s %s$", Name, Price);
		
	}

}
