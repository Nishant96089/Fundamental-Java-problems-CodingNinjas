/*
An urn contains 8 balls : 4 red , 2 blue and 2 green. Now n balls are drawn out of the urn. Calculate the probability that out of n drawn balls exactly x balls are red.
Find your answer multiplied by 100 and return the integer part.
All required values for computation will be in integer range.
x is always less than equal to 4 and x is always less than equal to n.
Input format :
Two spaced integers : n and x
Output format :
Integer part of (Probability * 100). 
Sample Input 1 :
3 1
Sample Output 1:
42
*/


public class Solution {
    
    public static int probability(int n, int x){
        int totalWays = combinations(8, n); // Total number of ways to choose n balls from 8
        int redWays = combinations(4, x) * combinations(4, n-x); // Number of ways to choose x red and (n-x) non-red balls from 8
        int probability = redWays * 100 / totalWays; // Probability in percentage
        
        return probability;
    }
    
    // Helper function to calculate combinations using the formula n! / (r! * (n-r)!)
    private static int combinations(int n, int r) {
        int numerator = factorial(n);
        int denominator = factorial(r) * factorial(n-r);
        return numerator / denominator;
    }
    
    // Helper function to calculate factorial using recursion
    private static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
