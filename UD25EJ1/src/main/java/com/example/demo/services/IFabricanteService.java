package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Fabricante;

public interface IFabricanteService {
	
	public List<Fabricante> findAll();
	
	public Fabricante findById(int id);
	
	public Fabricante update(Fabricante fabricante);
	
	public Fabricante save (Fabricante fabricante);
	
	public void delete(int id);

}
