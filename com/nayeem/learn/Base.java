package com.nayeem.learn;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Base {

    // Static method in base class which will be hidden in subclass
    public static void display() {
        System.out.println("Static or class method from Base");
    }

    public static void printCharCount() {
        String S = "Nayeem";
        Map<String, Long> r = Arrays.stream(S.split(""))
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
        System.out.println(r);
    }

    public static void main(String[] args) {
        printCharCount();
    }

    // Non-static method which will be overridden in derived class
    public void print() {
        System.out.println("Non-static or Instance method from Base");
    }
}

// Subclass
class Derived extends Base {

    // Static is removed here (Causes Compiler Error)
//    public void display() {
//        System.out.println("Non-static method from Derived");
//    }

    // Static is added here (Causes Compiler Error)
//    public static void print() {
//        System.out.println("Static method from Derived");
//    }
}
