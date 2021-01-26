package ejercicio1;

import java.util.ArrayList;

public class Casa {

	private Direccion direccion;
	private ArrayList<Habitacion> habitaciones;
	private Propietario propietario;
	private ArrayList<Inquilino> inquilinos;
	private double precioAlquiler;
	
	public Casa(Direccion direccion, ArrayList<Habitacion> habitaciones, Propietario propietario, ArrayList<Inquilino> inquilinos,
			double precioAlquiler) {
		this.direccion = direccion;
		this.habitaciones = habitaciones;
		this.propietario = propietario;
		this.inquilinos = inquilinos;
		this.precioAlquiler = precioAlquiler;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public ArrayList<Inquilino> getInquilinos() {
		return inquilinos;
	}

	public void setInquilinos(ArrayList<Inquilino> inquilinos) {
		this.inquilinos = inquilinos;
	}

	public double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}
	
	public double calcularM2Casa() {
		
		double totalM2 = 0;
		
		for (Habitacion h : habitaciones) {
			totalM2 += h.getMetros2();
		}
		return totalM2;
		
	}

	@Override
	public String toString() {
		return "Direccion: " + direccion + "\nHabitaciones: " + habitaciones + "\nPropietario:" + propietario
				+ "\nInquilinos: " + inquilinos + "\nPrecio de alquiler: " + precioAlquiler + "\nMetros cuadrados totales: "
				+ calcularM2Casa();
	}
	
	
	
	
}
