/*
Print the following pattern for the given number of rows.
Pattern for N = 4
4444444
4333334
4322234
4321234
4322234
4333334  
4444444
Input format : N (Total no. of rows)

Output format : Pattern in N lines

Sample Input :
3
Sample Output :
33333
32223
32123
32223
33333
*/



import java.util.Scanner;
public class solution {

	public static void print(int n) {
	//Write your code here
	  int s = 2 * n - 1;

        // Upper Half
        for (int i = 0;
             i < (s / 2) + 1; i++)
        {
            int m = n;

            // Decreasing part
            for (int j = 0; j < i; j++)
            {
                System.out.print(m);
                m--;
            }

            // Constant Part
            for (int k = 0;
                 k < s - 2 * i; k++)
            {
                System.out.print(n - i);
            }

            // Increasing part.
            m = n - i + 1;
            for (int l = 0; l < i; l++)
            {
                System.out.print(m);
                m++;
            }

            System.out.println();
        }

        // Lower Half
        for (int i = s / 2 - 1;
             i >= 0; i--)
        {

            // Decreasing Part
            int m = n;
            for (int j = 0; j < i; j++)
            {
                System.out.print(m);
                m--;
            }

            // Constant Part.
            for (int k = 0;
                 k < s - 2 * i; k++)
            {
                System.out.print(n - i);
            }

            // Decreasing Part
            m = n - i + 1;
            for (int l = 0; l < i; l++)
            {
                System.out.print(m);
                m++;
            }
            System.out.println();
        }

	}

}
