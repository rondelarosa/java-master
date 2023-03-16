package org.example.datatype;

import org.example.datatype.collection.Laptop;

import java.util.*;

public class HashCodeAndEqualsTest {
    public static void process() {
        Laptop l1 = new Laptop("dell", 2000);
        Laptop l2 = new Laptop("apple", 4000);

        Map<Laptop, String> map = new HashMap<>();
        map.put(l1, "1");
        map.put(l2, "1");

        System.out.println(String.format("Test 1 > Size: %d", map.size()));

        Map<Laptop, String> map2 = new HashMap<>();
        map2.put(l1, "1");
        map2.put(l1, "1");

        System.out.println(String.format("Test 2 > Size: %d", map2.size()));
    }
}
