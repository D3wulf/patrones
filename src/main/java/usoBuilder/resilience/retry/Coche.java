package usoBuilder.resilience.retry;

import usoBuilder.builder.Persona;

public class Coche {
	
	String nombre;
	String modelo;
	int ruedas;
	
	private static Coche Unico;
	
	private Coche() {
	}
	
	public Coche(CocheBuilder cb){
		
		
        this.nombre = cb.getNombre();
        this.modelo= cb.getModelo();
        this.ruedas = cb.getRuedas();
	}
	

	@Override
	public String toString() {
		return "Coche [nombre=" + nombre + ", modelo=" + modelo + ", ruedas=" + ruedas + "]";
	}
	
	
	
	public static Coche getInstanceUnique(String nombre, String modelo, int ruedas) {
		
		if(Unico== null) {
			Unico = new CocheBuilder().nombre(nombre).modelo(modelo).ruedas(ruedas).build();
			System.out.println("Se ha creado una nueva instancia");
		}else {
			
			System.out.println("ya hay un objeto creado");
		}
		return Unico;
		
		
	}

}
