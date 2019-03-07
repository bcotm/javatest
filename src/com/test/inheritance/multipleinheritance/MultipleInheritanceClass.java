package com.test.inheritance.multipleinheritance;

public class MultipleInheritanceClass implements IOneInterface, ITwoInterface{
    @Override
    public void methodFromOne() {
        System.out.println("method derived from interface must be implemented or the class should be abstract.");
    }

    @Override
    public void methodFromTwo() {

    }

    public static  void main(String[] args){
        MultipleInheritanceClass multipleInheritanceClass = new MultipleInheritanceClass();
        multipleInheritanceClass.methodFromOne();
    }
}
