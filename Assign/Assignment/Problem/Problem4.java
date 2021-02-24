package com.Assignment.Problem;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//breaking the sentence
		String[] strArray=str.split(" ");
		String[] newSentence=new String[strArray.length];
		int index =0;
		callRecursivelyForWords(newSentence,strArray,index);
		
		
		
	
	}

	private static void callRecursivelyForWords(String[] newSentence, String[] strArray, int index) {
		//break condition
		if(index==strArray.length) {
			//for converting array to String
			String str1=Arrays.toString(newSentence);
			String str2=str1.substring(1, str1.length()-1).replaceAll(",", "");
			System.out.println(str2);
			return;
		}
		//converting string to charArray
		char[] ch = strArray[index].toCharArray();
		//creating new char array with same length
		char[] newCh = new char[ch.length];
		int endIndex = ch.length - 1;
		int begIndex = 0;
		// recursively calling the method
		newSentence[index]=	callRecursivelyForReverseString(ch, newCh, begIndex, endIndex);
		index++;
		callRecursivelyForWords(newSentence,strArray,index);

		
	}

	private static String callRecursivelyForReverseString(char[] ch, char[] newCh, int begIndex, int endIndex) {
		// Exit condition from recursive Call
		if (endIndex < 0) {
			return String.valueOf(newCh) ;
		}
		newCh[begIndex] = ch[endIndex];
		begIndex++;
		endIndex--;
		return callRecursivelyForReverseString(ch, newCh, begIndex, endIndex);
	}

}
