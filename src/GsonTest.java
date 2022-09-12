import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;


public class GsonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("1111", "22222");
		jsonObject.put("8888", "33333");
		jsonObject.put("4444", "55555");
		jsonObject.put("5555", "55555");
		jsonObject.put("7777", "55555");
		
		Iterator<String> iter = jsonObject.keySet().iterator();
		
		while( iter.hasNext() ) {
			System.out.println(iter.next());
		}
		
		// Reader reader = new FileReader("D:/SOURCE/work_sample/TestFunction/src/menu.json");
		
		String menu = "D:/SOURCE/work_sample/TestFunction/src/menu.json";
		
		try {
			File file = new File(menu);
			
			
			
			
			
			/*
			 *    File file    =  new File("/home/smilem/SM-201104021025.txt");    
			 *    BufferedReader br  =  new BufferedReader(new InputStreamReader(new
			 * FileInputStream(file),"euc-kr"));
			 * 
			 */			
			
			
			
		 JsonReader rd = new JsonReader(new FileReader(menu));
		 
		 
		 
		 
		 
		
		Gson gson = new Gson();
		JsonObject obj = gson.fromJson(rd, JsonObject.class);
		
		Iterator<String> iter1 = obj.keySet().iterator();
		
		while( iter1.hasNext() ) {
			String key = iter1.next();
			JsonObject jo = (JsonObject)obj.get(key);
			String name = jo.get("name").getAsString();
			
			System.out.println(key+"|"+name);
		}		
		
		
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		   

	}

}
