package com.nagarro.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {

	public static void main(String arg[]) {

		/*
		 * Comparator<String> comp = new Comparator<String>() {
		 * 
		 * @Override public int compare(String s1, String s2) {
		 * 
		 * return Integer.compare(s2.length(), s1.length()); }
		 * 
		 * };
		 */

		Comparator<String> compLambda = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());

		List<String> list = Arrays.asList("**", "****", "***", "*");

		Collections.sort(list, compLambda);

		for (String str : list) {
			System.out.println(str);
		}
	}

}
