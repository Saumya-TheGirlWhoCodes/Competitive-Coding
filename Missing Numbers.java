/*

Numeros the Artist had two lists that were permutations of one another. He was very proud. Unfortunately, while transporting them from one exhibition to another, some numbers were lost out of the first list. Can you find the missing numbers?

As an example, the array with some numbers missing, arr= [7,2,5,3,5,3]. The original array of numbers brr= [7,2,5,4,6,3,5,8]. The numbers missing are [4,6].

Notes

-If a number occurs multiple times in the lists, you must ensure that the frequency of that number in both lists is the same. If that is not the case, then it is also a missing number.
-You have to print all the missing numbers in ascending order.
-Print each missing number once, even if it is missing multiple times.
-The difference between maximum and minimum number in the second list is less than or equal to .

Function Description

Complete the missingNumbers function in the editor below. It should return a sorted array of missing numbers.
missingNumbers has the following parameter(s):
arr: the array with missing numbers
brr: the original array of numbers

Input Format

There will be four lines of input:

 n - the size of the first list, 
The next line contains  space-separated integers 
 m - the size of the second list, 
The next line contains  space-separated integers 

Output Format

Output the missing numbers in ascending order.

Sample Input

10
203 204 205 206 207 208 203 204 205 206
13
203 204 204 205 206 207 205 208 203 206 205 206 204
Sample Output

204 205 206
Explanation

204 is present in both arrays. Its frequency in arr is 2, while its frequency in brr is 3. Similarly, 205 and 206 occur twice in arr, but three times in brr. The rest of the numbers have the same frequencies in both lists.

*/

import java.util.*;
public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<n;i++)    
        {
…        {
            if(Collections.frequency(a,i)!=Collections.frequency(b,i))  
            {
                System.out.print(i+" ");
            }
        }
    }
}
