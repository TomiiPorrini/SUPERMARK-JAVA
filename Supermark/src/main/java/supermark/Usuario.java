import java.util.Scanner;

public class Usuario {
	// atributos
	private int id_usuario;
	private String dni;
	private Domicilio domicilio;
	private String nombre;
	private String apellido;
	private String email;
	private boolean isAdmin;
	private String contraseña;

	// contructor por defecto
	public Usuario() {

	}

	// constructor normal
	public Usuario(int id_usuario, String nombre, String apellido, String email, String contraseña, String dni, boolean isAdmin, Domicilio domicilio) {
		this.id_usuario = id_usuario;
		this.dni = dni;
		this.domicilio = domicilio;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.contraseña = contraseña;
		this.isAdmin = isAdmin;
	}
	//metodo toString
	public String toString() {
		return "Usuario id_usuario:" + id_usuario + ", dni:" + dni + ", domicilio:" + domicilio + ", nombre:" + nombre
				+ ", apellido:" + apellido + ", email:" + email + ", contraseña:" + contraseña + "";
	}

	// getters y setters
	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	
	
	// metodos de registro
	public void registrar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su Nombre:");
		this.setNombre(sc.nextLine());
		System.out.println("Ingrese su Apellido:");
		this.setApellido(sc.nextLine());
		System.out.println("Ingrese su DNI:");
		this.setDni(sc.nextLine());
		System.out.println("Ingrese su Email:");
		this.setEmail(sc.nextLine());

		contra();
		sc.close();
	}
	//metodo de ingreso de contraseña
	public void contra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su Contraseña:");
		String password = sc.nextLine();
		System.out.println("Confirme su contraseña");
		String confi = sc.nextLine();

		if (vali(password, confi)) {
			this.setContraseña(password);
		} else if (!password.contentEquals(confi)) {
			System.out.println("confirmacion invalida");
			contra();
		} else if (password.length() < 8) {
			System.out.println("Muy corto: necesita un minimo de 8 digitos");
			contra();
		}

	}
	// validacion de contraseña
	public boolean vali(String password, String confi) {
		boolean valido = false;
		if (password.length() >= 8 && password.contentEquals(confi)) {
			valido = true;
		}

		return valido;
	}


	

}