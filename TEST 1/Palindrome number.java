/*
Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.
Palindrome are the numbers for which reverse is exactly same as the original one. For eg. 121
Sample Input 1 :
121
Sample Output 1 :
true
Sample Input 2 :
1032
Sample Output 2 :
false
*/



import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
        
        int num = scn.nextInt();
        int r, sum=0,temp;
        temp= num;
        
        if(num>=0)
        {
            while(num>0)
            {
                r=num%10;
                sum=(sum*10)+r;
                num=num/10;
            }
        
            if(temp==sum)
            {
            System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
        else
        {
            System.out.println("Invalid input");
        }

	}
}
