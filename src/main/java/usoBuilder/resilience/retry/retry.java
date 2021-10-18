package usoBuilder.resilience.retry;

public class Retry {
	
	private final int MAX_INTENTOS= 3;
	
	private int intentos= 0;
	private boolean conexion;
	private final String USUARIO="pepe";
	private final String PASS="1111";
	private String nombre;
	private String pass;
	
	public Retry(String nombre, String pass) {
		
		this.nombre=nombre;
		this.pass= pass;
	}
	
	public void getConnection() {
		
		++this.intentos;
		if(this.USUARIO == this.nombre && this.PASS == this.pass) {
			
			System.out.println("Conexion correcta");
		}else {
			System.out.println("Conexion incorrecta, intentos: " + this.intentos );
			this.retry();
		}
		
	}
	
	
	private void retry() {
		
		
		
		try {
			//Delay de 1000
			Thread.sleep(3000);
			
			
		}catch (InterruptedException e) {
			
			e.printStackTrace(System.out);
			
		}
		
		while(this.intentos != this.MAX_INTENTOS) {
			
			System.out.println("Entrando en while");
			
			
			this.getConnection();
			
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
