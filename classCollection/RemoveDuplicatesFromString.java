package classCollection;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
public static void main(String[] args) {
	String s = "AabbCc";
	LinkedHashSet<Character> aC = new LinkedHashSet ();
	for (int i = 0; i < s.length(); i++) {
		aC.add(s.charAt(i));
	}
	for (Object object : aC) {
		System.out.print(object);
	}
}
}
