package Manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser; 

public class JsonParser1
{
	public JsonParser1() {}


	public List<StopEta> parseString(String str)
	{

		/*
		 this will be the result List of ataStop
		 */
		List<StopEta> result = new ArrayList<StopEta>();
		JSONParser parser = new JSONParser();
		try 
		{


			/*
			 *taking the str got from server and parse it 
			 */
			Object  obj = parser.parse(str);
			JSONObject jo = (JSONObject)obj;

			JSONArray jsonArray = (JSONArray) jo.get("arrivals");

			Iterator<String> iterator = jsonArray.iterator();

			Iterator itr2 = jsonArray.iterator(); 

			while (itr2.hasNext())  
			{ 
				Iterator  itr1 = ((Map) itr2.next()).entrySet().iterator(); 
				while (itr1.hasNext()) { 
					Map.Entry pair = (Entry) itr1.next();
					int x =(int) pair.getKey();
					Date y = new Date((int)pair.getValue()*1000);

					StopEta m = new StopEta(x,y);
					result.add(m);
				} 

			}
			return result;
		}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		
			return result;
		}
	}


