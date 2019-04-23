import java.util.*;

public class VectorExample {

  public static void main(String args[]) {
    /* Vector of initial capacity(size) of 2 */
    Vector<String> vec = new Vector<String>(2);

    /* Adding elements to a vector*/
    vec.addElement("Apple");
    vec.addElement("Orange");
    vec.addElement("Mango");
    vec.addElement("Fig");

    /* check size and capacityIncrement*/
    System.out.println("Size is: " + vec.size());
    System.out.println("Default capacity increment is: " + vec.capacity());

    vec.addElement("fruit1");
    vec.addElement("fruit2");
    vec.addElement("fruit3");

    /*size and capacityIncrement after two insertions*/
    System.out.println("Size after addition: " + vec.size());
    System.out.println("Capacity after increment is: " + vec.capacity());

    /* contains specific element */
    System.out.println("Contains fruit1: " + vec.contains("fruit1"));

    /* empty or not */
    System.out.println("Vector is empty? " + vec.isEmpty());

    /*Display Vector elements*/
    // iterating a Vector using Enumeration
    Enumeration en = vec.elements();
    System.out.println("\nElements are:");

    // hasMoreElements is a method of interface Enumeration
    while(en.hasMoreElements())

      // nextElement is a method of interface Enumeration
      System.out.print(en.nextElement() + " ");
  }
}
