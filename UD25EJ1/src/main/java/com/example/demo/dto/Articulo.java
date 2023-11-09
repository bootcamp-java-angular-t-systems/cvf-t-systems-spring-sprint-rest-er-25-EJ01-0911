package com.example.demo.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="articulos")
public class Articulo {

	@Id
	@Column(name = "codigo")
	private int id;
	private String nombre;
	private double precio;
	
	@ManyToOne
	private Fabricante fabricante;
	
	public Articulo () {}

	public Articulo(int id, String nombre, double precio, Fabricante fabricante) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante; 
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Articulo [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante + "]";
	}
	
}
