import java.util.ArrayList;
import java.util.Scanner;

//Food ordering system for X-fundation by Jakub Œwi¹tek

public class main {

	// method readfrouser is reading a data from user and checking it
	public static int readfromuser(int x) {

		Scanner scan = new Scanner(System.in);
		boolean check = false;
		int fchoice = 0;
		do {
			try {
				while (!scan.hasNextInt()) { // searching numbers only
					System.out.println("Please enter a number from 1 to " + x);
					scan.next();
				}
				fchoice = scan.nextInt();
				if (fchoice > x || fchoice < 1) { // data must be from 1 to x
					System.out.println("Please enter a number from 1 to " + x);
				} else
					check = true; // if we got here, data is OK
			} catch (Exception e) {
				System.out.println("Please enter a number from 1 to " + x);

			}
		} while (check == false);

		return fchoice;
	}

	// method loopthrough is showing in console all data from ArrayList giving to
	// method as argument
	public static void loopthrough(ArrayList<?> array) {
		int loopchoice = 1;
		for (Object o : array) { // loop through all Cuisines
			System.out.println(loopchoice + "." + o);
			loopchoice++;
		}
	}

	public static void main(String[] args) {

		int sumOrder = 0, xyu = 0;
		ArrayList<Cuisines> lista = new ArrayList<Cuisines>(); // list of Cuisines
		boolean icecubs = false, lemon = false; // variable for drinks
		String namedish = "", namedesert = "", namedrink = ""; // variable for object "names"

		// First data from user below:
		System.out.println("Do you want to order lunch or drink?");
		ArrayList<String> helplist = new ArrayList<String>();
		helplist.add("Lunch");
		helplist.add("Drink");
		loopthrough(helplist);

		int x = helplist.size();
		switch (readfromuser(x)) { // passing size arraylist to method readfromuser
		case 1:
			System.out.println("From what cuisines would you like to choose?");

			helplist.clear();
			helplist.add("Poland");
			helplist.add("Mexican");
			helplist.add("Italiano");
			loopthrough(helplist);

			x = 0;
			x = helplist.size();
			helplist.clear();
			switch (readfromuser(x)) {
			case 1:
				System.out.println("Here is a list of Poland cuisines");
				lista.add(new Poland("Schabowy", 15));
				lista.add(new Poland("Golonka", 16));
				lista.add(new Poland("Zurek", 11));
				loopthrough(lista);
				x = 0;
				x = lista.size();
				xyu = readfromuser(x);
				namedish = lista.get(xyu - 1).getName(); // passing object name to namedish
				sumOrder = lista.get(xyu - 1).getPrice();
				lista.clear();
				System.out.println("Here is a list of Poland desert");
				lista.add(new Poland("Jablecznik", 15));
				lista.add(new Poland("Szarlotka", 16));
				lista.add(new Poland("Sernik", 11));
				loopthrough(lista);
				x = 0;
				x = lista.size();
				xyu = 0;
				xyu = readfromuser(x);
				namedesert = lista.get(xyu - 1).getName().toLowerCase();
				sumOrder += lista.get(xyu - 1).getPrice();
				break;
			case 2:
				System.out.println("Here is a list of Mexican cuisines");
				lista.add(new Mexican("Chilaquiles", 24));
				lista.add(new Mexican("Pozole", 23));
				lista.add(new Mexican("Tacos al pastor", 25));
				loopthrough(lista);
				x = 0;
				x = lista.size();
				xyu = 0;
				xyu = readfromuser(x);
				namedish = lista.get(xyu - 1).getName();
				sumOrder = lista.get(xyu - 1).getPrice();
				lista.clear();
				System.out.println("Here is a list of Mexican desert");
				lista.add(new Poland("Churros", 15));
				lista.add(new Poland("Natilla de nuez", 16));
				lista.add(new Poland("Boca negra", 11));
				loopthrough(lista);
				x = 0;
				x = lista.size();
				xyu = 0;
				xyu = readfromuser(x);
				namedesert = lista.get(xyu - 1).getName().toLowerCase();
				sumOrder += lista.get(xyu - 1).getPrice();
				break;
			case 3:
				System.out.println("Here is a list of Italiano cuisines");
				lista.add(new Italiano("Pizza", 25));
				lista.add(new Italiano("Lasagne", 28));
				lista.add(new Italiano("Spaghetti", 21));
				loopthrough(lista);
				x = 0;
				x = lista.size();
				xyu = 0;
				xyu = readfromuser(x);
				namedish = lista.get(xyu - 1).getName();
				sumOrder = lista.get(xyu - 1).getPrice();
				lista.clear();
				System.out.println("Here is a list of Italiano desert");
				lista.add(new Poland("Panna cotta", 15));
				lista.add(new Poland("Tiramisu", 16));
				lista.add(new Poland("Creme brulee", 21));
				loopthrough(lista);

				x = 0;
				x = lista.size();
				xyu = 0;
				xyu = readfromuser(x);
				namedesert = lista.get(xyu - 1).getName().toLowerCase();
				sumOrder += lista.get(xyu - 1).getPrice();
				break;

			}
			System.out.println("Your order is a " + namedish + " and " + namedesert + " cost " + sumOrder + "$");
			break;
		case 2:
			ArrayList<Drinks> drinklist = new ArrayList<Drinks>(); // list of drinks
			System.out.println("Here is a list of drinks");
			drinklist.add(new Drinks("Margarita", 12));
			drinklist.add(new Drinks("Mojito", 12));
			drinklist.add(new Drinks("Cuba libre", 12));
			loopthrough(drinklist);
			x = 0;
			x = drinklist.size();
			xyu = 0;
			xyu = readfromuser(x);
			namedrink = drinklist.get(xyu - 1).getName();
			sumOrder = drinklist.get(xyu - 1).getPrice();
			System.out.println("With ice cubes?\n" + "1.Yes\n" + "2.No");
			icecubs = (readfromuser(2) == 1) ? true : false;
			System.out.println("How about lemon?\n" + "1.Yes\n" + "2.No");
			lemon = (readfromuser(2) == 1) ? true : false;
			if (icecubs == true && lemon == true) { // if statement for choosing or not icecubes/lemon
				System.out.println(
						"Your order is a" + namedrink + " with icecubes and lemons " + "cost " + sumOrder + "$");
			} else if (icecubs == true) {
				System.out.println("Your order is a " + namedrink + " with icecubes " + "cost " + sumOrder + "$");
			} else if (lemon == true) {
				System.out.println("Your order is a" + namedrink + " with lemons " + "cost " + sumOrder + "$");
			} else
				System.out.println("Your order is a" + namedrink + "cost " + sumOrder + "$");
			break;

		}

	}

}
