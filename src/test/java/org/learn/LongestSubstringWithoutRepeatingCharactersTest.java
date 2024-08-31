package org.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void lengthOfLongestSubstring1() {
        String s = "abcabcbb";
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        int res = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(res, 3);
    }

    @Test
    void lengthOfLongestSubstring2() {
        String s = "bbbbb";
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        int res = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(res, 1);
    }

    @Test
    void lengthOfLongestSubstring3() {
        String s = "pwwkew";
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        int res = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(res, 3);
    }

    @Test
    void lengthOfLongestSubstring4() {
        String s = "gaaqfeqlqky";
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        int res = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(res, 4);
    }
}