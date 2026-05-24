
public class Main_DynamicArray {

  public static void main(String[] args) {

     DynamicArray dynamicArray = new DynamicArray();

      dynamicArray.add("A");
      dynamicArray.add("B");
      dynamicArray.add("C");
      dynamicArray.insert(0,"x");
      dynamicArray.delete("A");
     System.out.println(dynamicArray);
     System.out.println("Size: " + dynamicArray.size);
     System.out.println("Capacity: " + dynamicArray.capacity);
     System.out.println(dynamicArray.toString());
     System.out.println("Empty: " + dynamicArray.isEmpty());
   }
}
