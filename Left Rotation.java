/*

Given an array of 'n' integers and a number, 'd', perform 'd' left rotations on the array. 
Then print the updated array as a single line of space-separated integers.

Sample Input

5 4
1 2 3 4 5

Sample Output

5 1 2 3 4

*/


import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Solution obj=new Solution();
        obj.RotateArr(arr,d);
        obj.printArray(arr);
    }
	void RotateArr(int arr[], int d)
    {
        for(int i=0;i<d;i++)
        {
            leftRotate(arr);
        }
    }
	void leftRotate(int arr[])
    {
        int temp=arr[0];
        int len=arr.length;
        for(int i=1;i<len;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[len-1]=temp;
    }
	void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    
}
