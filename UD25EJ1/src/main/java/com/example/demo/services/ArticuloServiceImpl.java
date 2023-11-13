package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IArticuloDAO;
import com.example.demo.dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService {

	@Autowired
	IArticuloDAO articuloDAO;
	
	public List<Articulo> findAll() {
		return articuloDAO.findAll();
	}
	
	public Articulo findById(int id) {
		return articuloDAO.findById(id).get();
	}
	
	public Articulo save(Articulo articulo) {
		return articuloDAO.save(articulo);
	}
	
	public Articulo update(Articulo articulo) {
		return articuloDAO.save(articulo);
	}
	
	public void delete(int id) {
		articuloDAO.deleteById(id);
	}
}
