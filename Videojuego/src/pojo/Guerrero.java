package pojo;

public class Guerrero extends Personaje {

	
	private int fuerza;	
	
	public Guerrero(String nombre, Arma arma, int puntosVida, int fuerza) {
		super(nombre, arma, puntosVida);
		this.fuerza = fuerza;
	}
	
	

	public int getFuerza() {
		return fuerza;
	}



	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}



	public int atacar(Personaje objetivo) {
		
		int totalDamage = arma.getDamage();
		
		if (getArma() instanceof Espada || getArma() instanceof Arco) {
			totalDamage += fuerza;
		} 	
					
		objetivo.setPuntosVida(objetivo.getPuntosVida()-totalDamage);
		
		return totalDamage;
		
	}
	
	
	
}
