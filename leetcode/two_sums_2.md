# Two Sum II - Input array is sorted
- answers are not zero-based

```
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum = 0;
        int[] arr = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j ++) {
                sum = numbers[i] + numbers[j];
                if (sum == target) {
                    arr[0] = i + 1;
                    arr[1] = j + 1;
                    return arr;
                }
            }
        }  
        throw new IllegalArgumentException("No two sum solution");
    }
}
```