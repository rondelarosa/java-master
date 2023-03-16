package org.example.datatype;

import java.util.StringJoiner;

public class StringTest {

    public static void process() {
        stringJoinerTest();
    }

    public static void stringJoinerTest() {
        // only if add not called
        StringJoiner sj1 = new StringJoiner(", ");
        String sj1Result = sj1.toString();
        System.out.println(String.format("result 1: %s", sj1Result));;

        // only if add not called
        StringJoiner sj2 = new StringJoiner(", ", "{","}");
        String sj2Result = sj2.toString();
        System.out.println(String.format("result 2: %s", sj2Result));

        // only if add not called
        StringJoiner sj3 = new StringJoiner(", ");
        sj3.setEmptyValue("EMPTY");
        String sj3Result = sj3.toString();
        System.out.println(String.format("result 3: %s", sj3Result));

        // only if add not called
        StringJoiner sj4 = new StringJoiner(", ", "{","}");
        sj4.setEmptyValue("EMPTY");
        String sj4Result = sj4.toString();
        System.out.println(String.format("result 4: %s", sj4Result));

        // add called, set empty ignored
        StringJoiner sj5 = new StringJoiner(", ", "{","}");
        sj5.setEmptyValue("EMPTY");
        sj5.add("");
        String sj5Result = sj5.toString();
        System.out.println(String.format("result 5: %s", sj5Result));
    }
}
