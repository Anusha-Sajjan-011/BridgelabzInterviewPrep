// Find the first non-repeating character in a string.

import java.util.LinkedHashMap;
import java.util.Map;

public class Q3_FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "swiss";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("none");
    }
}

/*
 * 2. Iteration Trace for "swiss"
 * 
 * Initial State:
 * map = {} (empty)
 * 
 * We process characters one by one:
 * 
 * Iteration 1: c = 's'
 * 
 * map.getOrDefault('s', 0) → returns 0
 * 
 * New count = 0 + 1 = 1
 * 
 * map.put('s', 1)
 * 
 * map → { s=1 }
 * 
 * Iteration 2: c = 'w'
 * 
 * map.getOrDefault('w', 0) → 0
 * 
 * New count = 1
 * 
 * map.put('w', 1)
 * 
 * map → { s=1, w=1 }
 * 
 * Iteration 3: c = 'i'
 * 
 * map.getOrDefault('i', 0) → 0
 * 
 * New count = 1
 * 
 * map.put('i', 1)
 * 
 * map → { s=1, w=1, i=1 }
 * 
 * Iteration 4: c = 's'
 * 
 * map.getOrDefault('s', 1) → 1
 * 
 * New count = 1 + 1 = 2
 * 
 * map.put('s', 2)
 * 
 * map → { s=2, w=1, i=1 }
 * 
 * Iteration 5: c = 's'
 * 
 * map.getOrDefault('s', 2) → 2
 * 
 * New count = 3
 * 
 * map.put('s', 3)
 * 
 * map → { s=3, w=1, i=1 }
 * 
 * Final Map Content (preserving insertion order)
 * s → 3
 * w → 1
 * i → 1
 * 
 * 
 * This is why the next loop identifies 'w' as the first non-repeating
 * character.
 */

// ---------------------------------------------------------------------------------------------------------------------------------

/*
 * LinkedHashMap:
 * ➢ LinkedHashMap is a map based collection which is used to store entries ,
 * and it is a
 * implementation class of Map interface.
 * ➢ Present since JDK 1.4.
 * ➢ LinkedHashMap is hash based , Hence the internal data structure is
 * HashTable.
 * ➢ Initial capacity of LinkedHashMap is 16.
 * ➢ Fill ratio or load factor is 75%
 * ➢ LinkedHashMap maintains insertion order.
 * ➢ LinkedHashMap can store single null key.
 * ➢ LinkedHashMap can store heterogeneous data .
 * ➢ It has 4 overloaded constructors.
 * public LinkedHashMap()
 * public LinkedHashMap(int initialCapacity)
 * public LinkedHashMap(Map<? extends K, ? extends V> m)
 * public LinkedHashMap(int initialCapacity, float loadFactor)
 * import java.util.*;
 * import java.util.Map.Entry;
 * public class Product {
 * public static void main(String[] args)
 * Map<Integer,String>indmap=new LinkedHashMap<Integer,
 * String>();
 * indmap.put(171, "Dohni");
 * indmap.put(82, "Virat");
 * indmap.put(10, "Rohit");
 * System.out.println("Iterating Map using entrySet()");
 * Set<Entry<Integer,String>> set=indmap.entrySet();
 * for(Entry<Integer,String> entry:set) {
 * System.out.println(entry);
 * }
 * }
 * Output:
 * Iterating Map using entrySet()
 * 171=Dohni
 * 82=Virat
 * 10=Rohit
 */