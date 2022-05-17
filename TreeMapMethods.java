package Programs;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapMethods {

	public TreeMapMethods() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Map<String,String> treeMap=new TreeMap<String, String>(Collections.reverseOrder());
	treeMap.put("Daughter","Sana");
	treeMap.put("Mother", "Sujithra");
	treeMap.put("Father", "Magesh Rajan");
	treeMap.put("House", "Tirunelveli");
	for(Map.Entry<String, String> mentry:treeMap.entrySet()) {
		System.out.print(mentry.getKey()+": "+mentry.getValue());
		System.out.println();
	
	}
}
}
