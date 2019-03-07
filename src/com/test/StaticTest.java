package com.test;

public class StaticTest {
    private static int number = 1; // if not defined, default value;
    static {
        System.out.println("This is a static blcock which is being executed during class loading.");
    }
    public static class InnerStaticClass {
        public static void whatMethod(){
            System.out.println("InnerStaticClass.whatMethod has been called.");
        }
    }
    public static interface InnerStaticInterface {
        public void IT();
        public static void ITS(){
        	
        };
    }
    public static void main(String[] args){
        System.out.println("This is static method main.");
        InnerStaticClass.whatMethod();
    }
}