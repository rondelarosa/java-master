package org.example;

import org.example.anno.AnnoStart;
import org.example.contract.ContractStart;
import org.example.datastructure.correct.CorrectStart;
import org.example.oop.OOPStart;

public class Main {
    public static void main(String... args) {

        System.out.println("Hello world!");
//        AnnoStart.getEntries();
//        OOPStart.process();
//        CorrectStart.process();
        ContractStart.process();
    }
}