package usoBuilder.prototype2;

public class Boardgame extends Juguete {
	
	public String tipo;
	
	
	
	

	//constructor normal
	public Boardgame(String nombre, int precio, String tipo) {
		
		super.nombre=nombre;
		super.proveedor="Hasbro";
		super.precio=precio;
		this.tipo = tipo;
	}
	
	//constructor con parametro, otro mismo Boardgame
	public Boardgame(Boardgame boardgame) {
		
		super(boardgame);
		
		
	}

	public Boardgame(Juguete j) {
		super(j);
		
	}

	@Override
	public Juguete clone() {
		
		
		return new Boardgame(super.nombre,super.precio,this.tipo);
		
		
	}

	@Override
	public String toString() {
		return "Boardgame [tipo=" + tipo + ", nombre=" + nombre + ", proveedor=" + proveedor + ", precio=" + precio
				+ ", getNombre()=" + getNombre() + ", getProveedor()=" + getProveedor() + ", getPrecio()=" + getPrecio()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	

}
