import java.util.*;      
  class TestVector1{      
  public static void main(String args[]){      
    Vector<String> v = new Vector<String>(); //creating vector  
    v.add("umesh"); //method of Collection  
    v.addElement("irfan"); //method of Vector  
    v.addElement("kumar");  
    
    //traversing elements using Enumeration  
    Enumeration e = v.elements();  

    // hasMoreElements is a method of interface Enumeration
    while(e.hasMoreElements()){  
    // nextElement is a method of interface Enumeration
    System.out.println(e.nextElement());  
    }  
  }      
}      
