import java.util.*; 

public class HashTable {
  public static void main(String[] args) {
    // create a table and add some values 
    Map<String, Integer> table = new Hashtable<>(); 
    table.put("Pen", 10); 
    table.put("Book", 100); 

    // print map details 
    System.out.println("hashTable: "
                      + table.toString()); 

    // provide value for new key which is absent

    // using computeIfAbsent method 
    table.computeIfAbsent("newPen", k -> 600); 
    table.computeIfAbsent("newBook", k -> 800); 

    // using computeIfPresent method
    table.computeIfPresent("Pen", (k,v) -> v + 1); 

    // print new mapping 
    System.out.println("new hashTable: "
                      + table); 

    table.clear();
    System.out.println("empty hashTable: "
                      + table); 

    // Checking for the key_element '20' 
    System.out.println("Is the key 'Pen' present? " +  
    table.containsKey("Pen")); 
  }
}
