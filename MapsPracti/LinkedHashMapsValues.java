package MapsPracti;

import java.util.LinkedHashMap;

public class LinkedHashMapsValues 
{
	public static void main(String[] args) {
		// Create a LinkedHashMap
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

		// Add some key-value pairs
		linkedHashMap.put("One", 1);
		linkedHashMap.put("Two", 2);
		linkedHashMap.put("Three", 3);

		System.out.println("Print the values in the LinkedHashMap");
		System.out.println("Values in the LinkedHashMap: " + linkedHashMap.values());
		System.out.println("check for the key value");
		int i = linkedHashMap.get("One");
		System.out.println("Value for key 'One': " + i);
		System.out.println("Check if a value exists");
		boolean b = linkedHashMap.containsValue(2);
			System.out.println(b);

	}

}
