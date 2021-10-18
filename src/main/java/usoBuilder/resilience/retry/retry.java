package usoBuilder.resilience.retry;

public class retry {
	
	private final int MAX_INTENTOS= 3;
	
	private int intentos= 0;
	private boolean conexion;
	
	
	public retry() {
		
		try {
			//Delay de 1000
			Thread.sleep(1000);
			
			
		}catch (InterruptedException e) {
			
			e.printStackTrace(System.out);
			
		}
			
		++this.intentos;
			
			while(this.intentos != this.MAX_INTENTOS) {
				
				
				//si le conexion sigue siendo erronea
				if(!this.conexion) { return;} 
				
				else {
					System.out.println("Conexion con éxito");
					
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
