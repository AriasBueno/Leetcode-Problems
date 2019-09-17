package Leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class Palindrome_Number {
	/*
	 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

		Example 1:
		
		Input: 121
		Output: true
		Example 2:
		
		Input: -121
		Output: false
		Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
		Example 3:
		
		Input: 10
		Output: false
		Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
		
		Follow up:

		***Could you solve it without converting the integer to a string?***
	 */
	
	public static boolean isPalindrome(int x) {	
		if(x < 0) {//No negative integers
			return false;
		}
		else {
			ArrayList<Integer> digitArr = convertToArray(x);
			int midpoint = digitArr.size()/2;
			int firstHalf = 0;
			int lastHalf = digitArr.size() - 1;
			
			while((firstHalf < midpoint) && (lastHalf >= midpoint)) {
				//compare firstHalf with lastHalf
				if(digitArr.get(firstHalf) == digitArr.get(lastHalf)) {
					firstHalf++;
					lastHalf--;
				}
				else {
					return false;
				}
			}
			return true;	
		}
	}
	
	//Helper method
	public static ArrayList<Integer> convertToArray(int number){
		ArrayList<Integer> digitArr = new ArrayList<Integer>();
		
		while(number > 0) {
			int digit = number % 10; //store digit
			number /= 10; //the same as: number = number / 10;
			digitArr.add(digit);
		}
		//NOTE:: The digits are stored backwards
		return digitArr;
	}
	
	public static void main(String[] args) {
		//Tests
		System.out.println(isPalindrome(121));//true
		System.out.println(isPalindrome(-121));//false
		System.out.println(isPalindrome(10));//false
		System.out.println(isPalindrome(1122));//false
		System.out.println(isPalindrome(1335331));//true
	}
}
