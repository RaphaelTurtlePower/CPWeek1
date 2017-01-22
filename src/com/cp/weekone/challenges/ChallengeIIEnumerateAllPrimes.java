package com.cp.weekone.challenges;

import java.util.ArrayList;

public class ChallengeIIEnumerateAllPrimes {

	public int[] primes(int n) {
	
		if(n<=0) {
			int[] results = new int[1];
			results[0] = 0;
			return results;
		}
		if(n==1) {
			int[] results = new int[1];
			results[0] = 1;
			return results;
		}
		ArrayList<Integer> primes = new ArrayList<>();
		primes.add(1);
		boolean[] arr = new boolean[n+1];
		for(int i=2; i<arr.length; i++) {
			if(arr[i] == true) {
				continue;
			} else {
				primes.add(i);
			}
			for(int j=i; j<arr.length; j++) {
				if(j%i==0) {
					arr[j] = true;
				}
			}
		}
		
		int[] results = new int[primes.size()];
		for(int i=0; i<primes.size(); i++) {
			results[i] = primes.get(i);
		}
		return results;
	}
	
	public static void main(String[] args) {
		ChallengeIIEnumerateAllPrimes primes = new ChallengeIIEnumerateAllPrimes();
		int[] results = primes.primes(20);
		for(int i=0; i<results.length; i++) {
			System.out.println(results[i]);
		}
	}
}
