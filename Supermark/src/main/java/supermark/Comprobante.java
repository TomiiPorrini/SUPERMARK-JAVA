package supermark;

import java.sql.Date;

public class Comprobante {
	//atributos
	private int id;
	private String tipo;
	private Date fecha;
	private Usuario Usuario;
	private TarjetaCredito TarjetaCredito;
	private Detalle detalle;

	//Constructor por defecto
	public Comprobante() {
		
	}

	//Constructor Normal
	public Comprobante(int id, String tipo, Date fecha, supermark.Usuario usuario, supermark.TarjetaCredito tarjetaCredito, Detalle detalle) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.fecha = fecha;
		this.Usuario = usuario;
		this.TarjetaCredito = tarjetaCredito;
		this.detalle = detalle;
	}

	//Getters y Setters
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

	public Detalle getDetalle() {
		return this.detalle;
	}

	public void setDetalle(Detalle detalle) {
		this.detalle = detalle;
	}
	
}
