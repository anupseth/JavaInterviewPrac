package practice;

import java.util.Arrays;

/*
 
 Given an array A[] of integers, sort the array according to frequency of elements. 
 That is elements that have higher frequency come first. If frequencies of two 
 elements are same, then smaller number comes first.

Input:
The first line of input contains an integer T denoting the number of test cases. 
The description of T test cases follows. The first line of each test case contains a 
single integer N denoting the size of array. The second line contains N space-separated 
integers A1, A2, ..., AN denoting the elements of the array.

Output:
For each testcase, in a new line, print each sorted array in a seperate line. 
For each array its numbers should be seperated by space.

Constraints:
1 ≤ T ≤ 70
30 ≤ N ≤ 130
1 ≤ Ai ≤ 60 

Example:
Input:
2
5
5 5 4 6 4
5
9 9 9 2 5

Output:
4 4 5 5 6
9 9 9 2 5

Explanation:
Testcase1: The highest frequency here is 2. Both 5 and 4 have that frequency. 
Now since the frequencies are same then smaller element comes first. So 4 4 comes first then comes 5 5. 
Finally comes 6.
The output is 4 4 5 5 6.

Testcase2: The highest frequency here is 3. The element 9 has the highest frequency. 
So 9 9 9 comes first. Now both 2 and 5 have same frequency. So we print smaller element first.
The output is 9 9 9 2 5.
 
 
 
 
 
 */

public class SortingElementsOfAnArraybyFrequency {

	private static int j = 0;

	public static void main(String[] args) {

		int l = 1;
		String finalOutput = "";
		String input = "";
		int previousCount = 0;
		int count = 0;
		String singleCharStr = "";

		for (int i = 0; i < args.length; i++) {

			if (i != 0 && i % 2 == 0) {
				input = args[i];
				char[] charArray = input.toCharArray();
				Arrays.sort(charArray);
				input = new String(charArray);
				finalOutput = "";
				previousCount = 0;
				singleCharStr = "";
				for (j = 0; j < charArray.length;) {
					count = (int) input.chars().filter(ch -> ch == charArray[j]).count();
					if (previousCount < count)
						if (count == 1)
							singleCharStr = singleCharStr + input.substring(j, j + count);
						else
							finalOutput = input.substring(j, j + count) + finalOutput;
					else {
						if (count > 1)
							finalOutput = finalOutput + input.substring(j, j + count);
						else
							singleCharStr = singleCharStr + input.substring(j, j + count);
					}
					j = (j + count);
					previousCount = count;
				}

				System.out.println("Test case " + l + " input  : " + input);
				System.out.println("Test case " + l++ + " output : " + finalOutput + singleCharStr);
				System.out.println(" -------------- -------------------- -----------------");

			}

		}

	}

}
