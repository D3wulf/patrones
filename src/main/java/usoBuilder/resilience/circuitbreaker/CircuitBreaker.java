package usoBuilder.resilience.circuitbreaker;

public class CircuitBreaker {
	
	private int fallos;
	private final int MAX_FALLOS= 3;
	private Estado estado;
	private int numero;
	
	
	public CircuitBreaker() {
		
		//++this.numero;
		this.estado=Estado.CLOSED;
		//if ( this.estado== Estado.OPEN);
		//System.out.println("Circuito abierto");
		
	}
	
	
	public CircuitBreaker(int fallos) {
		
		
		this.fallos = fallos;
		
		if(this.fallos == this.MAX_FALLOS) {
		System.out.println("Circuito cerrado, abrimos otro");
		this.estado= Estado.OPEN;
		CircuitBreaker c2= new CircuitBreaker();
		
		}else {
			this.estado=Estado.CLOSED;
		}
		
	}
	public CircuitBreaker(Estado e) {
		
		this.estado= e;
		System.out.println("Circuito medio abierto");
	}
	

	public int getFallos() {
		
		return fallos;
	}

	public void setFallos(int fallos) {
		this.fallos = fallos;
	}

	public Estado getEstado() {
		if(this.fallos == this.MAX_FALLOS) {
			System.out.println("Circuito cerrado (OPEN)");
			this.estado= Estado.OPEN;
		}else {
			System.out.println("Circuito abierto (CLOSED)");
			this.estado= Estado.CLOSED;
		}
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	// FORCED_OPEN
	
	public void ForzarEstado(EstadoEspecial e) {
		
		if(e== EstadoEspecial.FORCED_OPEN) {
			System.out.println("Forzando estado a Open");
			this.setEstado(Estado.OPEN);
		}
	}
}