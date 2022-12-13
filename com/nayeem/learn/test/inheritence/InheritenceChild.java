package com.nayeem.learn.test.inheritence;

import com.nayeem.learn.inheritence.Inheritence;

public class InheritenceChild extends Inheritence {
    public static void main(String[] args) {
        System.out.println(Inheritence.pubStatic);
//        System.out.println(Inheritence.privStatic);
//        Compilation error : java: privStatic has private access in com.nayeem.learn.inheritence.Inheritence

        Inheritence inh = new Inheritence();
        Inheritence inc = new InheritenceChild();

        inh.printOther();
        inh.middleName = "Mahesh";
//        inh.name;
//        Compilation error : 'name' has private access in 'com.nayeem.learn.inheritence.Inheritence'

        System.out.println(inc.middleName);
        inc.printOther();

    }

    @Override
    public void printOther() {
        System.out.println("Iam Printing shahrukh" + Inheritence.pubStatic);
    }
}
