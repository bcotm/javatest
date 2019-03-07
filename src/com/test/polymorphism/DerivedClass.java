package com.test.polymorphism;

public class DerivedClass extends BaseClass{
    @Override
    public void toBeOverrided() {
        super.toBeOverrided();
        System.out.println("Dynamic Polymorphism.");
    }

    public void toBeOverloaded(String paraOne, float paraTwo){
        System.out.println("Static Polymorphism.");
    }

    public void toBeOverloaded(float paraOne, String paraTwo){
       System.out.println("Different sequence of parameters.");
    }

    public void toBeOverloaded(String paraOne, float paraTwo, int paraThree){
        System.out.println("Different number of parameters.");
    }

    public static void main(String[] args){
        BaseClass baseClass = new DerivedClass();
        baseClass.toBeOverrided();
        DerivedClass derivedClass = new DerivedClass();
        derivedClass.toBeOverrided();
        derivedClass.toBeOverloaded("", 0);
        derivedClass.toBeOverloaded(0, "");
        derivedClass.toBeOverloaded("", 0, 0);
    }
}
