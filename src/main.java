import java.util.ArrayList;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Cuisines> lista = new ArrayList<Cuisines>();
		
		lista.add(new Poland("schabowy", 15));
		lista.add(new Poland("schabowy2", 19));
		lista.add(new Poland("schabowy3", 16));
		int i = 1;
		int suma = lista.get(i-1).getPrice();
		suma += lista.get(i).getPrice();
		System.out.println(suma);
		
		int aaaaa;
		
		
	}

}
