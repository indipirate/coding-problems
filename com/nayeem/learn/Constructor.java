package com.nayeem.learn;

public class Constructor {

    static String string;

    Constructor() {
        System.out.println("Hello World");
        string = "Nayeem";
    }

    public static void main(String[] args) {
        Constructor c = new Constructor();
    }
}
