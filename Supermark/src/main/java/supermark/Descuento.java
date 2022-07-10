package supermark;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

public class Descuento {
	//atributos
	private int id;
	private String diaSemana;
	private double porcentaje;
	
	//Constructor por defecto
	public Descuento() {
		
	}

	//Constructor Normal
	public Descuento(int id, String diaSemana, double porcentaje) {
		super();
		this.id = id;
		this.diaSemana = diaSemana;
		this.porcentaje = porcentaje;
	}

	//Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
}
