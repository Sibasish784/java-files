package classCollection;

import java.util.ArrayList;

public class ForEachLoop 
{
    public static void main(String[] args) {
        
    ArrayList ar = new ArrayList();
    ar.add("A");
    ar.add("B");
    ar.add("C");
    ar.add("D");
    ar.add("E");
    ar.add("F");
    for (Object obj : ar) {
        System.out.println(obj);
    }
    }
}