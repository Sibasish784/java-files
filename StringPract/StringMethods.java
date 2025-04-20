package StringPract;

public class StringMethods 
{
	public static void main(String[] args) 
	{
		//equalIgnoreCase()
		String a = "Hii i'm Sibasish";
		String b = "HII I'm sibasish";
		boolean c=a.equalsIgnoreCase(b);
		System.out.println(c);
		
		//trim()
		String ta = "      Hii i'm Sibasish";
		System.out.println("Before trim:"+ta);
		String t2 = ta.trim();
		System.out.println("After Trim: "+t2);
		
		//split()
		String[] sp = t2.split(" ");
		for (int i = 0; i < sp.length; i++) 
		{
			System.out.println(sp [i]);
		}
		
		//toCharArray()
		char[] ch = t2.toCharArray();
		for(int i=0; i<sp.length; i++)
		{
			System.out.println(ch[i]);
		}
		//substring()
		String sub = t2.substring(5);
		System.out.println(sub);
		
		//substring(index, index)
		String sub1 = t2.substring(5, 10);
		System.out.println(sub1);

		//replace()
		String rep = t2.replace("Sibasish", "Siba");
		System.out.println(rep);

		// replaceAll()
		String rep1 = t2.replaceAll("sh", "Si");
		System.out.println(rep1);

		//concat()
		String con = t2.concat(" How are you?");
		System.out.println(con);

		//indexOf()
		int ind = t2.indexOf("Sibasish");
		System.out.println(ind);

		//lastIndexOf()
		int ind1 = t2.lastIndexOf("a");
		System.out.println(ind1);

		//isEmpty()
		boolean emp = t2.isEmpty();
		System.out.println(emp);
	}
}
