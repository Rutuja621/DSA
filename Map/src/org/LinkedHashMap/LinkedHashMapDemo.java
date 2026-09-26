package org.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        // Creating LinkedHashMap
        LinkedHashMap<Integer, String> map =
                new LinkedHashMap<>();


        // =====================================================
        // 1. put()
        // =====================================================

        map.put(101, "Rahul");
        map.put(102, "Amit");
        map.put(103, "Priya");
        map.put(104, "Neha");

        System.out.println("After put():");
        System.out.println(map);


        // =====================================================
        // 2. put() with duplicate key
        // =====================================================

        map.put(102, "Kiran");

        System.out.println("\nAfter updating key 102:");
        System.out.println(map);


        // =====================================================
        // 3. get()
        // =====================================================

        System.out.println("\nget():");
        System.out.println("Student 101 = " + map.get(101));


        // =====================================================
        // 4. getOrDefault()
        // =====================================================

        System.out.println("\ngetOrDefault():");

        System.out.println(
                "Student 103 = "
                        + map.getOrDefault(103, "Not Found")
        );

        System.out.println(
                "Student 999 = "
                        + map.getOrDefault(999, "Not Found")
        );


        // =====================================================
        // 5. containsKey()
        // =====================================================

        System.out.println("\ncontainsKey():");

        System.out.println(
                "Key 101 exists = "
                        + map.containsKey(101)
        );

        System.out.println(
                "Key 999 exists = "
                        + map.containsKey(999)
        );


        // =====================================================
        // 6. containsValue()
        // =====================================================

        System.out.println("\ncontainsValue():");

        System.out.println(
                "Rahul exists = "
                        + map.containsValue("Rahul")
        );

        System.out.println(
                "Rohan exists = "
                        + map.containsValue("Rohan")
        );


        // =====================================================
        // 7. size()
        // =====================================================

        System.out.println("\nsize():");
        System.out.println("Size = " + map.size());


        // =====================================================
        // 8. isEmpty()
        // =====================================================

        System.out.println("\nisEmpty():");
        System.out.println(
                "Is map empty = " + map.isEmpty()
        );


        // =====================================================
        // 9. keySet()
        // =====================================================

        System.out.println("\nkeySet():");

        for (Integer key : map.keySet()) {

            System.out.println(key);
        }


        // =====================================================
        // 10. values()
        // =====================================================

        System.out.println("\nvalues():");

        for (String value : map.values()) {

            System.out.println(value);
        }


        // =====================================================
        // 11. entrySet()
        // =====================================================

        System.out.println("\nentrySet():");

        for (Map.Entry<Integer, String> entry :
                map.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " = "
                            + entry.getValue()
            );
        }


        // =====================================================
        // 12. replace()
        // =====================================================

        map.replace(101, "Rahul Updated");

        System.out.println("\nAfter replace():");
        System.out.println(map);


        // =====================================================
        // 13. replace(key, oldValue, newValue)
        // =====================================================

        map.replace(
                102,
                "Kiran",
                "Amit Updated"
        );

        System.out.println(
                "\nAfter replace(key, oldValue, newValue):"
        );

        System.out.println(map);


        // =====================================================
        // 14. replaceAll()
        // =====================================================

        map.replaceAll(
                (key, value) -> value.toUpperCase()
        );

        System.out.println("\nAfter replaceAll():");
        System.out.println(map);


        // =====================================================
        // 15. putIfAbsent()
        // =====================================================

        map.putIfAbsent(105, "Raj");

        // Key 101 already exists,
        // so Rahul Updated will NOT be replaced.

        map.putIfAbsent(101, "New Rahul");

        System.out.println("\nAfter putIfAbsent():");
        System.out.println(map);


        // =====================================================
        // 16. remove(key)
        // =====================================================

        map.remove(105);

        System.out.println("\nAfter remove(key):");
        System.out.println(map);


        // =====================================================
        // 17. remove(key, value)
        // =====================================================

        map.remove(104, "NEHA");

        System.out.println(
                "\nAfter remove(key, value):"
        );

        System.out.println(map);


        // =====================================================
        // 18. putAll()
        // =====================================================

        LinkedHashMap<Integer, String> secondMap =
                new LinkedHashMap<>();

        secondMap.put(105, "Raj");
        secondMap.put(106, "Sneha");

        map.putAll(secondMap);

        System.out.println("\nAfter putAll():");
        System.out.println(map);


        // =====================================================
        // 19. forEach()
        // =====================================================

        System.out.println("\nUsing forEach():");

        map.forEach(
                (key, value) ->
                        System.out.println(
                                key + " = " + value
                        )
        );


        // =====================================================
        // 20. clear()
        // =====================================================

        map.clear();

        System.out.println("\nAfter clear():");
        System.out.println(map);

        System.out.println(
                "Is map empty = " + map.isEmpty()
        );
    }
}