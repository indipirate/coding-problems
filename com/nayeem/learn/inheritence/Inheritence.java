package com.nayeem.learn.inheritence;

public class Inheritence {

    public static String pubStatic = "IAM PUBLIC STATIC";
    private static String privStatic = "IAM PRIVATE STATIC";
    public String middleName;
    private String name;
    protected String family;

    public static void main(String[] args) {
        System.out.println(pubStatic);
        System.out.println(privStatic);
    }

    private void printMe() {
        System.out.println("Iam printing Nayeem");
    }

    public void printOther() {
        System.out.println("Iam printing Ahmed");
    }

//    public void foo() { // Compiler Error: cannot redefine foo()
//        System.out.println("Test.foo(int) called ");
//    }
//
//    public static void foo() {
//        System.out.println("Test.foo() called ");
//    }

}

