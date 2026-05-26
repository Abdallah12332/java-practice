
public class Main_DynamicArray {

  public static void main(String[] args) {

     DynamicArray dynamicArray = new DynamicArray();
     
     dynamicArray.add("A");
     dynamicArray.add("B");
     dynamicArray.add("C");
     dynamicArray.add("D");
     dynamicArray.add("E");
     dynamicArray.add("F");
     dynamicArray.add("G");
     dynamicArray.add("H");
     dynamicArray.add("I");
     dynamicArray.insert(0,"x");
     // dynamicArray.delete("A");
     // int i = dynamicArray.search("C");
     // System.out.println("A in:" + i);
     System.out.println("Size: " + dynamicArray.size);
     System.out.println("Capacity: " + dynamicArray.capacity);
     System.out.println(dynamicArray.toString());
     System.out.println("Empty: " + dynamicArray.isEmpty());
   }
}
