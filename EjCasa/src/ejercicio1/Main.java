package ejercicio1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Casa casa1 = new Casa(null, null, null, null, 1000);
		
		Direccion direccionCasa = new Direccion("Calle", "Falsa123", "23456", "24");
		casa1.setDireccion(direccionCasa);
		
		ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
		habitaciones.add(new Habitacion(8, TipoHabitacion.COCINA, 1));
		habitaciones.add(new Habitacion(15, TipoHabitacion.SALON, 2));
		habitaciones.add(new Habitacion(5, TipoHabitacion.BAÑO, 3));
		habitaciones.add(new Habitacion(9, TipoHabitacion.DORMITORIO, 4));
		habitaciones.add(new Habitacion(10, TipoHabitacion.DORMITORIO, 5));
		habitaciones.add(new Habitacion(8, TipoHabitacion.DORMITORIO, 6));
		casa1.setHabitaciones(habitaciones);
		
		Propietario propietario = new Propietario("Alex", "12345678A", "555666777", 
				(new Direccion("Sector", "Embarcaciones", "22349", "3")));
		casa1.setPropietario(propietario);
		
		ArrayList<Inquilino> inquilinos = new ArrayList<Inquilino>();
		inquilinos.add(new Inquilino("Jose", "12345678B", "555222444", casa1.getDireccion()));
		inquilinos.add(new Inquilino("Jimmy", "12345678C", "111333222", casa1.getDireccion()));
		inquilinos.add(new Inquilino("Maria", "12345678D", "555222999", casa1.getDireccion()));
		
				
		System.out.println(casa1);
		
	}

}