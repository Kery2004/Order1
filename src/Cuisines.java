//polimorph base class
public class Cuisines {

	private String Name;
	private int Price;

	// Constructor with 1 argument
	public Cuisines(String dishname) {

		Name = dishname;

	}

	// Constructor with 2 argument
	public Cuisines(String dishname, int dishprice) {

		Name = dishname;
		Price = dishprice;

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
