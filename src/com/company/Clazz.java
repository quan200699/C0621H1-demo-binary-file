package com.company;

import java.io.Serializable;

public class Clazz implements Serializable {
    private String id;

    private String name;

    public Clazz(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
