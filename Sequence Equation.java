/*

Given a sequence of  integers, p(1),p(2),...,p(n) where each element is distinct and satisfies 1<=p(x)<=n. For each x where 1<=x<=n, find any integer y such that p(p(y))=x and print the value of y on a new line.

For example, assume the sequence p=[5,2,1,3,4]. Each value of x between 1 and 5, the length of the sequence, is analyzed as follows:

x=1 equiv p[3],p[4]=3, so p[p[4]]=1
x=2 equiv p[2],p[2]=2, so p[p[2]]=2
x=3 equiv p[4],p[5]=4, so p[p[5]]=3
x=4 equiv p[5],p[1]=5, so p[p[1]]=4
x=5 equiv p[1],p[3]=1, so p[p[3]]=5
The values for y are [4,2,5,1,3].

Input Format

The first line contains an integer n, the number of elements in the sequence.
The second line contains n space-separated integers p[i] where 1<=i<=n.

Output Format

For each x from 1 to n, print an integer denoting any valid y satisfying the equation p(p(y))=x on a new line.

Sample Input 0

3
2 3 1

Sample Output 0

2
3
1

Sample Input 1

5
4 3 5 1 2

Sample Output 1

1
3
5
4
2

*/


import java.util.*;
public class Solution {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
…        {
            int y=p_inverse[p_inverse[x]];
            System.out.println(y);
        }
    }
}

/*

Approach-
This equation can be rewritten as y = p_inverse(p_inverse(x)), which is the version of the equation we use to calculate and print y. 

*/
