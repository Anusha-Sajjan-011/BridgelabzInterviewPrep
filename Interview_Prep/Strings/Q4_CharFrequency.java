// Count occurrences of each character.

import java.util.HashMap;
import java.util.Map;

public class Q4_CharFrequency {
    public static void main(String[] args) {
        String s = "anusha";

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        System.out.println(map);
    }
}
/*
 * When you process the first character 's'
 * 
 * The system checks:
 * 
 * map.get('s') // does 's' exist in the map?
 * 
 * 
 * Since 's' is not found, map.get() would normally return null.
 * 
 * But you are using getOrDefault(c, 0) instead.
 * 
 * So the logic becomes:
 * 
 * Is 's' present? → No
 * 
 * Then return 0 (your default value).
 * 
 * Why 0?
 * 
 * Because you gave 0 as the default:
 * 
 * map.getOrDefault(c, 0)
 * 
 * 
 * That second parameter (0) tells Java:
 * 
 * “If the key doesn’t exist, don’t give me null — give me 0.”
 * 
 * This is intentional because we want the frequency count to start from 0 and
 * increase from there.
 */

// ------------------------------------------------------------------------------------------------------------------------------------------------

/*
 * HashMap:
 * ➢ HashMap is a map based collection which is used to store entries , and it
 * is a
 * implementation class of Map interface.
 * ➢ Present since JDK 1.2.
 * ➢ HashMap is hash based , Hence the internal data structure is Hashtable.
 * ➢ Initial capacity of HashMap is 16.
 * ➢ Fill ratio or load factor is 75%
 * ➢ HashMap can store single null key.
 * ➢ HashMap can store heterogeneous data and does not maintain any insertion
 * order.
 * ➢ It has 4 overloaded constructors.
 * public HashMap()
 * public HashMap(int initialCapacity)
 * public HashMap(Map<? extends K, ? extends V> m)
 * public HashMap(int initialCapacity, float loadFactor)
 * import java.util.*;
 * import java.util.Map.Entry;
 * public class Product {
 * public static void main(String[] args) {
 * Map<Integer,String> indmap = new HashMap<Integer, String>();
 * indmap.put(171, "Dohni");
 * indmap.put(82, "Virat");
 * indmap.put(10, "Rohit");
 * System.out.println("Iterating Map using entrySet()");
 * Set<Entry<Integer,String>> set=indmap.entrySet();
 * for(Entry<Integer,String> entry:set) {
 * System.out.println(entry);
 * }
 * Output:
 * Iterating Map using entrySet()
 * 82=Virat
 * 10=Rohit
 * 171=Dohni
 */