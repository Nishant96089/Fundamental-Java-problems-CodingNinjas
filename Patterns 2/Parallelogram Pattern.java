/*
Write a program to print parallelogram pattern for the given N number of rows.
For N = 4



The dots represent spaces.
Input Format :
 A single integer : N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
***
 ***
  ***
Sample Input 2 :
5
Sample Output 2 :
*****
 *****
  *****
   *****
    *****
    
    
    */


import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        
        for (int i=0;i<N;i++)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            
            for (int j=0;j<N;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

	}
}
