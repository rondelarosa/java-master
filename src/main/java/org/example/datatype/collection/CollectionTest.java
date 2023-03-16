package org.example.datatype.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionTest {

    public static void process() {
        comparableInLaptop();
        comparatorInLaptop(ordComp);
        comparatorInLaptop(lambdaComp);
    }

    public static void comparableInLaptop() {
        System.out.println("Comparable");

        Laptop l1 = new Laptop("dell", 2000);
        Laptop l2 = new Laptop("apple", 4000);

        List<Laptop> laptops = new ArrayList<>(List.of(new Laptop[]{l1, l2}));

        Collections.sort(laptops);

        for(Laptop l: laptops)
            System.out.println(String.format("laptop brand: %s, price: %f", l.getBrand(), l.getPrice()));
    }

    public static Comparator<Laptop> ordComp = new Comparator<Laptop>() {
        @Override
        public int compare(Laptop o1, Laptop o2) {
            int result = 0;

            if(o1.getPrice() > o2.getPrice())
                result = 1;

            if(o1.getPrice() < o2.getPrice())
                result = -1;

            return result;
        }
    };

    public static Comparator<Laptop> lambdaComp = (o1, o2) -> {
        int result = 0;

        if(o1.getPrice() < o2.getPrice())
            result = -1;

        if(o1.getPrice() > o2.getPrice())
            result = 1;

        return result;
    };

    public static void  comparatorInLaptop(java.util.Comparator<? super Laptop> c) {
        System.out.println("Comparator");

        Laptop l1 = new Laptop("dell", 2000);
        Laptop l2 = new Laptop("apple", 1000);

        List<Laptop> laptops = new ArrayList<>(List.of(new Laptop[]{l1, l2}));

        Collections.sort(laptops, c);

        for(Laptop l: laptops)
            System.out.println(String.format("laptop brand: %s, price: %f", l.getBrand(), l.getPrice()));
    }
}
