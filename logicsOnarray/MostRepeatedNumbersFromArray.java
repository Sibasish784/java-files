package logicsOnarray;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
public class MostRepeatedNumbersFromArray 
{
public static void main(String[] args) 
	{
	int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5};
	LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer, Integer>();
	for(int i = 0; i<arr.length; i++) 
		{
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				int n = map.get(arr[i]);
				n++;
				map.put(arr[i], n);
			}
		}
		int value = 0;
		int key = 0;
		for(Entry<Integer, Integer> entry : map.entrySet()) 
		{
			if(entry.getValue() > value) 
			{
				value = entry.getValue();
				key = entry.getKey();
			}
		}
		System.out.println("Most repeated number is: " + key);
	}
}
