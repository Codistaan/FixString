package com.minskole.java;

public class StringReversal {
	
	static void ReverseMe(String s) { //abcde --> s{4}s[3]s[2]
		
		
		System.out.println(new StringBuilder(s).reverse());
		
	}

	public static void main(String[] args) {
		ReverseMe("anything but java");//avaj ma I
	}
	
	
	//string : count words in string : 3

}
