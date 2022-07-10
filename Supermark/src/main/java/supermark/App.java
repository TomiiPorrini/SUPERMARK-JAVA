package supermark;

import static spark.Spark.*;
import java.util.Date;
import org.apache.log4j.PropertyConfigurator;
import com.google.gson.Gson;
import org.json.JSONObject;
import org.json.JSONException;

public class App {
	public static void main(String[]args){
		String log4jConfPath = "C:/Users/Matias/Desktop/Lenguajes/Java 1000 programadores salte�os/PROYECTO FINAL/Supermark/to/log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		Gson mapper= new Gson();
		port(8080);
		String str = "{\"name\":\"John\",\"age\":\"30\"}";
        JSONObject jsonObject = new JSONObject(str);
        System.out.println("OBJECT : "+ jsonObject.toString());
		get("/consulta", (req,res) -> jsonObject);
	}
}