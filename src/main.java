import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static int readfromuser(int x) {

		Scanner scan = new Scanner(System.in);
		boolean check = false;
		int fchoice = 0;
		do {
			try {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int loopchoice = 1;

		// First data from user below:
		System.out.println("Do you want order lunch or drink?");
		ArrayList<String> helplist = new ArrayList<String>(); // list of Cuisines
		helplist.add("Lunch");
		helplist.add("Drink");
		for (String o : helplist) { // loop through all Cuisines
			System.out.println(loopchoice + "." + o);
			loopchoice++;
		}
		int x = helplist.size();
		switch (readfromuser(x)) {
		case 1:
			loopchoice = 1;
			System.out.println("From what cuisines would you like to order?");

			ArrayList<Cuisines> lista = new ArrayList<Cuisines>(); // list of Cuisines
			lista.add(new Cuisines("Poland"));
			lista.add(new Cuisines("Mexican"));
			lista.add(new Cuisines("Italian"));
			for (Cuisines o : lista) { // loop through all Cuisines
				System.out.println(loopchoice + "." + o.getName());
				loopchoice++;
			}
			x = 0;
			x = lista.size();
			readfromuser(x);
			// Second data from user
			// scan.reset(); // cleaning input
			// check = false; // assign start value for check
			// schoice = scan.nextInt();

			break;

		}

	}

}
