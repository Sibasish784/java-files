package reverseTheRepeatedWordsInSentene;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
public class ReverseTheRepeatedWordsInSetence 
{
	public static void main(String[] args) {
		String s = "Hello Hello World World";
		String[] words = s.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for(int i = 0; i < words.length; i++) {
			if (!map.containsKey(words[i])) {
				map.put(words[i], 1);
				} else {
					int n = map.get(words[i]);
					n++;
					map.put(words[i], n);
			}
		}
		for(Entry<String, Integer> o : map.entrySet()) 
		{
			String word = o.getKey();
			int count = o.getValue();
			if (count > 1) 
			{
				for (int i = 0; i < count; i++) 
				{
					String s1 = o.getKey();
					String revString = " ";
					for (int j = s1.length() - 1; j >= 0; j--) 
					{
						revString = revString + s1.charAt(j);
					}
					System.out.println(revString + " ");
				}
			}
		}
	}
}
