package classCollection;

import java.util.Vector;

public class VectorMethodsPractice2 
{
		public static void main(String[] args) 
		{
			Vector vr = new Vector();
			vr.add(10);
			vr.add(10.4f);
			vr.add('S');
			vr.add("siba");
			vr.add(true);
			System.out.println(vr);
			
			vr.remove(2);
			System.out.println(vr);
			Vector vr2 = new Vector();
			vr2.add("Hii added");
			vr2.add(7843);
			//ar2.addAll(ar);
			System.out.println(vr2);
			vr2.addAll(1, vr);
			System.out.println(vr2);
			vr2.removeAll(vr);
			System.out.println(vr2);
			System.out.println(vr.size());
			System.out.println(vr2.size());
			System.out.println(vr.get(3));
			System.out.println(vr.contains("Siba"));
			System.out.println(vr2.isEmpty());
			System.out.println();
			System.out.println("Starting forloop:--");
			System.out.println();
			for(int i = 0; i<vr.size();i++)
			{
				System.out.println(vr.get(i)+" ");
			}
		}

	}


