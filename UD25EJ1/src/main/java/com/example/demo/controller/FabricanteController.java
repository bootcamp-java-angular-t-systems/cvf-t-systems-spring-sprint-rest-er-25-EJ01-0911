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


import com.example.demo.dto.Fabricante;
import com.example.demo.services.FabricanteServiceImpl;

@RestController
@RequestMapping("/fabricante")
public class FabricanteController {
	
	@Autowired
	FabricanteServiceImpl fabricanteService;
	
	@GetMapping("/all")
	public List<Fabricante> getAll() {
		return fabricanteService.findAll();
	}
	
	
	@GetMapping("/{id}")
	public Fabricante getById(@PathVariable(name = "id") Integer id) {
		return fabricanteService.findById(id);
	}
	
	@PostMapping("")
	public Fabricante create(@RequestBody Fabricante fabricante) {
		return fabricanteService.save(fabricante);
	}
	
	@PutMapping("/{id}")
	public Fabricante updateFabricante(@PathVariable(name = "id") Integer id, @RequestBody Fabricante fabricante) {
		Fabricante fabricanteSeleccionado = new Fabricante();
		Fabricante fabricanteUpdated = new Fabricante();
		
		fabricanteSeleccionado = fabricanteService.findById(id);
		
		fabricanteSeleccionado.setNombre(fabricante.getNombre());
		
		fabricanteUpdated = fabricanteService.update(fabricanteSeleccionado);
		
		return fabricanteUpdated;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable (name="id") Integer id) {
		fabricanteService.delete(id);
	}

}
