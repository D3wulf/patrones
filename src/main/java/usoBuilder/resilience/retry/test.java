package usoBuilder.resilience.retry;

public class test {
	
	public static void main(String[] args) {
		
		/*
		Coche coche1= new CocheBuilder().nombre("Focus").modelo("Ford").ruedas(4).build();
		Coche c2= new CocheBuilder().nombre("Scenic").modelo("Scenic").ruedas(4).build();
		System.out.println(coche1.toString());
		System.out.println(c2.toString());
		
		*/
		
		
		// Uso con Singleton
		/*
		Coche c3 = Coche.getInstanceUnique("Focus", "Ford", 4);
		
		Coche c4 = Coche.getInstanceUnique("Focus", "Ford", 4);
		System.out.println(c4);
		*/
		Retry r1= new Retry("pico","1111");
		
		r1.getConnection();
		
		Retry r2 = new Retry("pepe", "1111");
		
		r2.getConnection();
		
		
	
	
	}

}
