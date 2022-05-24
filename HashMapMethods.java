package Programs;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {

	public HashMapMethods() {
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		HashMap<String,String> map= new HashMap();
		map.put("Daughter",null);
		map.put("Mother", null);
		map.put("gfhfghgf", "gregdf");
		map.put("kiuygg", "gregdf");
		map.put("", "gregdf");
		map.put("Suji", "nhyttf");
		map.put(null, "Tirunelveli");
		map.put(null, "Madurai");
		
		for(Map.Entry<String,String> mentry:map.entrySet())
		{
			System.out.print(mentry.getKey()+": "+mentry.getValue());
			System.out.println();
		}
		
		
	}
}
