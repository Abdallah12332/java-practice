import java.util.*;

public class LinkedList_vs_ArrayList {

  public static void main(String[] args) {

    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    long startTime;
    long endTime;
    long elapsedTime;

    for (int i = 0; i < 1000000; i++) {
      linkedList.add(1);
      arrayList.add(1);
    }

    // ***********************LinkedList*******************************

    startTime = System.nanoTime();

    // start
    // linkedList.get(0);
    // linkedList.remove(0);

    // middle
    // linkedList.get(500000);
    // linkedList.remove(500000);

    // end
    // linkedList.get(999999);
    // linkedList.remove(999999);

    endTime = System.nanoTime();

    elapsedTime = endTime - startTime;

    System.out.println("LInkedList:\t" + elapsedTime + " ns");

    // ***********************ArrayList*******************************

    startTime = System.nanoTime();

    // start
    // arrayList.get(0);
    // arrayList.remove(0);

    // middle
    // arrayList.get(500000);
    // arrayList.remove(500000);

    // end
    // arrayList.get(999999);
    // arrayList.remove(999999);

    endTime = System.nanoTime();

    elapsedTime = endTime - startTime;

    System.out.println("ArrayList:\t" + elapsedTime + " ns");
  }
}
