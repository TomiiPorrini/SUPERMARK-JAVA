package supermark;

import java.sql.Date;

public class Comprobante {
	//atributos
	private int id;
	private String tipo;
	private Date fecha;
	private Usuario Usuario;
	private TarjetaCredito TarjetaCredito;
	private Credenciales Credenciales;
	//Constructor por defecto
	public Comprobante() {
		
	}

	//Constructor Normal
	public Comprobante(int id, String tipo, Date fecha, supermark.Usuario usuario,
			supermark.TarjetaCredito tarjetaCredito, supermark.Credenciales credenciales) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.fecha = fecha;
		Usuario = usuario;
		TarjetaCredito = tarjetaCredito;
		Credenciales = credenciales;
	}
	
	//getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Usuario getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuario usuario) {
		Usuario = usuario;
	}

	public TarjetaCredito getTarjetaCredito() {
		return TarjetaCredito;
	}

	public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
		TarjetaCredito = tarjetaCredito;
	}

	public Credenciales getCredenciales() {
		return Credenciales;
	}

	public void setCredenciales(Credenciales credenciales) {
		Credenciales = credenciales;
	}
	
}
