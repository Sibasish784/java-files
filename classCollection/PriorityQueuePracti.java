package classCollection;

import java.util.PriorityQueue;

public class PriorityQueuePracti 
{
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        pq.add(60);
        pq.add(70);

        Object p = pq.peek();
        System.out.println("Peek: " + p);
        System.out.println("Priority Queue: " + pq);
        System.out.println("Poll: " + pq.poll());
        System.out.println("Priority Queue after poll: " + pq);
        System.out.println("Remove: " + pq.remove(30));
        System.out.println("Priority Queue after remove: " + pq);
        System.out.println("For each");
        for(Object obj : pq) {
            System.out.println("Element: " + obj);
        }
    }
}
