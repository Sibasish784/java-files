package MapsPracti;

import java.util.TreeMap;

public class TreeMapPracti 
{
	public static void main(String[] args) 
	{
		TreeMap<String, Integer> treeMap = new TreeMap<>();

		treeMap.put("One", 1);
		treeMap.put("Two", 2);
		treeMap.put("hree", 3);

		System.out.println("Print the values in the TreeMap");
		System.out.println("Values in the TreeMap: " + treeMap.values());
		System.out.println("check for the key value");
		int i = treeMap.get("One");
		System.out.println("Value for key 'One': " + i);
		System.out.println("Check if a value exists");
		boolean b = treeMap.containsValue(2);
			System.out.println(b);

		System.out.println(treeMap);
		
	}
}
