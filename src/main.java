import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static int readfromuser(int x) {

		Scanner scan = new Scanner(System.in);
		boolean check = false;
		int fchoice = 0;
		do {
			try {
				while (!scan.hasNextInt()) { // searching for numbers
					System.out.println("Please enter a number from 1 to " + x);
					scan.next();
				}
				fchoice = scan.nextInt();
				if (fchoice > x || fchoice < 1) { // data must be from 1 to x
					System.out.println("Please enter a number from 1 to " + x);
				} else
					check = true; // if we got here all with data is OK
			} catch (Exception e) {
				System.out.println("Please enter a number from 1 to " + x);

			}
		} while (check == false);

		return fchoice;
	}

	public static void loopthrough(ArrayList<String> array) {
		int loopchoice = 1;
		for (String o : array) { // loop through all Cuisines
			System.out.println(loopchoice + "." + o);
			loopchoice++;
		}
	}

	public static void loopthroughCuisines(ArrayList<Cuisines> arrayCuisines) {
		int loopchoice = 1;
		for (Cuisines o : arrayCuisines) { // loop through all Cuisines
			System.out.println(loopchoice + "." + o);
			loopchoice++;
		}
	}

	public static void loopthroughDrinks(ArrayList<Drinks> arrayDrinks) {
		int loopchoice = 1;
		for (Drinks o : arrayDrinks) { // loop through all Cuisines
			System.out.println(loopchoice + "." + o);
			loopchoice++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOrder = 0;
		ArrayList<Cuisines> lista = new ArrayList<Cuisines>(); // list of Cuisines
		boolean icecubs = false, lemon = false;
		String namedish = "", namedesert = "", namedrink = "";
		// First data from user below:
		System.out.println("Do you want order lunch or drink?");
		ArrayList<String> helplist = new ArrayList<String>(); // list of Cuisines
		helplist.add("Lunch");
		helplist.add("Drink");
		loopthrough(helplist);

		int x = helplist.size();
		switch (readfromuser(x)) { // passing size arraylist to method readfromuser
		case 1:
			System.out.println("From what cuisines would you like to order?");

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
				System.out.println("here's the list of Poland Cuisines");
				lista.add(new Poland("Schabowy", 15));
				lista.add(new Poland("Golonka", 16));
				lista.add(new Poland("¯urek", 11));
				loopthroughCuisines(lista);
				x = 0;
				x = lista.size();
				int xyu = readfromuser(x);
				namedish = lista.get(xyu - 1).getName();
				sumOrder = lista.get(xyu - 1).getPrice();
				lista.clear();
				System.out.println("here's the list of Poland desert");
				lista.add(new Poland("ciasto jablecznikowe", 15));
				lista.add(new Poland("ciasto takie", 16));
				lista.add(new Poland("ciasto inne", 11));
				loopthroughCuisines(lista);
				x = 0;
				x = lista.size();
				xyu = readfromuser(x);
				namedesert = lista.get(xyu - 1).getName();
				sumOrder += lista.get(xyu - 1).getPrice();
				break;
			case 2:
				System.out.println("here's the list of Mexican Cuisines");
				lista.add(new Mexican("Chilaquiles", 15));
				lista.add(new Mexican("Pozole", 16));
				lista.add(new Mexican("Tacos al pastor", 11));
				loopthroughCuisines(lista);
				x = 0;
				x = lista.size();
				xyu = readfromuser(x);
				namedish = lista.get(xyu - 1).getName();
				sumOrder += lista.get(xyu - 1).getPrice();
				lista.clear();
				System.out.println("here's the list of Mexican desert");
				lista.add(new Poland("ciasto jablecznikowe", 15));
				lista.add(new Poland("ciasto takie", 16));
				lista.add(new Poland("ciasto inne", 11));
				loopthroughCuisines(lista);
				x = 0;
				x = lista.size();
				xyu = readfromuser(x);
				namedesert = lista.get(xyu - 1).getName();
				sumOrder += lista.get(xyu - 1).getPrice();
				break;
			case 3:
				System.out.println("here's the list of Italiano Cuisines");
				lista.add(new Italiano("Schabowy", 15));
				lista.add(new Italiano("Golonka", 16));
				lista.add(new Italiano("¯urek", 11));
				loopthroughCuisines(lista);
				x = 0;
				x = lista.size();
				xyu = readfromuser(x);
				namedish = lista.get(xyu - 1).getName();
				sumOrder += lista.get(xyu - 1).getPrice();
				lista.clear();
				System.out.println("here's the list of Italiano desert");
				lista.add(new Poland("ciasto jablecznikowe", 15));
				lista.add(new Poland("ciasto takie", 16));
				lista.add(new Poland("ciasto inne", 11));
				loopthroughCuisines(lista);

				x = 0;
				x = lista.size();
				xyu = readfromuser(x);
				namedesert = lista.get(xyu - 1).getName();
				sumOrder += lista.get(xyu - 1).getPrice();
				break;

			}
			System.out.println("Your order is " + namedish + " and " + namedesert + " will cost " + sumOrder + "$");
			break;
		case 2:
			ArrayList<Drinks> drinklist = new ArrayList<Drinks>(); // list of Cuisines
			System.out.println("here's the list of drinks");
			drinklist.add(new Drinks("Schabowy", 15));
			drinklist.add(new Drinks("Golonka", 16));
			drinklist.add(new Drinks("¯urek", 11));
			loopthroughDrinks(drinklist);
			int ux = 0;
			ux = drinklist.size();
			int xyu1 = readfromuser(ux);
			namedish = drinklist.get(xyu1 - 1).getName();
			sumOrder = drinklist.get(xyu1 - 1).getPrice();
			System.out.println("With ice cubs?\n" + "1.Yes\n" + "2. No");
			icecubs = (readfromuser(2) == 1) ? true : false;
			System.out.println("how about lemon?\n" + "1.Yes\n" + "2. No");
			lemon = (readfromuser(2) == 1) ? true : false;
			if (icecubs == true && lemon == true) {
				System.out.println(
						"Your order is " + namedish + " with icecubs and lemons " + " will cost " + sumOrder + "$");
			} else if (icecubs == true) {
				System.out.println("Your order is " + namedish + " with icecubs " + " will cost " + sumOrder + "$");
			} else if (lemon == true) {
				System.out.println("Your order is " + namedish + " with lemons " + " will cost " + sumOrder + "$");
			} else
				System.out.println("Your order is " + namedish + " will cost " + sumOrder + "$");
			break;

		}

	}

}
