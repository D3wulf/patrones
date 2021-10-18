package usoBuilder.builder;

public class UsuarioBuilder {
	
		Usuario usuario;
		
		public Usuario build(String nombre, String email, String telefono, String direccion) {
			
			usuario = new Usuario(nombre, email, telefono, direccion);
					
			return usuario;
	};



	}
