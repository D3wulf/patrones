package usoBuilder.prototype2;

public abstract class Juguete {
	
	String nombre;
	String proveedor;
	int precio;
	
	public Juguete() {}
	
	
	public Juguete(String nombre, String proveedor, int precio) {
		this.nombre = nombre;
		this.proveedor = proveedor;
		this.precio = precio;
	}
	
	public Juguete( Juguete j) {
		
		this.nombre=j.nombre;
		this.proveedor= j.proveedor;
		this.precio=j.precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	public abstract Juguete clone();
	
	

}
