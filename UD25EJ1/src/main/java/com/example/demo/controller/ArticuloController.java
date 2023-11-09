package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Articulo;
import com.example.demo.services.ArticuloServiceImpl;

@RequestMapping("/articulo")
@RestController
public class ArticuloController {
	
	@Autowired
	ArticuloServiceImpl articuloService;
	
	@GetMapping("/all")
	public List<Articulo> getAll() {
		return articuloService.findAll();
	}
	
	@GetMapping("/{id}")
	public Articulo getById(@PathVariable(name="id") Integer id) {
		return articuloService.findById(id);
	}
	
	
	@PostMapping("")
	public Articulo createArticulo(@RequestBody Articulo articulo) {
		return articuloService.save(articulo);
	}
	
	@PutMapping("/{id}")
	public Articulo updateArticulo(@PathVariable(name="id")Integer id,@RequestBody Articulo empleado) {
		
		Articulo articuloSeleccionado= new Articulo();
		
		articuloSeleccionado= articuloService.findById(id);
		
		articuloSeleccionado.setNombre(empleado.getNombre());
		articuloSeleccionado.setPrecio(empleado.getPrecio());
		articuloSeleccionado.setFabricante(empleado.getFabricante());
		
		
		articuloSeleccionado = articuloService.update(articuloSeleccionado);
		
		return articuloSeleccionado;
	}
	
	@DeleteMapping("/{id}")
	public void deleteArticulo(@PathVariable(name="id") Integer id) {
		articuloService.delete(id);
	}
	

}
