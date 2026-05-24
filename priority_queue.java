import java.util.*;

public class priority_queue {

  public static void main(String args[]) {
    // Priority Queue = A FIFO data structure that serves elements
    //                  with the highest priorities first
    //                  before elements with lower priority

    //Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
    Queue<String> queue = new PriorityQueue<>();

  //  queue.offer(3.0);
  //  queue.offer(2.5);
  //  queue.offer(4.0);
  //  queue.offer(1.5);
  //  queue.offer(2.0);
  //  queue.offer(3.5);
  //  queue.offer(1.4);
  //  queue.offer(0.5);


   queue.offer("A");
   queue.offer("C");
   queue.offer("E");
   queue.offer("F");
   queue.offer("B");

   while(!queue.isEmpty()) {
      System.out.println(queue.poll());
    }

  }
}
