import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
  public static void main(String[] args) {
      //Integer | Float | String | Boolean
      ArrayList<Integer> list =new ArrayList<Integer>();
      
      //add elements
      list.add(6);
      list.add(1);
      list.add(2);

      System.out.println(list+" ");

      //get element
      int element =list.get(0);
      System.out.println("Element on this index is:" +element);

      //add element in between
      list.add(1,5);
      System.out.println("New List is : " +list);

      //set element to replace the existing element
      list.set(3,4);
      System.out.println("After replacing the element : "+list);

      //delete element
      list.remove(2);
      System.out.println("Removing element : "  +list);

      //size
      int size=list.size();
      System.out.println("Size of the element: "+size);

      //loops
      
      for (int i = 0; i < list.size(); i++) {
        System.out.println("Loops: "+list.get(i));
          
      }
      System.out.println();

      //Sorting
      Collections.sort(list);
      System.out.println("Sorted : "+list);




  }
  
}
