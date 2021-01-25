package com.ejrestvj.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejrestvj.modelo.entidad.Videojuego;

@RestController
public class ServicioVJ {

	private Videojuego vj;
	
	
	@GetMapping("videojuego")
	public Videojuego obtenerVideojuego() {
		
		vj = new Videojuego();
		vj.setId(1);
		vj.setNombre("Cyberpunk 2077");
		vj.setCompania("CD Project");		
		vj.setPrecio(69.99);
		
		return vj;
	}
	
	@PutMapping("videojuego")
	public String modificarPrecio() {
		vj.setPrecio(vj.getPrecio()-10);
		
		return "OK";
	}
	
	
}
