/*

Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:

Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Note: In the string, each word is separated by single space and there will not be any extra space in the string.

*/


class Solution {
    public String reverseWords(String s) {
        char[] str=s.toCharArray();
        int low=0,high=0;
        for(high=0;high<str.length;high++)
        {
            if(str[high]==' ')
            {
                reverse(str,low,high-1);
                low=high+1;
            }
        }
        reverse(str,low,high-1);
        return new String(str);
    }
    public void reverse(char[] str, int low, int high)
    {
        while(low < high)
        {
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++; 
            high--;
        }
    }
}

/*

Approach-

1. Convert string to char array to avoid having to deal with separate strings (since concatenation is an expensive operation).
2. Go through char array, keeping pointer start at the beginning of words and pointer end iterating through whole array checking for white space.
3. If white space is found, call function reverse() on char array to reverse chars between start and end-1 (inclusive).
4. Once loop is finished, start now points to start of last word and end points to the last+1 index of char array.
5. Thus, need to call reverse once again to reverse the last word.
6. Return char array as a String

*/