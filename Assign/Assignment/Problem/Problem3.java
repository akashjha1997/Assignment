package com.Assignment.Problem;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class Problem3 {
public static void main(String[] args) {
	//TreeSet for ascending order 
	Set<Integer> set=new TreeSet<>();
	String str="asdsdgbdfgjdfgn6sbdfh3hhj5j1jh5j66asryuop8ng2nb7mbb8k;0++)O)";
	for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				int num=Character.getNumericValue(str.charAt(i));
				set.add(num);
			}
			
		
	}
	
	System.out.println(set.iterator().next());
}
}
