package supermark;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

public class Producto {
	//atributos
	private int id;
	private String nombre;
	private String marca;
	private Date fecha_venc;
	private Double precio;
	private int stock;
	private Tipo Tipo;
	
	//Constructor por defecto
	public Producto() {
		
	}
	
	//Constructor Normal
	public Producto(int id, String nombre, String marca, Date fecha_venc, Double precio, int stock,
			supermark.Tipo tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.fecha_venc = fecha_venc;
		this.precio = precio;
		this.stock = stock;
		Tipo = tipo;
	}
	
	//Getters y Setters
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Date getFecha_venc() {
		return fecha_venc;
	}

	public void setFecha_venc(Date fecha_venc) {
		this.fecha_venc = fecha_venc;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Tipo getTipo() {
		return Tipo;
	}

	public void setTipo(Tipo tipo) {
		Tipo = tipo;
	}
	
	
}
