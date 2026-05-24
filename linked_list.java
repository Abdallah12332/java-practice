import java.util.*;

public class linked_list {

  public static void main(String args[]) {

// ****************************************************************************

// LinkedList = stores Nodes in 2 parts (data + address)
//                Nodes are in non-consecutive memory locations
//                Elements are linked using pointers

//                            Singly Linked List
//                   Node                Node                Node
//             [data | address] -> [data | address] -> [data | address]

//                            Doubly Linked List
//                   Node                                    Node
//       [address | data | address] <-> [address | data | address]

//          advantages?
//          1. Dynamic Data Structure (allocates needed memory while running)
//          2. Insertion and Deletion of Nodes is easy. O(1)
//          3. No/Low memory waste
// 
//          disadvantages?
//          1. Greater memory usage (additional pointer)
//          2. No random access of elements (no index [i])
//          3. Accessing/searching elements is more time consuming. O(n)
//
//          uses?
//          1. implement Stacks/Queues
//          2. GPS navigation
//          3. music playlist

// *********************************************************************************
    LinkedList<String> linkedList = new LinkedList<String>();
    linkedList.offer("A");
    linkedList.offer("C");
    linkedList.offer("B");
    //linkedList.pop();
    linkedList.add(2, "E");
    //linkedList.remove("E");
    
    System.out.println(linkedList.peekFirst());
    System.out.println(linkedList.peekLast());
    linkedList.addFirst("ض");
    linkedList.addLast("G");
    String first = linkedList.removeFirst();
    String last = linkedList.removeLast();
    System.out.println(linkedList + " " + first +  " " + last);
  }
}
