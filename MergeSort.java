public class MergeSort {

  public static void main(String[] args) {

    int[] array = { 8, 4, 2, 1, 5, 6, 7, 9, 3 };

    mergeSort(array);

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }

  }

}
