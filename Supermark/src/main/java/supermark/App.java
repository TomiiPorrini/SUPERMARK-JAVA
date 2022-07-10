package supermark;

//para que funcione el spark y el property
import com.google.gson.Gson;
import static spark.Spark.*;
import org.apache.log4j.PropertyConfigurator;

//para correr la hora local
import java.time.LocalDateTime;

import java.util.Date;
import org.json.JSONObject;
import org.json.JSONException;

public class App {
	public static void main(String[]args){
		   //Path donde se encuentra el archivo log4j.properties
		   String log4jConfPath = "C:/Users/Matias/Desktop/Lenguajes/Java 1000 programadores salteños/PROYECTO FINAL/Supermark/to/log4j.properties";
		   PropertyConfigurator.configure(log4jConfPath);
		   //trae el objeto mapper para mapear las clases
	       Gson mapper= new Gson();
	       //abre el puerto 8080
	       port(8080);
	       
	       String str = "{\"name\":\"John\",\"age\":\"30\"}";
           JSONObject jsonObject = new JSONObject(str);
           System.out.println("OBJECT : "+ jsonObject.toString());
	       get("/consulta", (req,res) -> jsonObject);
	   }
}