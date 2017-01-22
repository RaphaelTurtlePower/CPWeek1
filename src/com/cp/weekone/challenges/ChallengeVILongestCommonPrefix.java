package com.cp.weekone.challenges;

public class ChallengeVILongestCommonPrefix {
	   /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
  public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length < 1) {
        	return "";
        }
        String minimumString = strs[0];
        for(int i=1; i<strs.length; i++) {
        	String test = strs[i];
        	while(!test.startsWith(minimumString) && minimumString.length() > 0) {
        		minimumString = minimumString.substring(0, minimumString.length()-1);
        		if(minimumString.isEmpty()) {
        			return "";
        		}
        	}
        }
        return minimumString;
    }
}
