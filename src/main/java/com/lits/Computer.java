package com.lits;

public class Computer<T> {
    private String name;
    private int HardDriveSpace;
    private T os;

    public void setOs(T os) {
        this.os = os;
    }

    public void setHardDriveSpace(int hardDriveSpace) {
        HardDriveSpace = hardDriveSpace;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getOs() {
        return os;
    }

    public int getHardDriveSpace() {
        return HardDriveSpace;
    }

    public String getName() {
        return name;
    }

    public Computer(String name, int hardDriveSpace, T os) {
        this.name = name;
        HardDriveSpace = hardDriveSpace;
        this.os = os;
    }
}
