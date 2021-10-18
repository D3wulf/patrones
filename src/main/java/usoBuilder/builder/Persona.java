package usoBuilder.builder;

public class Persona {
	
		private String nombre;
		private String apellido;
		private int edad;
		
		private static Persona soloUno;
		
		private Persona(String nombre, String apellido, int edad) {
			
			
			this.nombre= nombre;
			this.apellido= apellido;
			this.edad= edad;
			System.out.println(nombre);
		}
		
		public static Persona getInstanciaUnica(String nombre, String apellido, int edad) {
			
			if(soloUno== null) {
				soloUno = new Persona(nombre, apellido, edad);
				System.out.println("Se ha creado una nueva instancia");
			}else {
				
				System.out.println("ya hay un objeto creado");
			}
			return soloUno;
			
			
		}
		
		
		
		
		
		
	}


