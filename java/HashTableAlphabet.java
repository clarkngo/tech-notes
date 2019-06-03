import java.util.*; 

public class HashTableAlphabet {
  public static void main(String[] args) {
    Map<String,Integer> map = new HashMap<>();
    for (char ch = 'a'; ch <= 'z'; ++ch) 
    map.put(String.valueOf(ch), 0); 
    System.out.println("Does my hash map contains 'a' as a key? " 
      + map.containsKey("a"));
    System.out.println(map);
  }
}