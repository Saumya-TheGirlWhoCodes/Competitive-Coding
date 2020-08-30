/*

Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1

Example 2:

Input: [4,1,2,1,2]
Output: 4

*/

class Solution {
    public int singleNumber(int[] nums) {
        int len=nums.length;
        for(int i=1;i<len;i++)
        {
            nums[0]=nums[0]^nums[i];
        }
        return nums[0];
    }
}

/* 
Approach-

XOR Properties:
1. n^n = 0
2. n^0 = n

Now we use this property to iterate over the complete array and store it in the 0th index to save space everything that is duplicated turns into 0 (using first property) and the single number left, that is unique is remaining at 0 index because it has no duplicat, it is left.
To understand this further try XOR over an array with all members having a pair. 
You would see that the final result would be 0. 
Therfore as the problem says there is one unique number which does not have a pair, remains as it is at the 0th index here.

/*