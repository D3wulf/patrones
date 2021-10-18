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
	
	
	
	public abstract Cosa clone();
	
	/*
	 * Circuit breaker: After a number of failed attempts, we can consider that the service is unavailable/overloaded and eagerly reject all subsequent requests to it
Rate Limiter:  this functionality allows limiting access to some service
BulkHead: to limit the number of concurrent calls to a particular service.
Retry: We can automatically retry a failed call
TimeLimiter: t's possible to limit the amount of time spent calling a remote service
	 */
    
    
    
    

}
