package usoBuilder.prototype2;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		
		List<Juguete> juguetes = new ArrayList<Juguete>();
	
		Juguete b1= new Boardgame("Nuevo juego", 35, "Estrategia");
		
		
		juguetes.add(b1);
		
		Boardgame b2 = (Boardgame) b1.clone();
		
		juguetes.add(b2);
		
		b1.setNombre("Carcassonne");
		
		System.out.println(b1);
		System.out.println(b2);
		
		
	}

}
