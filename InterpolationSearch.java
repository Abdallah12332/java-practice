public class InterpolationSearch {

  // interpolation search = improvement over binary search best used for "uniformly" distributed
  // data
  //                        "Guesses" where a value might be based on calculated probe results
  //                        if probe is incorrect, Search area is narrowed, and a new probe is
  // calculated

  //                        average case: O(log(log(n)))
  //                        worst case: O(n) [values increase exponentially]

  public static void main(String args[]) {

    int[] array = new int[10000];

    for (int i = 0; i < array.length; i++) {
      array[i] = i;
    }

    int index = interpolationSearch(array, 9324);

    if (index != -1) {
      System.out.println("Element found at index: " + index);
    } else {
      System.out.println("Element not found");
    }
  }

  private static int interpolationSearch(int[] array, int value) {

    int high = array.length - 1;
    int low = 0;

    while (value >= array[low] && value <= array[high] && low <= high) {
      int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);

      System.out.println("probe: " + probe);

      if (array[probe] == value) {
        return probe;
      } else if (array[probe] < value) {
        low = probe + 1;
      } else {
        high = probe - 1;
      }
    }

    return -1;
  }
}
