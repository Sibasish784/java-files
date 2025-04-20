package MapsPracti;

import java.util.HashMap;

public class HashMapPracti 
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("One", 1);
		hashMap.put("Two", 2);
		hashMap.put("Three", 3);

		System.out.println("Print the values in the HashMap");
		System.out.println("Values in the HashMap: " + hashMap.values());
		System.out.println("check for the key value");
		int i = hashMap.get("One");
		System.out.println("Value for key 'One': " + i);
		System.out.println("Check if a value exists");
		boolean b = hashMap.containsValue(2);
			System.out.println(b);

		System.out.println(hashMap);
	}
}
