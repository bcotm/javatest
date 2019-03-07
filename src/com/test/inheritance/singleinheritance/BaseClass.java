package com.test.inheritance.singleinheritance;

public class BaseClass {
    private MemberClass memberClass;
    public static MemberStaticClass memberStaticClass = new MemberStaticClass();
    BaseClass(){
        System.out.println("construct BaseClass.");
        memberClass = new MemberClass();
    }
}
