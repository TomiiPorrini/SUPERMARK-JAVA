package supermark;

import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

public class TarjetaCredito {
	//atributos
	private int numero;
	private String banco;
	private String titular;
	private Date fecha_caducidad;
	private Usuario Usuario;
	
	//Constructor por defecto
	public TarjetaCredito() {
		
	}

	//Constructor Normal
	public TarjetaCredito(int numero, String banco, String titular, Date fecha_caducidad, supermark.Usuario usuario) {
		super();
		this.numero = numero;
		this.banco = banco;
		this.titular = titular;
		this.fecha_caducidad = fecha_caducidad;
		Usuario = usuario;
	}

	//Getters y Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Date getFecha_caducidad() {
		return fecha_caducidad;
	}

	public void setFecha_caducidad(Date fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}

	public Usuario getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuario usuario) {
		Usuario = usuario;
	}
}
