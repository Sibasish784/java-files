package classCollection;

import java.util.TreeSet;

public class TreeSetPracti 
{
	
	public static void main(String[] args) {
		 TreeSet ar = new TreeSet();// TreeSet is a collection that contains no duplicate elements and maintains ordering of the elements.
			ar.add(10);
			ar.add(1);
			ar.add(2);
			ar.add(67);
			System.out.println(ar);
			
			ar.remove(2);
			System.out.println(ar);
			TreeSet ar2 = new TreeSet();
			ar2.add(872);
			ar2.add(7843);
			//ar2.addAll(ar);
			System.out.println(ar2);
			System.out.println(ar2);
			ar2.removeAll(ar);
			System.out.println(ar2);
			System.out.println(ar.size());
			System.out.println(ar2.size());
			System.out.println(ar.contains(67));
			System.out.println(ar2.isEmpty());
			System.out.println();
			System.out.println("Starting forloop:--");
			System.out.println();
			for(Object object : ar)
			{
				System.out.println(object+" ");
			}
	}
}
