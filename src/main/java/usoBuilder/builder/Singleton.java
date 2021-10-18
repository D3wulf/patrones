package usoBuilder.builder;

public class Singleton {
	
		private String nombre;
		private String apellido;
		private int edad;
		private static Singleton soloUno;
		
		private Singleton(String nombre, String apellido, int edad) {
			
			
			this.nombre= nombre;
			System.out.println(nombre);
		}
		
		public static Singleton getInstanciaUnica(String nombre, String apellido, int edad) {
			
			if(soloUno== null) {
				soloUno = new Singleton(nombre, apellido, edad);
			}else {
				
				System.out.println("ya hay un objeto creado");
			}
			return soloUno;
			
			
		}
		
		
		
		
		
		
	}


