package Programs;
import java.util.HashSet;

public class HashSetmethods {

	public HashSetmethods() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	HashSet<Integer> hashSet=new HashSet<Integer>();
	hashSet.add(1);
	hashSet.add(7);
	hashSet.add(5);
	hashSet.add(2);
	hashSet.add(6);
	for(Integer fset:hashSet)
	{
		System.out.print(fset+" ");
	}
	System.out.println();
	System.out.println("Size: "+hashSet.size());
	System.out.println("contains: "+ hashSet.contains(7));
	System.out.println();
	/*
	 * Set<Integer> treeSet=new TreeSet<Integer>(); treeSet.add(1); treeSet.add(2);
	 * treeSet.add(3); treeSet.add(4); treeSet.add(5); hashSet.addAll(treeSet);
	 * Iterator<Integer> it=hashSet.iterator(); while(it.hasNext()) {
	 * System.out.print(it.next()+" "); } System.out.println();
	 */
}
}
