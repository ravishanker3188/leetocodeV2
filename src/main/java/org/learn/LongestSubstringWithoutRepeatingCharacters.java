package org.learn;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the length of the longest
 * substring
 * without repeating characters.
 * Example 1:
 * <p>
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * <p>
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0, i = 0, j = 1;
        map.put(s.charAt(i), i);

        while (j < s.length()) {
            if (null == map.get(s.charAt(j))) {
                map.put(s.charAt(j), j);
                j++;
            } else {
                res = Math.max(res, j - i);
                map.put(s.charAt(i), null);
                i++;
            }
        }
        res = Math.max(res, j - i);
        return res;
    }
}
