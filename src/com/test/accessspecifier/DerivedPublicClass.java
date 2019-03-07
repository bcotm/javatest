package com.test.accessspecifier;

public class DerivedPublicClass extends PublicClass{
    // fields won't be checked because it does not know which one is the super one
    protected String publicStr;

//    xxx in xxx clashes with xxx in xxx; attempting to assign weaker access privileges
//    protected void printDefaultString(){
//        System.out.println(this.publicStr);
//    }

    public static void main(String[] args){
        DerivedPublicClass derivedPublicClass = new DerivedPublicClass();
        System.out.println(derivedPublicClass.publicStr);
    }
}
