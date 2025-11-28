// Check if two strings are anagrams.

import java.util.Arrays;

public class Q5_AnagramCheck {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        if (Arrays.equals(x, y)) {
            System.out.println("Strings are anagram");
        } else {
            System.out.println("not anagram");
        }
    }
}

/*
 * How It Works
 * 1. Length Check
 * 
 * If two strings have different lengths, they cannot be anagrams.
 * 
 * 2. Convert Strings to Character Arrays
 * 
 * We break the strings into individual characters:
 * 
 * listen → ['l','i','s','t','e','n']
 * silent → ['s','i','l','e','n','t']
 * 
 * 3. Sort Both Arrays
 * 
 * After sorting:
 * 
 * ['e','i','l','n','s','t']
 * ['e','i','l','n','s','t']
 * 
 * 4. Compare Arrays
 * 
 * If both sorted forms are identical → strings are anagrams.
 */