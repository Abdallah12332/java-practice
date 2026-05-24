import java.util.Queue;
import java.util.LinkedList;

public class queue{

  public static void main (String[] args) {
    // *******************************************************
    // Queue = FIFO data structure. First-In First-Out (ex. A line of people)
    //         A collection designed for holding elements prior to processing
    //         Linear data structure
    //
    //         add    = enqueue, offer()
    //         remove = dequeue, poll()
    // طابور
    // *******************************************************

    Queue<String> queue = new LinkedList<String>();
    queue.offer("karen");
    queue.offer("chad");
    queue.offer("steve");
    queue.offer("harold");
    queue.poll();
    //System.out.println(queue.element());
    //System.out.println(queue.isEmpty());
    System.out.println(queue.peek());
    System.out.println(queue.contains("harold"));
    System.out.println(queue);   
  }
}
