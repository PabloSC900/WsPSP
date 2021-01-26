package pojo;

public abstract class Arma {

	protected int damage;
	protected int tipo;

	public static final int COD_TIPO_GUERRERO = 1;
	public static final int COD_TIPO_MAGO = 2;
	public static final int COD_TIPO_CURANDERO = 3;
	
	public Arma(int damage) {		
		this.damage = damage;		
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
}
