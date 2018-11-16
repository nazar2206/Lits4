package com.lits2;

import java.util.Arrays;
import java.util.List;

public class app {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Kate","Jake","Jone","Mike","Ann");
        List<String> list2 = Arrays.asList("Oleg","Taras","Roman","Oleg","Tommy","Petro");
//        list1.addAll(list2);????
        System.out.println("size: " + list1.size());
        System.out.println("first index: " + list2.indexOf("Oleg"));
        System.out.println("last index: " + list2.lastIndexOf("Oleg"));
        
    }
}
