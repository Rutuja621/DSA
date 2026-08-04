package org.collection.com;//collection.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;

public class CollectionInterfaceMethods {
    public static void main(String[] args) {

        // ==========================================
        //  INITIAL SETUP & BASIC OPERATIONS (1 TO 6)
        // ==========================================
        ArrayList al = new ArrayList();

        // 1. add(Object o)
        // Stores or adds each element as an object. Returns true if added.
        al.add(10);
        al.add("rutuja");
        al.add(12);
        System.out.println("Initial collection al: " + al); // [10, rutuja, 12]

        ArrayList al1 = new ArrayList();
        al1.add("rutuja");
        al1.add('c');
        al1.add(12);
        System.out.println("Initial collection al1: " + al1); // [rutuja, c, 12]

        // 2. size()
        // Returns the total count of elements present in the collection object
        System.out.println("Size of al1: " + al1.size()); // 3

        // 3. isEmpty()
        // Returns true if collection doesn't contain elements, returns false if it does
        System.out.println("Is al1 empty? " + al1.isEmpty()); // false

        // 4. contains(Object o)
        // Returns true if specific object is present in collection object, otherwise false
        System.out.println("Does al1 contain 12? " + al1.contains(12)); // true

        // 5. remove(Object o)
        // Removes the first occurrence of the specific element/object if it is present
        al1.remove("c");
        System.out.println("After removing 'c': " + al1); // [rutuja, 12]

        // 6. clear()
        // Removes all elements from the collection, turning it into an empty array format
        ArrayList temp = new ArrayList();
        temp.add("delete me");
        temp.clear();
        System.out.println("After clear(): " + temp); // []


        // ==========================================
        //       BULK OPERATIONS (7 TO 10)
        // ==========================================

        // 7. addAll(Collection c)
        // Adds all elements of the target collection into the current collection object
        ArrayList bulkList = new ArrayList();
        bulkList.add("newElement");
        al.addAll(bulkList);
        System.out.println("After addAll: " + al); // [10, rutuja, 12, newElement]

        // 8. containsAll(Collection c)
        // Returns true if the collection contains all items from the checked collection
        ArrayList checkList = new ArrayList();
        checkList.add("rutuja");
        checkList.add(12);
        System.out.println("Does al contain checkList? " + al.containsAll(checkList)); // true

        // 9. removeAll(Collection c)
        // It removes all the elements from the current collection that are present in the target collection
        al.removeAll(al1); // Removes "rutuja" and 12 from al
        System.out.println("After removeAll: " + al); // [10, newElement]

        // 10. retainAll(Collection c)
        // Opposite of removeAll. Keeps ONLY overlapping elements (Intersection)(keeps common elements from both) and deletes the rest.
        ArrayList keepList = new ArrayList();
        keepList.add(10);
        al.retainAll(keepList);
        System.out.println("After retainAll: " + al); // [10] (newElement is removed)


        // ==========================================
        //    ARRAY & ITERATOR CONVERSIONS (11 TO 13)
        // ==========================================

        // Re-filling al with simple items for next demonstrations
        al.clear();
        al.add("Java");
        al.add("Python");

        // 11. iterator()
        // Returns a sequential iterator tool to scan items step-by-step
        Iterator it = al.iterator();
        System.out.print("Iterator elements: ");
        while(it.hasNext()) {
            System.out.print(it.next() + " "); // Java Python
        }
        System.out.println();

        // 12. toArray()
        // Converts the dynamic collection into a fixed-size native Object array (Object[])
        Object[] objectArray = al.toArray();
        System.out.println("Object array conversion: " + Arrays.toString(objectArray));

        // 13. toArray(T[] a)
        // Converts the collection into an explicitly-typed array (like a String array)
        String[] stringArray = (String[]) al.toArray(new String[0]);
        System.out.println("String array conversion: " + Arrays.toString(stringArray));


        // ==========================================
        //    MODERN JAVA 8+ DATA STREAMS (14 TO 17)
        // ==========================================

        // 14. removeIf(Predicate filter)
        // Automatically drops items that meet a conditional rule (uses lambda expression syntax)
        al.removeIf(lang -> lang.equals("Python"));
        System.out.println("After removeIf: " + al); // [Java]

        // 15. stream()
        // Opens a sequential processing pipeline to transform or manipulate elements fluidly
        System.out.print("Stream pipeline processing: ");
        al.stream().forEach(lang -> System.out.print(lang + "Language ")); // JavaLanguage
        System.out.println();

        // 16. parallelStream()
        // Opens a multi-threaded parallel execution pipeline for massive backend collection scales
        System.out.print("Parallel stream processing: ");
        al.parallelStream().forEach(lang -> System.out.print(lang + " "));
        System.out.println();

        // 17. spliterator()
        // Generates a partition-capable structural iterator utilized for parsing data pieces inside parallel streams
        Spliterator split = al.spliterator();
        System.out.print("Spliterator processing: ");
        split.forEachRemaining(lang -> System.out.print(lang + " "));
        System.out.println();
    }
}
