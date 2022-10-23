import java.util.PriorityQueue;

public class showPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(11);
        pq.add(22);
        pq.add(22);
        pq.add(44);
        pq.add(33);
        pq.add(55);
        pq.add(66);
        pq.add(77);
        pq.add(88);

        System.out.println("=============Before=================");
        System.out.println(pq);

        // show first element
        System.out.println("Queue Peek = " + pq.peek());

        // poll delete the first element
        System.out.println("Queue poll = " + pq.poll());

        // poll delete the second element
        System.out.println("Queue poll = " + pq.poll());

        System.out.println("=============After=================");
        System.out.println(pq);

    }
}
