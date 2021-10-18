package usoBuilder.resilience.circuitbreaker;

public class CircuitBreaker {
	
	private int fallos;
	private final int MAX_FALLOS= 3;
	private Estado estado;
	
	
	public CircuitBreaker() {
		
		
		this.estado=Estado.OPEN;
		if ( this.estado== Estado.OPEN)
		System.out.println("circuito abierto");
		
		
	}
	
	public CircuitBreaker(int fallos) {
		
		
		this.fallos = fallos;
		
		if(this.fallos == this.MAX_FALLOS) {
		System.out.println("Circuito cerrado");
		this.estado= Estado.CLOSED;
		
		}
		
	}
	
	public void test1() {
		
	
	
	
	

}

	public int getFallos() {
		return fallos;
	}

	public void setFallos(int fallos) {
		this.fallos = fallos;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}