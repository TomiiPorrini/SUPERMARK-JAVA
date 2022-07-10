package supermark;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

public class Localidad {
	//atributos
	private String provincia;
	private String departamento;
	private String ciudad;
	
	//Constructor por defecto
	public Localidad() {
		
	}
	
	//Constructor Normal
	public Localidad(String provincia, String departamento, String ciudad) {
		super();
		this.provincia = provincia;
		this.departamento = departamento;
		this.ciudad = ciudad;
	}

	//Getters y Setters
	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	//METODOS
	//este metodo es gral. Recibe una localidad y a partir de eso de la printea.
	public void getLocalizacion(Localidad x){
		System.out.println(x.ciudad+", "+x.departamento+", "+x.provincia+".");
	}
}
