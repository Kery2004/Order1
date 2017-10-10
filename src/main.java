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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
				ArrayList<Cuisines> lista = new ArrayList<Cuisines>(); // list of Cuisines
				lista.add(new Poland("Schabowy", 15));
				lista.add(new Poland("Golonka", 16));
				lista.add(new Poland("¯urek", 11));
				loopthroughCuisines(lista);

				int sumOrder = lista.get(readfromuser(x)).getPrice();
				break;
			case 2:
				System.out.println("here's the list of Mexican Cuisines");
				break;
			case 3:
				System.out.println("here's the list of Italiano Cuisines");
				break;
			}
			// Second data from user
			// scan.reset(); // cleaning input
			// check = false; // assign start value for check
			// schoice = scan.nextInt();

			break;

		}

	}

}
