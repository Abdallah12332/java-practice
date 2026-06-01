public class BubbleSort {

  // bubble sort = pairs of adjacent elements ara compared, and the elements
  //               swapped if they are not in order

  //               Quadratic time O(n^2)
  //               small data set = okay-ish (meh)
  //               large data set = bad

  public static void main(String[] args) {

    int array[] = {9, 5, 7, 3, 1, 8, 4, 10, 2, 6, 6, 32, 12, 1, 6, 7, 8, 3};

    bubbleSort(array);

    for (int i : array) {
      System.out.print(i + ", ");
    }
  }

  public static void bubbleSort(int array[]) {

    for (int i = 0; i < array.length - 1; i++) {

      for (int j = 0; j < array.length - i - 1; j++) {

        if (array[j] > array[j + 1]) {

          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }
}
