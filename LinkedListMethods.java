package Programs;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListMethods {

	public LinkedListMethods() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		LinkedList<Integer> linkList=new LinkedList<Integer>();
			linkList.add(1);
			linkList.add(13);
			linkList.add(21);
			linkList.add(4534);
			linkList.add(65);
			linkList.add(675);
			linkList.add(122);
			linkList.add(987);
			linkList.add(987);
			linkList.add(987);
			linkList.add(54);
			linkList.add(45);
			linkList.add(453);
			linkList.add(667);
			linkList.add(23);
			

		printLinkedList(linkList);
		//add,push,offer
		linkList.add(5);
		System.out.println("After Add");
		printLinkedList(linkList);
		System.out.println("After addFirst");
		linkList.addFirst(99);
		printLinkedList(linkList);
		System.out.println("After addLast");
		linkList.addLast(101);
		printLinkedList(linkList);
		System.out.println("After push");
		linkList.push(200);
		printLinkedList(linkList);
		System.out.println("After offer");
		linkList.offer(300);
		printLinkedList(linkList);
		System.out.println("After Add");
		linkList.add(565657);
		printLinkedList(linkList);
		System.out.println("After offerFirst");
		linkList.offerFirst(400);
		printLinkedList(linkList);
		System.out.println("After offerLast");
		linkList.offerLast(500);
		printLinkedList(linkList);
		System.out.println("After set");
		linkList.set(5, 10000);
		printLinkedList(linkList);
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		printLinkedList(l1);
		System.out.println("After addall");
		linkList.addAll(6, l1);
		printLinkedList(linkList);
		System.out.println("get(): "+linkList.get(5));
		System.out.println("getFirst(): "+linkList.getFirst());
		System.out.println("getLast(): "+linkList.getLast());
		System.out.println("indexOf(): "+linkList.indexOf(101));
		System.out.println("lastIndexOf(): "+linkList.lastIndexOf(300));
		printLinkedList(linkList);
		System.out.println("Printing in ascending order");
		Collections.sort(linkList);
		printLinkedList(linkList);
		System.out.println("Printing in reverse order");
		 Iterator i=linkList.descendingIterator();  
         while(i.hasNext())  
         {  
             System.out.print(i.next()+" ");  
         }  
         System.out.println();
         
         System.out.println("Shuffle the list order");
         Collections.shuffle(linkList);
         printLinkedList(linkList);
		System.out.println("remove(): "+linkList.remove());
		printLinkedList(linkList);
		System.out.println("remove(): "+linkList.remove(9));
		printLinkedList(linkList);
		System.out.println("removeFirst(): "+linkList.removeFirst());
		printLinkedList(linkList);
		System.out.println("removeFirstOccurence(): "+linkList.removeFirstOccurrence(987));
		printLinkedList(linkList);
		System.out.println("removeLastOccurence(): "+linkList.removeLastOccurrence(987));
		printLinkedList(linkList);
		System.out.println("After Addall()");
		linkList.addAll(l1);
		printLinkedList(linkList);
		System.out.println("retainAll(): "+linkList.retainAll(l1));
		printLinkedList(linkList);
		System.out.println("removeIf(): "+linkList.removeIf(link->(link%3==0)));
		printLinkedList(linkList);
		printLinkedList(l1);
		System.out.println("removeall(): "+linkList.removeAll(l1));
		printLinkedList(linkList);


		
	}
	public static void printLinkedList(List<Integer> linkList)
	{
		linkList.forEach(link->{
			System.out.print(link+" ");
		});
		System.out.println( );
	}
}
