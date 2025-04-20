package classCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetPracti 
{
	public static void main(String[] args) {
		 LinkedHashSet ar = new LinkedHashSet();// LinkedHashSet is a collection that contains no duplicate elements and maintains insertion order.
			ar.add(10.4f);
			ar.add('S');
			ar.add("Siba");
			ar.add(true);
			System.out.println(ar);
			
			ar.remove(2);
			System.out.println(ar);
			LinkedHashSet ar2 = new LinkedHashSet();
			ar2.add("Hii added");
			ar2.add(7843);
			//ar2.addAll(ar);
			System.out.println(ar2);
			System.out.println(ar2);
			ar2.removeAll(ar);
			System.out.println(ar2);
			System.out.println(ar.size());
			System.out.println(ar2.size());
			System.out.println(ar.contains("Siba"));
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
