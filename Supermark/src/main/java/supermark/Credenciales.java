package supermark;

import java.sql.*;

public class Credenciales {
	
	//Atributos
	 public String JDBC_DRIVER; 
	 public String DB_URL;
	// Credenciales de la BDD
	 public String USER;
	 public String PASS;
	 public String path;
	
	 public Credenciales(){
		 this.JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		 this.DB_URL = "jdbc:mysql://localhost:3306/supermark";
		 this.USER = "root";
		 this.PASS = "tupassword";
		 this.path = "C:/Users/Matias/Desktop/Lenguajes/Java 1000 programadores salte�os/proyecto clonado";
	 }
	 
}