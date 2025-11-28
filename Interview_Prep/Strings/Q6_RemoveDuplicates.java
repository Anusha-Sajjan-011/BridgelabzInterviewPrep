// Remove all duplicates from a string.

// C:\Users\Lenovo\Desktop\Interview_Prep\Strings\Screenshot (2833).png

import java.util.HashSet;
import java.util.Set;

public class Q6_RemoveDuplicates {
    public static void main(String[] args) {
        String s = "programming";
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (!set.contains(c)) { // HashSet tells whether this character has appeared before.
                                    // HashSet decides whether StringBuilder should append or ignore the character.
                sb.append(c);
                set.add(c);

            }
        }
        System.out.println(sb.toString());
    }
}

/*
 * Objective
 * 
 * Remove duplicate
 * characters from
 * a string while
 * preserving the
 * order of
 * first appearance.
 * 
 * Key Components 1.
 * StringBuilder Used
 * to build the
 * final string efficiently.append(c)→
 * adds character
 * c to
 * the end.
 * Chosen because
 * Strings are immutable;
 * StringBuilder avoids
 * unnecessary object creation.
 * 
 * /////StringBuilder → Class
 * sb → Object
 * The object can grow or shrink as needed (resizable buffer).////
 * 
 * 2.
 * HashSet Stores
 * unique characters.set.add(c)→
 * adds character
 * to the set.set.contains(c)→checks if
 * character already
 * appeared.
 * Lookup is
 * 
 * O(1) on average, making the algorithm efficient.
 * 
 * 3.
 * 
 * Logical NOT (!)
 * !set.contains(c) means character not seen before.
 * Only new characters enter the result.
 * 
 * Program Flow
 * Convert string to character array.
 * For each character:
 * If the set does not contain it:
 * Append to StringBuilder
 * Add it to the set
 * Print the final string.
 * 
 * DryRun
 * Example (programming)
 * Char- Seen Before? -Action- Result
 * p -No- append- p
 * r -No- append- pr
 * o -No append pro
 * g No append prog
 * r Yes skip prog
 * a No append proga
 * m No append progam
 * m Yes skip progam
 * i No append progami
 * n No append progamin
 * g Yes skip progamin
 * 
 * 
 * 
 * 
 * // * about hashset
 * We use HashSet because it stores only unique characters and provides O(1)
 * lookup time. It allows the program to instantly check whether a character has
 * appeared before. This ensures duplicates are removed efficiently while
 * preserving the order of first occurrence.
 */