package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity 	
@Table(name="fabricantes")
public class Fabricante {
	
	@Id
	@Column(name = "codigo")
	private int id;
	private String nombre;
	
	@OneToMany
	@JoinColumn(name="fabricante_id")
	private List<Articulo> articulo;
		
	
	public Fabricante(int id, String nombre) {
		//super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public Fabricante() {
		//super();
	}

	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy ="Articulo")
	public List<Articulo> getArticulo() {
		return articulo;
	}


	public void setArticulo(List<Articulo> articulo) {
		this.articulo = articulo;
	}


	@Override
	public String toString() {
		return "Fabricante [id=" + id + ", nombre=" + nombre + "]";
	}

}