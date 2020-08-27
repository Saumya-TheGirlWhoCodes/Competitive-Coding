/*

Write a function that reverses a string using stack. 
The input string is given as an array of characters char[].

Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

*/

class Solution {
    public void reverseString(char[] s) 
    {
        Stack <Character> st=new Stack<>();
        int i = 0;
        for (int j = 0; j < s.length; j++) 
        {
            st.push(s[j]);
        }
        while(!st.isEmpty()) 
        {
            s[i] = st.pop();
            i++;
        }
    }