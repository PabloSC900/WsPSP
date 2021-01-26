package pojo;

public class Mago extends Personaje {

	private int inteligencia;

	public Mago(String nombre, Arma arma, int puntosVida, int inteligencia) {
		super(nombre, arma, puntosVida);
		this.inteligencia = inteligencia;	
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	
	public int atacar(Personaje objetivo) {
		
		int totalDamage = arma.getDamage();
		
		if (getArma() instanceof Hechizo) {
			totalDamage += inteligencia;
		} 	
					
		objetivo.setPuntosVida(objetivo.getPuntosVida()-totalDamage);
		
		return totalDamage;
		
	}
	
}
