import java.util.*;     
public class ChapOneExFour {
  public static Vector union (Vector a, Vector b) {
    Vector<Object> merge = new Vector<Object>();
    merge.addAll(a);
    merge.addAll(b);
    return merge;
  }
  public static void main(String[] args) {
    
    Vector<String> v = new Vector<String>(); //creating vector  
    Vector<String> x = new Vector<String>(); //creating vector  

    v.addElement("new");
    x.addElement("obj");

    Enumeration en =  ChapOneExFour.union(v, x).elements();
    System.out.println("\nElements are:");

    // hasMoreElements is a method of interface Enumeration
    while(en.hasMoreElements())

      // nextElement is a method of interface Enumeration
      System.out.print(en.nextElement() + " ");
      System.out.println();
  }
}
