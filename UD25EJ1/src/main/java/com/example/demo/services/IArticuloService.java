package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Articulo;

public interface IArticuloService {
	
	public List<Articulo> findAll();
	
	public Articulo findById(int id);
	
	public Articulo update(Articulo articulo);
	
	public Articulo save(Articulo articulo);
	
	public void delete(int id);	

}
