package com.lits;

public abstract class  OS {
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public OS(String name) {
        this.name = name;
    }

    private String name;
}
