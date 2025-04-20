package classCollection;
import java.util.HashSet;

public class HashSetPracti 
{
 public static void main(String[] args) {
	 HashSet ar = new HashSet();// HashSet is a collection that contains no duplicate elements.No insertion order is maintained.
		ar.add(10);
		ar.add(10.4f);
		ar.add('S');
		ar.add("Siba");
		ar.add(true);
		System.out.println(ar);
		
		ar.remove(2);
		System.out.println(ar);
		HashSet ar2 = new HashSet();
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
