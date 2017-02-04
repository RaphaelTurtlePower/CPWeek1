package com.cp.weektwo.assignment.hash;

import java.util.HashSet;

public class ColorfulNumber {
	public int colorful(int a) {
		HashSet<Integer> values = new HashSet<>();
		String input = String.valueOf(a);
		for(int i=0; i<input.length(); i++) {
			if(values.contains(input.charAt(i)-'0')) {
				return 0;
			} else {
				values.add(input.charAt(i)-'0');
			}
		}
		
		for(int i=0; i<input.length(); i++) {
			int product = input.charAt(i)-'0';
			for(int j=i+1; j<input.length(); j++) {
				product *= (input.charAt(j) - '0');
				if(values.contains(product)) {
					return 0;
				} else {
					values.add(product);
				}
			}
		}
		return 1;
	}
	
	public static void main(String[] args ) {
		ColorfulNumber cn = new ColorfulNumber();
		System.out.println(cn.colorful(1));
	}
}
