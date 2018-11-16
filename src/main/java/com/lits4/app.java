package com.lits4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class app {
    public static void main(String[] args) {
        List<Integer> integ = new ArrayList<Integer>();
        for(int i = 1; i<=100;i++)
        integ.add(i);
        int counter = 0;
        for(Integer i : integ){
            if(i%3==0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
