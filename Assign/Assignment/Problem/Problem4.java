package com.Assignment.Problem;

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//converting string to charArray
		char[] ch = str.toCharArray();
		//creating new char array with same length
		char[] newCh = new char[str.length()];
		int endIndex = str.length() - 1;
		int begIndex = 0;
		// recursively calling the method
		callRecursivelyForReverseString(ch, newCh, begIndex, endIndex);

	}

	private static void callRecursivelyForReverseString(char[] ch, char[] newCh, int begIndex, int endIndex) {
		// Exit condition from recursive Call
		if (endIndex < 0) {
			System.out.println(String.valueOf(newCh));
			return;
		}
		newCh[begIndex] = ch[endIndex];
		begIndex++;
		endIndex--;
		callRecursivelyForReverseString(ch, newCh, begIndex, endIndex);
	}

}