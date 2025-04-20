package classCollection;

import java.util.ArrayList;

public class GenericsINJava {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("Siba");
	list.add("Siba");
	list.add("Siba");
	
	for(String s : list) {
		System.out.println(s);
		}
	}
}
