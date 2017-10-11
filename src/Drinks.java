//class for drink object
public class Drinks {

	private String Name;
	private int Price;

	// Constructor with 1 argument
	public Drinks(String drinks) {

		Name = drinks;

	}

	// Constructor with 2 argument
	public Drinks(String drinks, int drinkprice) {

		Name = drinks;
		Price = drinkprice;

	}

	// gettters
	public String getName() {

		return Name;

	}

	public int getPrice() {

		return Price;

	}

	// String representation of object
	public String toString() {

		return String.format("%s %s$", Name, Price);

	}

}
