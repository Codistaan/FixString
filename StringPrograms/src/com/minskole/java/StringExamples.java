package com.minskole.java;

import java.util.Scanner;

public class StringExamples {
	
	

	public static void main(String[] args) {

		//input a string
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // {t,h,i,s, ,i,s a, s,t,r,i,n,g}
		System.out.println(str);
		
		//
		String s = "this is a";  //literal way of creating string    S1 --> s -->  "this is", "java" -> SCP, immutable, pssword ****$@**
		String s1 = "this is";										
		String s2 = "java+ 2";
		String s3 = "java";
		
		
		char c[] = s.toCharArray();
		for(int i =0; i < c.length; i ++) {
			System.out.print(c[i]);
		}
		
		
		//count the words in a string
		//String str1 = "this is java classes";
		//no of spaces  = 3
		//no of word =4;
		// void wc(String str ){
			 
		
//		int scount =0;
//		int wc =0;
//		if(str.charAt(0) ==  ' ') {
//			space ++;
//		}
//		return wc = spaceCOunt+1;
		
//	}

}
}
