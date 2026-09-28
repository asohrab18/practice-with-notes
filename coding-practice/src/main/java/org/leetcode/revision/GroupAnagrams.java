package org.leetcode.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Leetcode Problem: 49 */
public class GroupAnagrams {

	public static boolean isAnagram(String s, String t) {
		if (s == null || t == null || s.length() != t.length()) {
			return false;
		}
		Map<Character, Integer> frequencyMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
		}
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);

			if (!frequencyMap.containsKey(ch)) {
				return false;
			}

			frequencyMap.put(ch, frequencyMap.get(ch) - 1);

			if (frequencyMap.get(ch) == 0) {
				frequencyMap.remove(ch);
			}
		}

		return frequencyMap.isEmpty();
	}

	public List<List<String>> groupAnagrams(String[] strs) {

	    Map<String, List<String>> map = new HashMap<>();

	    for (String str : strs) {

	        char[] chars = str.toCharArray();
	        Arrays.sort(chars);

	        String key = new String(chars);

	        if (map.containsKey(key)) {
	            map.get(key).add(str);
	        } else {
	            List<String> list = new ArrayList<>();
	            list.add(str);
	            map.put(key, list);
	        }
	    }

	    return new ArrayList<>(map.values());
	}
	
	public static void main(String[] args) {
		String[] strs = { "eat","tea", "tan", "ate", "nat", "bat" };

		System.out.println("All Anagrams = " + new GroupAnagrams().groupAnagrams(strs));
	}
	
	public List<List<String>> groupAnagramsBKP(String[] strs) {
		List<List<String>> allAnagrams = new ArrayList<>();
		if (strs == null || strs.length == 0) {
			return allAnagrams;
		}

		List<String> inputs = new ArrayList<>();
		
		boolean allElementsAreEmpty = true;
		for (String str : strs) {
			if(!str.isEmpty()) {
				allElementsAreEmpty = false;
			}
			inputs.add(str);
		}
		
		if(allElementsAreEmpty) {
			allAnagrams.add(inputs);
		}

		while (!inputs.isEmpty()) {
			List<String> anagrams = new ArrayList<>();

			String s = inputs.get(0);
			anagrams.add(s);

			for (int i = 1; i < inputs.size(); i++) {
				String t = inputs.get(i);

				boolean anagram = isAnagram(s, t);
				if (anagram) {
					anagrams.add(t);
					inputs.remove(t);
				}
			}
			inputs.remove(s);
			allAnagrams.add(anagrams);
		}
		
		return allAnagrams;
	}
}
