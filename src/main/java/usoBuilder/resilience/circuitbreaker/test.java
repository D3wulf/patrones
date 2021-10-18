package usoBuilder.resilience.circuitbreaker;

public class test {

	public static void main(String[] args) {
		
		CircuitBreaker c1 = new CircuitBreaker();
		CircuitBreaker c2 = new CircuitBreaker();
		CircuitBreaker c3 = new CircuitBreaker();
		
		c1.getEstado();
		c1.setFallos(3);
		c1.getEstado();
		c1.setFallos(2);
		
		
		
		/*
		if(c1.getEstado()== Estado.OPEN) {
			
			c2.setEstado(Estado.CLOSED);
			c3.setEstado(Estado.HALF_OPEN);
			
		}
		
		c2.getEstado();
		c2.setFallos(3);
		
		if (c1.getEstado()== Estado.OPEN && c2.getEstado()==Estado.OPEN) {
			
			c3.setEstado(Estado.CLOSED);
			
		}
		
		c1.getEstado();
		c2.getEstado();
		c3.getEstado();
		*/
		
		
		
		
		

	}

}
