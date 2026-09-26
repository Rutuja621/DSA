package org.HashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {

    public static void main(String[] args) {

        /*
         ============================================================
                         WHAT IS HASHTABLE?
         ============================================================

         Hashtable is a legacy class in Java.

         It stores data in KEY-VALUE pairs.

         Example:

         101 -> Rahul
         102 -> Amit
         103 -> Priya


         Internal idea:

                 Key
                  |
                  v
              hashCode()
                  |
                  v
             hash value
                  |
                  v
             bucket index
                  |
                  v
             Entry stored


         Formula conceptually:

         index = hash(key) % table.length

         NOTE:
         The actual implementation uses additional hash processing
         and an index calculation, so this is a simplified explanation.


         IMPORTANT:
         - Hashtable does NOT allow null key.
         - Hashtable does NOT allow null value.
         - Hashtable is synchronized.
         - Hashtable does NOT guarantee insertion order.
         - It uses hashing internally.
         */


        // ============================================================
        // 1. CREATE HASHTABLE
        // ============================================================

        Hashtable<Integer, String> table =
                new Hashtable<>();


        // ============================================================
        // 2. put()
        // ============================================================

        /*
         put(key, value)

         Example:

         table.put(101, "Rahul");

         Internally:

         101
          |
          v
         hashCode()
          |
          v
         hash
          |
          v
         bucket index
          |
          v
         Entry(101, Rahul) stored
         */

        table.put(101, "Rahul");
        table.put(102, "Amit");
        table.put(103, "Priya");
        table.put(104, "Neha");

        System.out.println("After put():");
        System.out.println(table);


        // ============================================================
        // 3. PUT WITH DUPLICATE KEY
        // ============================================================

        /*
         If the key already exists, Hashtable replaces
         the old value.

         Before:

         102 -> Amit

         After:

         102 -> Kiran
         */

        table.put(102, "Kiran");

        System.out.println("\nAfter updating key 102:");
        System.out.println(table);


        // ============================================================
        // 4. get()
        // ============================================================

        /*
         get(key)

         Hashtable calculates the hash of the key,
         finds the bucket and searches for the key.

         Example:

         get(101)

         101
          |
          v
         hash
          |
          v
         bucket
          |
          v
         find key 101
          |
          v
         return "Rahul"
         */

        System.out.println("\nget():");
        System.out.println(
                "Student 101 = " + table.get(101)
        );


        // ============================================================
        // 5. getOrDefault()
        // ============================================================

        /*
         If key exists -> return its value.

         If key doesn't exist -> return default value.
         */

        System.out.println("\ngetOrDefault():");

        System.out.println(
                table.getOrDefault(101, "Not Found")
        );

        System.out.println(
                table.getOrDefault(999, "Not Found")
        );


        // ============================================================
        // 6. containsKey()
        // ============================================================

        /*
         Checks whether a particular key exists.
         */

        System.out.println("\ncontainsKey():");

        System.out.println(
                "101 exists = "
                        + table.containsKey(101)
        );

        System.out.println(
                "999 exists = "
                        + table.containsKey(999)
        );


        // ============================================================
        // 7. containsValue()
        // ============================================================

        /*
         Checks whether a particular value exists.
         */

        System.out.println("\ncontainsValue():");

        System.out.println(
                "Rahul exists = "
                        + table.containsValue("Rahul")
        );


        // ============================================================
        // 8. size()
        // ============================================================

        System.out.println("\nsize():");

        System.out.println(
                "Size = " + table.size()
        );


        // ============================================================
        // 9. isEmpty()
        // ============================================================

        System.out.println("\nisEmpty():");

        System.out.println(
                "Is empty = " + table.isEmpty()
        );


        // ============================================================
        // 10. keySet()
        // ============================================================

        /*
         keySet() returns all keys.
         */

        System.out.println("\nKeys:");

        for (Integer key : table.keySet()) {

            System.out.println(key);
        }


        // ============================================================
        // 11. values()
        // ============================================================

        /*
         values() returns all values.
         */

        System.out.println("\nValues:");

        for (String value : table.values()) {

            System.out.println(value);
        }


        // ============================================================
        // 12. entrySet()
        // ============================================================

        /*
         entrySet() returns complete key-value pairs.

         Map.Entry contains:

         getKey()
         getValue()
         */

        System.out.println("\nEntries:");

        for (Map.Entry<Integer, String> entry :
                table.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " = "
                            + entry.getValue()
            );
        }


        // ============================================================
        // 13. replace()
        // ============================================================

        /*
         replace(key, newValue)

         101 -> Rahul

         becomes:

         101 -> Rahul Updated
         */

        table.replace(101, "Rahul Updated");

        System.out.println("\nAfter replace():");
        System.out.println(table);


        // ============================================================
        // 14. replace(key, oldValue, newValue)
        // ============================================================

        /*
         This replaces only when the old value matches.

         Current:

         102 -> Kiran

         Therefore:

         replace(102, "Kiran", "Amit Updated")

         works.
         */

        table.replace(
                102,
                "Kiran",
                "Amit Updated"
        );

        System.out.println(
                "\nAfter replace(key, oldValue, newValue):"
        );

        System.out.println(table);


        // ============================================================
        // 15. replaceAll()
        // ============================================================

        /*
         replaceAll() applies a function to every value.

         Here we convert every name to uppercase.
         */

        table.replaceAll(
                (key, value) -> value.toUpperCase()
        );

        System.out.println("\nAfter replaceAll():");
        System.out.println(table);


        // ============================================================
        // 16. putIfAbsent()
        // ============================================================

        /*
         putIfAbsent() adds the entry ONLY when
         the key does not already exist.

         105 doesn't exist:

         105 -> Raj

         will be added.

         101 already exists:

         101 -> New Rahul

         will NOT replace the existing value.
         */

        table.putIfAbsent(105, "Raj");

        table.putIfAbsent(101, "New Rahul");

        System.out.println("\nAfter putIfAbsent():");
        System.out.println(table);


        // ============================================================
        // 17. remove(key)
        // ============================================================

        /*
         remove(key)

         Finds the key using hashing and removes
         the corresponding entry.
         */

        table.remove(105);

        System.out.println("\nAfter remove(key):");
        System.out.println(table);


        // ============================================================
        // 18. remove(key, value)
        // ============================================================

        /*
         Removes the entry ONLY when both key and value match.

         Example:

         104 -> NEHA

         If both match, entry is removed.
         */

        table.remove(104, "NEHA");

        System.out.println(
                "\nAfter remove(key, value):"
        );

        System.out.println(table);


        // ============================================================
        // 19. putAll()
        // ============================================================

        /*
         putAll() copies all entries from another Map.
         */

        Hashtable<Integer, String> secondTable =
                new Hashtable<>();

        secondTable.put(105, "Raj");
        secondTable.put(106, "Sneha");

        table.putAll(secondTable);

        System.out.println("\nAfter putAll():");
        System.out.println(table);


        // ============================================================
        // 20. forEach()
        // ============================================================

        /*
         forEach() is used to iterate over key-value pairs.
         */

        System.out.println("\nUsing forEach():");

        table.forEach(
                (key, value) ->
                        System.out.println(
                                key + " = " + value
                        )
        );


        // ============================================================
        // 21. clear()
        // ============================================================

        /*
         clear() removes all entries from Hashtable.
         */

        table.clear();

        System.out.println("\nAfter clear():");
        System.out.println(table);

        System.out.println(
                "Is empty = " + table.isEmpty()
        );
    }
}