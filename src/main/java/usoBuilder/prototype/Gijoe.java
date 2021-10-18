package usoBuilder.prototype;

public class Gijoe extends Cosa {
	
	
	public Gijoe(String nombre, String color, String tipo, String seccion) {
		
		super(nombre, color, tipo, seccion);
		seccion= "Bazar";
		
		
		
	}
	public Gijoe clone() {
		
		return new Gijoe(super.nombre, super.color,super.tipo, super.seccion);
		
		
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
		return super.seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
}
