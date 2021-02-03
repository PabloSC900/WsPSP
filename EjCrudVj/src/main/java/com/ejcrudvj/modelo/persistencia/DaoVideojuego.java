package com.ejcrudvj.modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ejcrudvj.modelo.entidad.Videojuego;

@Component
public class DaoVideojuego {
	
	private List<Videojuego> listaVj;
	private int contId;
	
	public DaoVideojuego() {
		
		contId = 0;
		
		Videojuego vj1 = new Videojuego();
		vj1.setId(contId+=1);
		vj1.setNombre("God of War");
		vj1.setCompania("Ubisoft");
		vj1.setPrecio(69.99);
		vj1.setPuntuacion(9.8);
		
		Videojuego vj2 = new Videojuego();
		vj2.setId(contId+=1);
		vj2.setNombre("FIFA 21");
		vj2.setCompania("EA Sports");
		vj2.setPrecio(54.0);
		vj2.setPuntuacion(7.2);
		
		listaVj = new ArrayList<Videojuego>();
		listaVj.add(vj1);
		listaVj.add(vj2);
		
			
	}

	public List<Videojuego> getListaVj() {
		return listaVj;
	}

	public Videojuego buscar(int idVideojuego) {
		Videojuego vj1 = null;
		for(Videojuego vj : listaVj) {
			if(vj.getId() == idVideojuego) {
				vj1 = vj;				
			}
		}
		
		return vj1;
	}

	public Videojuego alta(Videojuego vj) {
		vj.setId(contId++);
		listaVj.add(vj);
		return vj;
	}

	public Videojuego modificar(Videojuego vjModif) {
		Videojuego vj1 = buscar(vjModif.getId());
		if(vj1 != null) {			
			vj1.setNombre(vjModif.getNombre());
			vj1.setCompania(vjModif.getCompania());
			vj1.setPrecio(vjModif.getPrecio());
			vj1.setPuntuacion(vjModif.getPuntuacion());
		}		
		return vj1;
	}

	public Videojuego borrar(int idVideojuego) {
		Videojuego vj = buscar(idVideojuego);
		if(vj != null) {
			listaVj.remove(idVideojuego);
		}
		return vj;
	}
	
	
	
	
}
