package org.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P438_Find_All_Anagrams {

	public List<Integer> findAnagrams(String s, String p) {

		List<Integer> indices = new ArrayList<>();

		if (s == null || p == null) {
			return indices;
		}

		int l = s.length();
		int m = p.length();

		if (l == 0 || m == 0) {
			return indices;
		}
		s = s.toLowerCase();
		p = p.toLowerCase();

		char[] pCharArray = p.toCharArray();
		Arrays.sort(pCharArray);

		String pSortedString = new String(pCharArray);

		for (int i = 0; i <= l - m; i++) {
			String sub = s.substring(i, i + m);

			char[] subCharArray = sub.toCharArray();
			Arrays.sort(subCharArray);

			String subSortedString = new String(subCharArray);

			if (pSortedString.equals(subSortedString)) {
				indices.add(i);
			}
		}

		return indices;
	}

	public static void main(String[] args) {
		P438_Find_All_Anagrams obj = new P438_Find_All_Anagrams();
		String s = "cbaebabacd", p = "abc";
		List<Integer> indices = obj.findAnagrams(s, p);
		System.out.println(indices);
	}

}
