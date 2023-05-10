/*
Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.
Input Format :
String S
Output Format :
Minimum length word
Constraints :
1 <= Length of String S <= 10^5
Sample Input 1 :
this is test string
Sample Output 1 :
is
Sample Input 2 :
abc de ghihjk a uvw h j
Sample Output 2 :
a
*/





public class Solution {
	
	public static String minLengthWord(String input){
		
		// Write your code here
		 int len = input.length();
        int si = 0, ei = 0;
        int min_length = len, min_start_index = 0,
                max_length = 0;

        // Loop while input string is not empty
        while (ei <= len)
        {
            if (ei < len && input.charAt(ei) != ' ')
            {
                ei++;
            }
            else
            {

                int curr_length = ei - si;

                if (curr_length < min_length)
                {
                    min_length = curr_length;
                    min_start_index = si;
                }
                ei++;
                si = ei;
            }
        }
        String minWord = input.substring(min_start_index, min_start_index + min_length);
		    return minWord;

	}
}
