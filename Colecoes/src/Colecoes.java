import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Colecoes {

	public static void main(String[] args) {
		
		
		//lista();
		listaLinkada();
		
		
		
	}
	
	static void listaLinkada() {
		LinkedList<String> carros = new LinkedList<String>();
		carros.add("Fuke");
		carros.addFirst("TL");
		carros.add(0, "sp2");
		
		System.out.println(carros.toString());
	}
	
	static void lista() {
		//String[] cars = new String[10];
				//ArrayList<String> carros = new ArrayList<>();
				List<String> carros = new ArrayList<>();
				carros.add("Fuke");
				carros.add("sp2");		
				carros.add("etios");
				carros.add("Fusca");
				carros.add("sp2");		
				carros.add("etios");
				
				System.out.println(carros.size());
				System.out.println(carros.getFirst());
				System.out.println(carros.get(1));
				System.out.println(carros.getLast());
				carros.add(5, "Kombi");
				carros.remove(0);
				
				carros.set(1, "TL");
				
				
				
				System.out.println(carros.toString());
	}

}
