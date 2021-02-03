package ejercicio1;

public class Propietario {

	private String nombre;
	private String dni;
	private String telefono;
	private Direccion direccion;
	
	public Propietario(String nombre, String dni, String telefono, Direccion direccion) {
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + ", direccion=" + direccion
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
}