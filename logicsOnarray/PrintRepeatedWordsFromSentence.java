package logicsOnarray;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintRepeatedWordsFromSentence {
public static void main(String[] args) {
	String str = "This is Java Java a programming language";
	String[] words = str.split(" ");
	LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
	for (int i = 0; i < words.length; i++) {
		if (!map.containsKey(words[i])) {
			map.put(words[i], 1);
		} else {
			int n = map.get(words[i]);
			n++;
			map.put(words[i], n);
		}
	}
		for(Entry<String, Integer> entry : map.entrySet()) {
		if (entry.getValue() > 1) {
			System.out.println("Repeated word: " + entry.getKey() + " Count: " + entry.getValue());
			}
		}
	}
}
