
package supermark;


import org.json.JSONObject;
import org.json.JSONException;

public class DirectlyJSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject jo = new JSONObject();
		jo.put("name", "Enzo");
		jo.put("name", "Juan");
		jo.put("name", "Jose");
		System.out.println(jo);
	}

}