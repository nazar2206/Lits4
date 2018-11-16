package com.lits_3;

import java.util.ArrayList;
import java.util.List;

public class app {
    public static void main(String[] args) {
        List<Integer> integ = new ArrayList<Integer>();
        for(int i = 1; i<=100;i++)
            integ.add(i);
        for(Integer i : integ){
            if(i%2==0)
                System.out.println(i);
        }
    }
}
