package com.cp.weekthree.prework.binarysearch;

public class SquareRootOfAnInteger {
	
	public int sqrt(int a) {
		long start = 0;
		long end = a/2 + 1;
		long result = a;
		while(start <= end) {
			long mid = start + (end - start) / 2;
			long val = mid*mid;
			if(val == result) {
				return (int)mid;
			} else if(val < result) {
				start = mid+1;
			} else {
				end = mid-1;
			}
		}
		
		return (int)end;
		}
	
	public static void main(String[] args) {
		SquareRootOfAnInteger s= new SquareRootOfAnInteger();
		System.out.println(s.sqrt(2));
	}
}
