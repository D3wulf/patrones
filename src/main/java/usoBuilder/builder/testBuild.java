package usoBuilder.builder;

public class testBuild {

	public static void main(String[] args) {
		
		Usuario usuario = new UsuarioBuilder()
		        .email("nombre.apellido@gmail.com")
		        .nombre("Nombre")
		        .telefono("555123456")
		        .direccion("c\\ Rue el Percebe 13").build(); 
		
		Usuario usuario2 = new UsuarioBuilder()
		        .email("a@a.com")
		        .nombre("Mario")
		        .telefono("66666666")
		        .direccion("Ricardo Soriano").build(); 
		
		
		System.out.println(usuario2.toString());
		//Uso de Singleton
		/*
		Persona p1 = Persona.getInstanciaUnica("Mario", "sanchez", 12);
		System.out.println(p1);
		Persona p2 = Persona.getInstanciaUnica("Mario", "sanchez", 12);
		
		System.out.println(p2);
		*/
		
		
		
		

	}

}
