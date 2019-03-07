package com.test.polymorphism;

public class DerivedClass extends BaseClass{
    @Override
    public void toBeOverrided() {
        super.toBeOverrided();
        System.out.println("Dynamic Polymorphism.");
    }

    public void toBeOverwrite(String paraOne, float paraTwo){
        System.out.println("Static Polymorphism.");
    }

    public void toBeOverwrite(float paraOne, String paraTwo){
       System.out.println("Different sequence of parameters.");
    }

    public void toBeOverwrite(String paraOne, float paraTwo, int paraThree){
        System.out.println("Different number of parameters.");
    }

    public static void main(String[] args){
        DerivedClass derivedClass = new DerivedClass();
        derivedClass.toBeOverrided();
        derivedClass.toBeOverwrite("", 0);
        derivedClass.toBeOverwrite(0, "");
        derivedClass.toBeOverwrite("", 0, 0);
    }
}
