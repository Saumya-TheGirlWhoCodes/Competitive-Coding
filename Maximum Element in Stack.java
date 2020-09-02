/*

You have an empty sequence, and you will be given N queries. Each query is one of these three types:

1 x- Push the element x into the stack.
2 Delete the element present at the top of the stack.
3 Print the maximum element in the stack.

Input Format
The first line of input contains an integer, N. The next N lines each contain an above mentioned query. (It is guaranteed that each query is valid.)

Output Format
For each type  query, print the maximum element in the stack on a new line.

Sample Input

10
1 97
2
1 20
2
1 26
1 20
2
3
1 91
3

Sample Output

26
91

*/



import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Stack<Integer> s=new Stack<Integer>();
        while(N-->0)
        {
            int c=sc.nextInt();
            switch(c)
			{
                case 1:
                int x=sc.nextInt();
                if(s.isEmpty()==false)           // we are only considering and dealing with max values and avoiding addition of any other element
                {
                    if(s.peek()>x)
                    {
                        x=s.peek();
                    }
                }
                s.push(x);
                break;
				
				case 2:
                s.pop();
                break;

                case 3:
                System.out.println(s.peek());
				break;
            }
        }
        
    }
}