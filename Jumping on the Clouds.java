/*

Emma is playing a new mobile game involving n clouds numbered from 0 to n - 1. A player initially starts out on cloud c0, and they must jump to cloud cn-1. In each step, she can jump from any cloud  to cloud  or cloud .

There are two types of clouds, ordinary clouds and thunderclouds. The game ends if Emma jumps onto a thundercloud, but if she reaches the last cloud (i.e., cn-1), she wins the game!

Can you find the minimum number of jumps Emma must make to win the game? It is guaranteed that clouds c0 and cn-1 are ordinary-clouds and it is always possible to win the game.

Input Format:
The first line contains an integer, n (the total number of clouds). 
The second line contains n space-separated binary integers describing clouds c0, c1, c2,..., cn-1.

If ci = 0, the ith cloud is an ordinary cloud.
If ci = 1, the ith cloud is a thundercloud.

Output Format:
Print the minimum number of jumps needed to win the game.

Constraints:
2 < n < 100
ci € {0, 1}
c0 = cn-1 = 0

Sample Input 0:
7
0 0 1 0 0 1 0
Sample Output 0:
4

Explanation:
Sample Case 0: 
Because c2 and c5 in our input are both 1, Emma must avoid c2 and c5. Bearing this in mind, she can win the game with a minimum of 4 jumps.

Sample Input 1:
6
0 0 0 0 1 0

Sample Output 1:
3

Explanation:
Sample Case 1: 
The only thundercloud to avoid is c4. Emma can win the game in 3 jumps.

*/

static int jumpingOnClouds(int[] c) 
{
    int n=c.length;
    int count = 0;
    for (int i = 0; i < n - 1; i++) 
    {
        if (c[i] == 0) 
        i++;
        count++;
	}
    return(count);
}