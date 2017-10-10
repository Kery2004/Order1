import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int fchoice = 0, schoice, loopchoice = 1;
		boolean check = false;
		// First data from user below:
		System.out.println("Do want order lunch or drink?\n" + "1. Lunch\n" + "2. Drink");
		do {
			try {
				fchoice = scan.nextInt();
				if (fchoice > 2 || fchoice < 1) { // data must be equal to 1 or 2
					System.out.println("Please enter a number  1 for lunch, 2 for drinks ");
				} else
					check = true; // if we got here all with data is OK
			} catch (Exception e) {
				System.out.println("Please enter a number  1 for lunch, 2 for drinks ");

			}
		} while (check == false);

		switch (fchoice) {
		case 1:
			System.out.println("From what cuisines would you like to order?");

			ArrayList<Cuisines> lista = new ArrayList<Cuisines>(); // list of Cuisines
			lista.add(new Cuisines("Poland"));
			lista.add(new Cuisines("Mexican"));
			lista.add(new Cuisines("Italian"));
			for (Cuisines o : lista) { // loop through all Cuisines
				System.out.println(loopchoice + "." + o.getName());
				loopchoice++;
			}
			// Second data from user
			scan.reset(); // cleaning input
			check = false; // assign start value for check
			schoice = scan.nextInt();

			break;

		}

	}

}
