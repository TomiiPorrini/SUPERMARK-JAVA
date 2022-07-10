package supermark;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

public class Tipo {
	//atributos
	private int id;
	private String descripcion;
	private Descuento Descuento;
	
	//Constructor por defecto
	public Tipo() {
		
	}

	//Constructor Normal
	public Tipo(int id, String descripcion, supermark.Descuento descuento) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		Descuento = descuento;
	}

	//Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Descuento getDescuento() {
		return Descuento;
	}

	public void setDescuento(Descuento descuento) {
		Descuento = descuento;
	}
	
	
}
