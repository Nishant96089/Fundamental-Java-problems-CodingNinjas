/*
Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.
Input Format :
Integer N
Output Format :
Prime numbers in different lines
Constraints :
1 <= N <= 100
Sample Input 1:
9
Sample Output 1:
2
3
5
7
Sample Input 2:
20
Sample Output 2:
2
3
5
7
11
13
17
19

*/


import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=2;
        for(i=2;i<=n;i++){
            boolean isprime=true;
            for(int div=2;div<=i/2;div++){
                if (i%div ==0)
                    isprime=false;
            }
            if(isprime){
                System.out.println(i);
            }
        }


		
	}
}
