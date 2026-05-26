public class LinearSearch {

  public static void main(String args[]) {

    // linear search = Iterate through a collection one element at a time

    //                 runtime complexity: o(n)

    //                 Disadvantages:
    //                 Slow for large data sets

    //                 Advantages:
    //                 Fast for searches of small to medium data sets
    //                 Does not need to sorted
    //                 Useful for data structures that do not have random access (Linked List)

    int[] array = {9, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 10};

    int index = Linear_Search(array, 10);

    if (index != -1) {
      System.out.println("Element found at index: " + index);
    } else {
      System.out.println("Element not index: " + index);
    }
  }

  private static int Linear_Search(int[] array, int value) {

    for (int i = 0; i < array.length; i++) {
      if (array[i] == value) {
        return i;
      }
    }
    return -1;
  }
}
