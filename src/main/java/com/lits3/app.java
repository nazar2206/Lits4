package com.lits3;

import java.util.Arrays;
import java.util.List;

public class app{
    public static void main(String[] args) {
        List<String> someList = Arrays.asList("Dog","cat","elephant","cow");
        for(String item : someList){
            System.out.println(item);
        }
    }
}
