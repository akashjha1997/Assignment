package com.Assignment.Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problem3 {
	public static void main(String[] args) {
		// TreeSet for ascending order
		List<Integer> list = new ArrayList<>();
		String str = "asdsdgbdfgjdfgn6sbdfh3hhj5j1jh5j66asryuop8ng2nb7mbb8k;0++)O)";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				int num = Character.getNumericValue(str.charAt(i));
				list.add(num);
			}

		}
		//sorting the list
		Collections.sort(list);
		System.out.println(list);
		String newString = list.toString();
		//manipulating the string 
		String newString1 = newString.substring(1, newString.length() - 1).replace(", ", "");
		Long l = Long.parseLong(newString1);
		System.out.println(l);
	}
}
