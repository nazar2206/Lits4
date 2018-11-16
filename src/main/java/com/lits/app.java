package com.lits;


public class app {
    public static void main(String[] args) {
        Wind wind = new Wind("X");
        Linux lin = new Linux("Ubuntu");
        Mac mac = new Mac("IOS");
        Computer<Wind> windcomp = new Computer<Wind>("wcomp", 64, wind);
        Computer<Linux> lincomp = new Computer<Linux>("lcomp",32,lin);
        Computer<Mac> maccomp = new Computer<Mac>("mcomp",16,mac);
        System.out.println(windcomp.getOs().getName());
        System.out.println(lincomp.getOs().getName());
        System.out.println(maccomp.getOs().getName());
    }
}
