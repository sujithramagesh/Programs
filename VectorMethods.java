package Programs;

import java.util.Vector;

public class VectorMethods {

	public VectorMethods() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Vector<Integer> vector=new Vector<Integer>();
	vector.add(10);
	vector.add(20);
	vector.add(30);
	vector.add(40);
	vector.add(50);
	vector.add(60);
	vector.add(70);
	vector.add(80);
	vector.add(90);
	printVector(vector);
	
}
public static void printVector(Vector<Integer> vector)
{
	for(Integer vecti:vector)
	{
		System.out.print(vecti+" ");
	}
	System.out.println();
}
}
