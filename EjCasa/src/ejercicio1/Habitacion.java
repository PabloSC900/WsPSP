package ejercicio1;

public class Habitacion {

	private int metros2;
	private  TipoHabitacion tipoHab;
	private int numHab;
	
	public Habitacion(int metros2, TipoHabitacion tipoHab, int numHab) {		
		this.metros2 = metros2;
		this.tipoHab = tipoHab;
		this.numHab = numHab;
	}
	public int getMetros2() {
		return metros2;
	}
	public void setMetros2(int metros2) {
		this.metros2 = metros2;
	}
	public TipoHabitacion getTipoHab() {
		return tipoHab;
	}
	public void setTipoHab(TipoHabitacion tipoHab) {
		this.tipoHab = tipoHab;
	}
	public int getNumHab() {
		return numHab;
	}
	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}
	@Override
	public String toString() {
		return "Habitacion [metros2=" + metros2 + ", tipoHab=" + tipoHab + ", numHab=" + numHab + "]";
	}
	
	
	
	
	
	
}
