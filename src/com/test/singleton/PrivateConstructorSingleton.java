package com.test.singleton;

public class PrivateConstructorSingleton {
    private static PrivateConstructorSingleton privateConstructorSingleton = null;

    private PrivateConstructorSingleton(){}

    private static PrivateConstructorSingleton getPrivateConstructorSingleton(){
        if(privateConstructorSingleton == null) {
            privateConstructorSingleton = new PrivateConstructorSingleton();
        }
        return privateConstructorSingleton;
    }

    private void show(){
        System.out.println("I'm the singleton instance show.");
    }

    public static void main(String[] args){
        PrivateConstructorSingleton privateConstructorSingleton = PrivateConstructorSingleton.getPrivateConstructorSingleton();
        privateConstructorSingleton.show();
    }
}
