package usoBuilder.resilience.retry;

public class CocheBuilder {
	
	protected String nombre;
	protected String modelo;
	protected int ruedas;
	
	public CocheBuilder() {}
	
	//Métodos de construccion
	
	public CocheBuilder nombre(String nombre) {
		
		this.nombre= nombre;
		return this;
	}
	public CocheBuilder modelo(String modelo) {
		
		this.modelo= modelo;
		return this;
	}
	public CocheBuilder ruedas(int ruedas) {
	
	this.ruedas= ruedas;
	return this;
	}
	
	// Método que va a construirlo y crear la instancia coche
	
	public Coche build() {
		
		return new Coche(this);
		
	}
	
	//Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getRuedas() {
		return ruedas;
	}



	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}



	

}
