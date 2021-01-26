package pojo;

public class Curandero extends Personaje {

	
	private int sabiduria;
	
	public Curandero(String nombre, Arma arma, int puntosVida, int sabiduria) {
		super(nombre, arma, puntosVida);
		this.sabiduria = sabiduria;
	}

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

	public int atacar(Personaje objetivo) {
		
		int totalDamage = arma.getDamage();
		
		if (getArma() instanceof Rezo) {
			totalDamage += sabiduria;
		} 	
					
		objetivo.setPuntosVida(objetivo.getPuntosVida()-totalDamage);
		
		return totalDamage;
		
	}
	
}
