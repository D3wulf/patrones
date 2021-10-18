package usoBuilder.prototype;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		
		List<Cosa> cosas= new ArrayList<Cosa>();
		
		Cosa g= new Gijoe("Mercenario", "azul", "juguete");
		

		Cosa g2 = g.clone();
		Cosa g3 = g.clone();
		Cosa g4 = g.clone();
		Cosa g5 = g.clone();
		
		cosas.add(g3);
		cosas.add(g4);
		cosas.add(g5);
		
		for(Cosa item: cosas) {
			
			System.out.println(item.toString());
		}
		
		
		
		

	}

}
