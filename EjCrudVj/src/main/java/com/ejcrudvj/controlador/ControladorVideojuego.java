package com.ejcrudvj.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejcrudvj.modelo.entidad.Videojuego;
import com.ejcrudvj.modelo.persistencia.DaoVideojuego;

@RestController
public class ControladorVideojuego {
	
	@Autowired
	private DaoVideojuego daoVideojuego;
	
	@GetMapping("videojuegos")
	public ResponseEntity<List<Videojuego>> listar() {
		
		List<Videojuego> listaVj = daoVideojuego.getListaVj();
		
		ResponseEntity<List<Videojuego>> re = new ResponseEntity<List<Videojuego>>(listaVj, HttpStatus.OK);
		
		return re;
	}
	
	
	@GetMapping("videojuegos/{id}")
	public ResponseEntity<Videojuego> read(@PathVariable("id") int idVideojuego) {
		
		Videojuego vj1 = daoVideojuego.buscar(idVideojuego);
		
		HttpStatus hs = null;
		if(vj1 != null) {
			hs = HttpStatus.OK;
		}else {
			hs = HttpStatus.NOT_FOUND;
		}
		
		ResponseEntity<Videojuego> re = new ResponseEntity<Videojuego>(vj1,hs);
		
		return re;
	}
	
	@PostMapping("videojuegos")
	public ResponseEntity<Videojuego> create(@RequestBody Videojuego vj) {
		Videojuego vjAlta = daoVideojuego.alta(vj);
		
		ResponseEntity<Videojuego> re = new ResponseEntity<Videojuego>(vjAlta,HttpStatus.CREATED);
		return re;
	}
	
	@PutMapping("videojuegos/{id}")
	public ResponseEntity<Videojuego> update(@RequestBody Videojuego vj,	@PathVariable("id") int idVideojuego){
		
		vj.setId(idVideojuego);
		
		Videojuego pModificada = daoVideojuego.modificar(vj);
		
		HttpStatus hs = null;
		if(pModificada != null) {
			hs = HttpStatus.OK;
		}else {
			hs = HttpStatus.NOT_FOUND;
		}
		
		ResponseEntity<Videojuego> re = new ResponseEntity<Videojuego>(pModificada,hs);
		
		return re;
	}
	
	@DeleteMapping("videojuegos/{id}")
	public ResponseEntity<Videojuego> delete(@PathVariable("id") int idVideojuego){
		Videojuego vj = daoVideojuego.borrar(idVideojuego);
		HttpStatus hs = null;
		if(vj != null) {
			hs = HttpStatus.OK;
		}else {
			hs = HttpStatus.NOT_FOUND;
		}
		
		ResponseEntity<Videojuego> re = 
				new ResponseEntity<Videojuego>(vj,hs);
		
		return re;
	}
	
	
	
	
}
