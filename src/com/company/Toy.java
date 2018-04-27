package com.company;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

public class Toy extends Good {
    public Toy(String name, int price) {
        super(name, price);
    }


    @Override
    public String toString() {
        return "Toy " + name+ "\n Price " + price;
    }
}
