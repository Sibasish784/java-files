package classCollection;

import java.util.LinkedList;

public class LinkedListPracti 
{
	public static void main(String[] args) {
        // Create a linked list and add some elements to it
        LinkedList list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("abc");
        list.addAll(2, list);
        Object aObject = list.peek();
        System.out.println(aObject);
        
        System.out.println(list.get(3));
        System.out.println("For each");
        for(Object element : list) {
            System.out.println(element);
        }
        System.out.println("Size of the list: " + list.size());
        list.poll();
        System.out.println("Size of the list: " + list.size());


    }

}
