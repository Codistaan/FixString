package com.minskole.java;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findDuplicateWord("I AM LEARNING JAVA JAVA");

	}

	private static void findDuplicateWord(String string) {
		
		Map<String, Integer> map = new HashMap<>();
		String s[] = string.split(" ");
		for (String string2 : s) {
			if(map.containsKey(string2)) {
				map.put(string, map.get(string2) + 1);
			}
			else {
				map.put(string2, 1);
			}
		}
		map.entrySet().stream().filter(m -> m.getValue() > 1).collect(null, null, null);
	}

}
