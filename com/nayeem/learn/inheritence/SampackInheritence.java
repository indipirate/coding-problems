package com.nayeem.learn.inheritence;

public class SampackInheritence extends Inheritence {

    public static void main(String[] args) {

        Inheritence inh = new Inheritence();
        System.out.println("Accessing protected family member from same class instance" + inh.family);
        Inheritence inc = new SampackInheritence();
        System.out.println("Accessing protected family member from sub class instance"+inc.family);

    }

    @Override
    public void printOther() {
        System.out.println("Iam printing Reniman");
    }
}
