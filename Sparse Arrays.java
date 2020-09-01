/*

There is a collection of input strings and a collection of query strings. For each query string, determine
how many times it occurs in the list of input strings.

For example, given input and strings= [ab,ab,abc] and queries= [ab,abc,bc], we find 2 instances of ab, 1 of abc and 0 of bc.
For each query, we add an element to our return array, results= [2,1,0].

Input Format
The first line contains and integer N, the size of strings.
Each of the next N lines contains a string strings[i].
The next line contains Q, the size of queries.
Each of the next q lines contains a string queries[i].


Output Format
Return an integer array of the results of all queries in order.

Sample Input 0
4
aba
baba
aba
xzxb
3
aba
xzxb
ab

Sample Output 0
2
1
0

Explanation 0
Here, "aba" occurs twice, in the first and third string. The string "xzxb" occurs once in the fourth string, and "ab" does not occur at all.

Sample Input 1
3
def
de
fgh
3
de
lmn
fgh

Sample Output 1
1
0
1

*/

import java.util.*;
public class Solution 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        String[] strings = new String[N];
        for(int i=0; i<N; i++)
        {
            strings[i] = sc.next();
        }
		int Q = sc.nextInt();
        int j=0;
        int result[]=new int[Q];
        while(sc.hasNext())
        {
            String query=sc.next();
            int count=0;
            for(int i=0; i<N; i++)
            {
                if(strings[i].equals(query))
                {
                    count++;
                }
            }
            result[j++]=count;
			}
        for(int i=0; i<Q; i++)
        {
            System.out.println(result[i]);
        }
    }
}
		