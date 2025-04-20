package classCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethodsPractice 
{

	public static void main(String[] args) 
	{
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(10.4f);
		ar.add('S');
		ar.add("Siba");
		ar.add(true);
		System.out.println(ar);
		
		ar.remove(2);
		System.out.println(ar);
		ArrayList ar2 = new ArrayList();
		ar2.add("Hii added");
		ar2.add(7843);
		//ar2.addAll(ar);
		System.out.println(ar2);
		ar2.addAll(1, ar);
		System.out.println(ar2);
		ar2.removeAll(ar);
		System.out.println(ar2);
		System.out.println(ar.size());
		System.out.println(ar2.size());
		System.out.println(ar.get(3));
		System.out.println(ar.contains("Siba"));
		System.out.println(ar2.isEmpty());
		System.out.println();
		System.out.println("Starting forloop:--");
		System.out.println();
		for(int i = 0; i<ar.size();i++)
		{
			System.out.println(ar.get(i)+" ");
		}
	}

}
