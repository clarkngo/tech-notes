[Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/)

Solution fails 
Input:
```
"dvdf"
```
Output
```
2
```
Expected
```
3
```

```
import java.util.*; 
class Solution {
    public int lengthOfLongestSubstring(String s) {

        // create a table and and characters 'a' to 'z'
        Map<String, Integer> table = new Hashtable<>(); 
        
        int length = 0;
        int longest_length = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); 
            if (!table.containsKey(String.valueOf(c))) {
                table.put(String.valueOf(c), 0);
                length++;
                if (length > longest_length) {
                    longest_length = length;                    
                }                
            } else {
                length = 0;
                table.clear();
                table.put(String.valueOf(c), 0);
                length++; 
            } 
        }
        return longest_length;
    }
}
```
