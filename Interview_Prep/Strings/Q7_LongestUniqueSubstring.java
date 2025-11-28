//  Find the longest substring without repeating characters.

// Screenshot (2834).png

import java.util.*;

public class Q7_LongestUniqueSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        Set<Character> set = new HashSet<>();
        int left = 0, max = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        System.out.println(max);
    }
}
// ------------------------------------------------------------------------------------------------------------------------
/*
 * Formula: right - left + 1 (Sliding Window Length)
 * This formula
 * calculates the
 * current window
 * 
 * size (i.e., the length of the substring without repeating characters).
 * right → end index of the window
 * left → start index of the window
 * +1 → makes the count inclusive.
 * Short Meaning
 * Current substring length = end - start + 1
 * 
 * Example:
 * If left = 2 and right = 5 → length = 5 − 2 + 1 = 4.
 * 
 * If previously max = 3
 * Current window size = 4
 * 
 * Then:
 * 
 * max = Math.max(3, 4) → 4
 * 
 * 
 * If the current window size is smaller, max stays unchanged.
 */

// ------------------------------------------------------------------------------------------------------------------------------------------------

/*
 * Longest Unique Substring (Sliding Window Approach)
 * 1. Problem Statement
 * 
 * Given a string, find the length of the longest substring without repeating
 * characters.
 * 
 * Example input:
 * 
 * abcabcbb
 * 
 * 
 * Output:
 * 
 * 3 (substring: "abc")
 * 
 * 2. Core Concept: Sliding Window
 * 
 * A sliding window is a technique where you maintain a window (continuous
 * segment) of the string using two pointers:
 * left pointer → start of the window
 * right pointer → end of the window
 * The window expands when new unique characters are found and shrinks when a
 * duplicate appears.
 * 
 * You move the window forward without re-checking characters unnecessarily,
 * giving an efficient O(n) solution.
 * 
 * 3. Key Data Structure Used
 * HashSet<Character> set
 * Stores characters currently inside the sliding window.
 * Ensures all characters in the window are unique.
 * Supports:
 * contains() – check if duplicate exists
 * add() – include new character
 * remove() – remove character from the left side
 * 
 * 4. Pointer Definitions
 * right pointer
 * Moves forward one step at a time (0 → length-1)
 * Represents the current character we want to include in the window
 * left pointer
 * Moves forward only when a duplicate is found
 * Helps remove characters from the window
 * 
 * 5. Algorithm Logic (Step-by-Step)
 * Loop: for (int right = 0; right < s.length(); right++)
 * 
 * right extends the window by including s.charAt(right).
 * 
 * If duplicate found
 * while (set.contains(s.charAt(right))) {
 * set.remove(s.charAt(left));
 * left++;
 * }
 * 
 * 
 * This means:
 * The current character at right is already in the window.
 * Remove characters from the left side until the duplicate is removed.
 * left++ shrinks the window from the left.
 * Add the new character
 * set.add(s.charAt(right));
 * 
 * Update maximum length
 * max = Math.max(max, right - left + 1);
 * Current window length = right - left + 1
 * Compare it with previous max and store the larger one.
 * 
 * 6. Full Dry Run for “abcabcbb”
 * Step Right Char Contains? Action Window (left → right) Max
 * 0 - a - No - Add - a - a - 1
 * 1 b No Add b ab 2
 * 2 c No Add c abc 3
 * 3 a Yes Remove left chars until 'a' removed bc + a → bca 3
 * 4 b Yes Remove left → remove b ca + b → cab 3
 * 5 c Yes Remove left → remove c ab + c → abc 3
 * 6 b Yes Remove left → remove a, b → get “c” cb 3
 * 7 b Yes Remove c → left becomes at last b b 3
 * 
 * Final max length = 3
 * 
 * 7. Why Sliding Window Works
 * You never move left pointer backward.
 * You never re-check characters unnecessarily.
 * You always maintain a window that contains only unique characters.
 * Time complexity = O(n) (each char visited max twice)
 * 
 * 8. Why We Use HashSet
 * Fast lookups: check duplicate in O(1)
 * Stores only unique characters
 * Helps ensure the current window remains valid (no duplicate characters)
 * 
 * 9. Important Notes
 * right moves only forward → expands window
 * left moves forward only when duplicates appear → shrinks window
 * right - left + 1 gives the size of the current valid window
 * max stores the best window size seen so far
 * 
 * 10. Final Answer for the Input
 * String: "abcabcbb"
 * Longest substring without repeating characters: "abc"
 */