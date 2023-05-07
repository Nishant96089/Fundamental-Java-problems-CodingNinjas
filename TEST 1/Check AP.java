/*
Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.
Input format :
Line 1 : n
Line 2 : n numbers
Sample Input 1 :
6
2 6 10 14 18 22
Sample Output 1 :
true
Sample Input 2 :
6
2 6 10 15 19 23
Sample Output 2 :
false
*/

//This code doesn't meet all test cases yet,so it will run only 50%.


import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);



int n=sc.nextInt();

int a[]=new int[n];

for(int i=0;i<n;i++)

{

System.out.print("["+i+"]>>");

a[i]=sc.nextInt();

}

for(int i=1;i<n;i++)

{

if(a[i-1]>a[i])

{

int temp=a[i-1];

a[i-1]=a[i];

a[i]=temp;

i=0;

}

}

int d=a[1]-a[0];

boolean x=true;

for(int i=1;i<n;i++)

{

int r=a[i]-a[i-1];

x=(d==r)?true:false;

}

if(x==true)

System.out.println("true");

else

System.out.println("false");

	}
}
