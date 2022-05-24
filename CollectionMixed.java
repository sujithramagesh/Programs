package Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionMixed {

	public CollectionMixed() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ArrayList<String> arrayList=new ArrayList<String>();
		//ArrayList<LinkedList<String>> arrList1=new ArrayList<LinkedList<String>>();
		
		@SuppressWarnings("unused")
		List<String> linkList=new LinkedList<String>();
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		TreeSet<String> treeSet=new TreeSet<String>();
		LinkedHashSet<String> linkHashSet=new LinkedHashSet<String>();
		HashSet<String> hashSet=new HashSet<String>();
		Hashtable<String, Integer> hashTable=new Hashtable<String, Integer>();
		TreeMap<String, Integer> treeMap=new TreeMap<String, Integer>();
		LinkedHashMap<String, Integer> linkHashMap=new LinkedHashMap<String, Integer>();
		//linkListintoArrayList(arrayList, linkList);
		//linkListIntoLinkedHashMap(linkList,linkHashMap);
		//arrayListIntoHashMap(arrayList,hm);
		
		
	}
	public static void addArrayListIntoHashMap(ArrayList<String> arrayList)
	{
		
	}
	public static void addHashMapintoArrayList(ArrayList<String> arrList,HashMap<String, Integer> hm)
	{
		
	}
	public static void arrayListIntoHashMap(ArrayList<String> arrList,HashMap<String, Integer> hm)
	{
		addArrayList(arrList);
		addHashMap(hm);
		//hm.putAll("HM1",arrList);
	}
	public static void linkListIntoHashTable(LinkedList<String> ll,Hashtable<String, Integer> ht)
	{
		addLinkList(ll);
		addHashTable(ht);
	}
	public static void linkListIntoLinkedHashMap(LinkedList<String> ll,LinkedHashMap<String, Integer> hm)
	{
		addLinkList(ll);
		addLinkedHashMap(hm);
		//hm.putAll(0,ll);
	}
	
	public static void addHashTable(Hashtable<String, Integer> hashTable)
	{
		hashTable.put("HT1", 1);
		hashTable.put("HT2", 2);
		hashTable.put("HT3", 3);
		hashTable.put("HT4", 4);
		hashTable.put("HT5", 5);
		hashTable.put("HT6", 6);
		hashTable.put("HT7", 7);
		hashTable.put("HT8", 8);
		hashTable.put("HT9", 9);
	}
	public static void addlinkedHashSet(LinkedHashSet<String> linkHashSet)
	{
		linkHashSet.add("TS1");
		linkHashSet.add("TS2");
		linkHashSet.add("TS3");
		linkHashSet.add("TS4");
		linkHashSet.add("TS5");
		linkHashSet.add("TS6");
		linkHashSet.add("TS7");
		linkHashSet.add("TS8");
		linkHashSet.add("TS9");
		linkHashSet.add("TS10");
	}
	public static void addTreeMap(TreeMap<String, Integer> tm)
	{
		tm.put("TM1", 1);
		tm.put("TM2", 2);
		tm.put("TM3", 3);
		tm.put("TM4", 4);
		tm.put("TM5", 5);
		tm.put("TM6", 6);
		tm.put("TM7", 7);
		tm.put("TM8", 8);
		tm.put("TM9", 9);
	}
	public static void addHashSet(HashSet<String> hs)
	{
		hs.add("HS1");
		hs.add("HS2");
		hs.add("HS3");
		hs.add("HS4");
		hs.add("HS5");
		hs.add("HS6");
		hs.add("HS7");
		hs.add("HS8");
		hs.add("HS9");
		hs.add("HS10");
		
	}
	public static void addLinkedHashMap(LinkedHashMap<String, Integer> lhm)
	{
		lhm.put("LHM1", 1);
		lhm.put("LHM2", 2);
		lhm.put("LHM3", 3);
		lhm.put("LHM4", 4);
		lhm.put("LHM5", 5);
		lhm.put("LHM6", 6);
		lhm.put("LHM7", 7);
		lhm.put("LHM8", 8);
		lhm.put("LHM9", 9);
	}
	public static void addTreeSet(TreeSet<String> treeSet)
	{
		treeSet.add("TS1");
		treeSet.add("TS2");
		treeSet.add("TS3");
		treeSet.add("TS4");
		treeSet.add("TS5");
		treeSet.add("TS6");
		treeSet.add("TS7");
		treeSet.add("TS8");
		treeSet.add("TS9");
		treeSet.add("TS10");
	}
	@SuppressWarnings("unchecked")
	public static void addArrayList(@SuppressWarnings("rawtypes") ArrayList arrl) {
		arrl.add("A1");
		arrl.add("A2");
		arrl.add("A3");
		arrl.add("A4");
		arrl.add("A5");
		arrl.add("A6");
		arrl.add("A7");
		arrl.add("A8");
		arrl.add("A9");
		arrl.add("A10");
		
	}
	public static void addLinkList(LinkedList<String> linkList)
	{
		linkList.add("1");
		linkList.add("2");
		linkList.add("3");
		linkList.add("4");
		linkList.add("5");
		linkList.add("6");
		linkList.add("7");
		linkList.add("8");
		linkList.add("9");
		linkList.add("10");
		linkList.add("11");
	}
	public static void addHashMap(HashMap<String, Integer> hm)
	{
		hm.put("HMOne", 1);
		hm.put("HMTwo", 2);
		hm.put("HMThree", 3);
		hm.put("HMFour", 4);
		hm.put("HMFive", 5);
		hm.put("HMSix", 6);
		hm.put("HMSeven", 7);
		hm.put("HMEight", 8);
		hm.put("HMNine", 9);
		hm.put("HMTen", 10);
		hm.put("HMEleven", 11);
		hm.put("HMTwelve", 12);
	}
	public static void linkListintoArrayList(ArrayList<String> arrayList,LinkedList<String> linkList)
	{
		addArrayList(arrayList);
		addLinkList(linkList);
		arrayList.addAll(4, linkList);
		System.out.println(arrayList.get(6));
		printArrayList(arrayList);
	}
	public static void printArrayList(ArrayList<String> arrl)
	{
		for(String str:arrl)
		{
			System.out.print(str.toString()+" ");
		}
	}


}
