package Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapMethod {

	public LinkedHashMapMethod() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Map<String,String> lhashmap=new LinkedHashMap<String,String>();
	lhashmap.put("Daughter","Sana");
	lhashmap.put("Mother", "Sujithra");
	lhashmap.put("Father", "Magesh Rajan");
	lhashmap.put("House", "Tirunelveli");
	for(Map.Entry<String,String> mentry:lhashmap.entrySet())
	{
		System.out.print(mentry.getKey()+": "+mentry.getValue());
		System.out.println();
	}
}
}
