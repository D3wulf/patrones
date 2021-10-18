package usoBuilder.prototype;

public abstract class Cosa {
	
	
    protected String nombre;
    protected String color;
    protected String tipo;
    protected String seccion;
    
    
	public Cosa(String nombre, String color, String tipo, String seccion) {
		this.nombre = nombre;
		this.color = color;
		this.tipo = tipo;
		this.seccion = seccion;
	}
	
	
	
	public abstract Cosa clone();
	
	
    
    
    
    

}
