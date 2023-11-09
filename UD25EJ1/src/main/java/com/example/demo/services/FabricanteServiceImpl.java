package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFabricanteDAO;
import com.example.demo.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService {
	
	@Autowired
	IFabricanteDAO fabricanteDAO;
	
	public List<Fabricante> findAll() {
		return fabricanteDAO.findAll();
	}
	
	public Fabricante findById(int id) {
		return fabricanteDAO.findById(id).get();
	}
	
	public Fabricante update(Fabricante fabricante) {
		return fabricanteDAO.save(fabricante);
	}
	
	public Fabricante save(Fabricante fabricante) {
		return fabricanteDAO.save(fabricante);
	}
	
	public void delete(int id) {
		fabricanteDAO.deleteById(id);
	}


}
