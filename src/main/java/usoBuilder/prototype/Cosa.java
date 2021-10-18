package usoBuilder.prototype;

public abstract class Cosa {
	
	
    protected String nombre;
    protected String color;
    protected String tipo;
   
    
    
	public Cosa(String nombre, String color, String tipo) {
		this.nombre = nombre;
		this.color = color;
		this.tipo = tipo;
		
	}
	
	
	//metodo abstracto
	public abstract Cosa clone();



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Cosa [nombre=" + nombre + ", color=" + color + ", tipo=" + tipo + "]";
	}
	
	
	
	/*
	 * Circuit breaker: After a number of failed attempts, we can consider that the service is unavailable/overloaded and eagerly reject all subsequent requests to it
Rate Limiter:  this functionality allows limiting access to some service
BulkHead: to limit the number of concurrent calls to a particular service.
Retry: We can automatically retry a failed call
TimeLimiter: t's possible to limit the amount of time spent calling a remote service
	 */
    
    
    
    

}
