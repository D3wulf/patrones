
package usoBuilder.builder;

public class Usuario {
	
	private String nombre;
	private String email;
	private String telefono;
	private String direccion;
	
	private Usuario() {
    }
	
	Usuario(UsuarioBuilder builder) {
       
        this.email = builder.getEmail();
        this.nombre = builder.getNombre();
        this.telefono = builder.getTelefono();
        this.direccion = builder.getDireccion();
    }
	
	

}
