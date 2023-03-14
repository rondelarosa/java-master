package org.example;

import org.example.anno.AnnoStart;
import org.example.contract.ContractStart;
import org.example.datastructure.correct.CorrectStart;
import org.example.dp.openclosep.OpenClosePrincipleStart;
import org.example.oop.OOPStart;
import org.example.reflection.ReflectionStart;

public class Main {
    public static void main(String... args) {

        System.out.println("Hello world!");
//        AnnoStart.getEntries();
//        OOPStart.process();
//        CorrectStart.process();
//        ContractStart.process();
//        OpenClosePrincipleStart.process();
        ReflectionStart.process();
    }
}