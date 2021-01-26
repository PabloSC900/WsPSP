package pojo;

public abstract class Personaje {

	protected String nombre;
	protected Arma arma;
	protected int puntosVida;
	
	public Personaje(String nombre, Arma arma, int puntosVida) {		
		this.nombre = nombre;
		this.arma = arma;
		this.puntosVida = puntosVida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	
	
	
}
