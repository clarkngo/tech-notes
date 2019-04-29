# Two sums
Common gotcha:
- two zeroes
- negative number
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```
Solution:
```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                indices[0] = i;
                indices[1] = j;
                return indices;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
```
