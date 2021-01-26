package ejercicio1;

public class Direccion {

	private String tipoVia;
	private String nombreVia;
	private String codigoPostal;
	private String numero;
	
	public Direccion(String tipoVia, String nombreVia, String codigoPostal, String numero) {		
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.codigoPostal = codigoPostal;
		this.numero = numero;
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombreVia() {
		return nombreVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", codigoPostal=" + codigoPostal
				+ ", numero=" + numero + "]";
	}
	
	
	
	
	
	
}
