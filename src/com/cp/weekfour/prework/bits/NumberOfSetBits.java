package com.cp.weekfour.prework.bits;

public class NumberOfSetBits {
	 public int numSetBits(long n) {
			int result = 0;
			for(int i=1; i<33; i++) {
				boolean isSet = (n & (1 << i)) != 0;
				if(isSet) {
					result++;
				}
			}
			
			return result;
		}
}
