package com.test.inheritance.singleinheritance;

public class DerivedClass extends BaseClass{
    DerivedClass(){
        System.out.println("construct DerivedClass.");
    }

    public static void main(String[] args){
        DerivedClass derivedClass = new DerivedClass();
    }
}
