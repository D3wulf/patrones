package usoBuilder.prototype;

public class Gijoe extends Cosa {
	
	String seccion;
	
	
	public Gijoe(String nombre, String color, String tipo) {
		
		super(nombre, color, tipo);
		this.seccion= "Jugueteria";
		
		
		
	}
	public Cosa clone() {
		
		return new Gijoe(super.nombre, super.color,super.tipo);
		
		
	}
	/*
	public String getNombre() {
		return super.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return super.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTipo() {
		return super.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
*/
	public String getSeccion() {
		return this.seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	@Override
	public String toString() {
		return "Gijoe [seccion=" + seccion + ", nombre=" + nombre + ", color=" + color + ", tipo=" + tipo + "]";
	}
	
	
	
}
