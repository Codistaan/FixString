package com.minskole.java;

public class WordCount {
	
	static void countMyWords(String word) {
		
		String[] s = word.split(" ");
		 int count = 0;
		for(String str : s) {
			count ++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
			countMyWords("this is awesome and fab");

	}

}
