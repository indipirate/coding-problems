package com.nayeem.learn;

public class StringExperiments {

    public static void main(String[] args) {
        String mango = "mango";
        String mango2 = "mango";
        String mango3 = new String("mango");
        System.out.println(mango != mango2);
        System.out.println(mango == mango2);
        System.out.println(mango3 != mango2);
        System.out.println(mango3 == mango2);
         mango2 = "mang";
        System.out.println(mango + " " + mango2);
        System.out.println(mango != mango2);
        System.out.println(mango == mango2);

        System.out.println(System.identityHashCode(mango));
        System.out.println(System.identityHashCode(mango2));
        System.out.println(System.identityHashCode(mango3));
    }
}
