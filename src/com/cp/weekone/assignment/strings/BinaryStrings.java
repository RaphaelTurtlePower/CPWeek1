package com.cp.weekone.assignment.strings;

import java.util.HashMap;
import java.util.Map;

public class BinaryStrings {
	public String addBinary(String a, String b) {
		if(a==null && b == null) {
			return a;
		}
		if(a==null || a.length() < 1) {
			return b;
		} else if (b == null || b.length() < 1) {
			return a;
		}
		
		int aEnd = a.length()-1;
		int bEnd = b.length()-1;
		Map<Character,Integer> digitMap;
		char carry = '0';
		StringBuilder sb = new StringBuilder();
		while(aEnd >=0 && bEnd >=0) {
			digitMap = new HashMap<>();
			addToMap(digitMap, a.charAt(aEnd) );
			addToMap(digitMap, b.charAt(bEnd) );
			addToMap(digitMap, carry);
			Character remainder = getRemainder(digitMap);
			carry = getCarry(digitMap);
			sb.append(remainder);
			aEnd--;
			bEnd--;
		}
			while(aEnd >= 0) {
				digitMap = new HashMap<>();
				addToMap(digitMap,a.charAt(aEnd) );
				addToMap(digitMap, carry);
				Character remainder = getRemainder(digitMap);
				carry = getCarry(digitMap);
				sb.append(remainder);
				aEnd--;
			}
			while(bEnd >= 0) {
				digitMap = new HashMap<>();
				addToMap(digitMap, b.charAt(bEnd) );
				addToMap(digitMap, carry);
				Character remainder = getRemainder(digitMap);
				carry = getCarry(digitMap);
				sb.append(remainder);
				bEnd--;
			}
		if(carry == '1') {
			sb.append('1');
		}
		return sb.reverse().toString();
	}
	
	public void addToMap(Map<Character,Integer> mp, char c) {
		if(mp.containsKey(c)) {
			int val = mp.get(c) + 1;
			mp.put(c, val);
		} else {
			mp.put(c, 1);
		}
	}
	
	public Character getCarry(Map<Character, Integer> digitMap) {
		if(digitMap.containsKey('1') && digitMap.get('1') >= 2) {
			return '1';
		} else {
			return '0';
		}
	}
	
	public Character getRemainder(Map<Character, Integer> digitMap) {
		if(digitMap.containsKey('1') && digitMap.get('1') % 2 == 1) {
			return '1';
		} else {
			return '0';
		}
	}
	
	public static void main(String[] args) {
		BinaryStrings s = new BinaryStrings();
		System.out.println(s.addBinary("11", "1"));
	}
}
