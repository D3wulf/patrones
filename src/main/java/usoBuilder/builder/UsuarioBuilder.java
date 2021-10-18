package usoBuilder.builder;

public class UsuarioBuilder {
	
			private String email;
		    private String nombre;   
		    private String telefono;
		    private String direccion;
		    
		    public UsuarioBuilder() {
		    }

		    public UsuarioBuilder email(String email) {
		        this.email = email;
		        return this;
		    }

		    public UsuarioBuilder nombre(String nombre) {
		        this.nombre = nombre;
		       
		        return this;
		    }

		    public UsuarioBuilder telefono(String telefono) {
		        this.telefono = telefono;
		        return this;
		    }

		    public UsuarioBuilder direccion(String direccion) {
		        this.direccion = direccion;
		        return this;
		    }

		    public Usuario build() {
		        return new Usuario(this);
		    }
		    
		    
			public String getEmail() {
				return email;
			}
			
			public String getNombre() {
				return nombre;
			}
			
			
			public String getTelefono() {
				return telefono;
			}
			
			public String getDireccion() {
				return direccion;
			}

			@Override
			public String toString() {
				return "UsuarioBuilder [email=" + email + ", nombre=" + nombre + ", telefono=" + telefono
						+ ", direccion=" + direccion + "]";
			}
			
			
			
		    
		    
	
		
	};



	
