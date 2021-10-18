package usoBuilder.resilience.retry;

public class retry {
	
	private final int MAX_INTENTOS= 3;
	
	private int intentos= 0;
	private boolean conexion;
	
	
	
	
	public retry() {
		
		++this.intentos;
		
		while(this.intentos != this.MAX_INTENTOS) {
	
			if(!this.conexion) { return;}
			
			else if (this.conexion) {
				
				System.out.println("Conectado con éxito");
			}
			
			
		}
			
	}
	
	
	
	public int getIntentos() {
		return intentos;
	}
	
	
	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}
	
	
	
	
	
	
	
	
	

}
