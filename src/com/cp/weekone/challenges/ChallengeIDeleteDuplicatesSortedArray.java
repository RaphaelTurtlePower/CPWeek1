package com.cp.weekone.challenges;

public class ChallengeIDeleteDuplicatesSortedArray {

	public int deleteDuplicates(int[] arr) {
		if(arr==null ||arr.length < 1) {
			return 0;
		}
		int index = 1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				arr[index] = arr[i];
				index++;
			}
		}
		return index;
	}
}
