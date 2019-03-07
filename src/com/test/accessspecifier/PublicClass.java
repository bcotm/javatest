package com.test.accessspecifier;
// 不用导入同一个包中的其他类，可以直接使用。
// import com.test.accessspecifier.DefaultClass;
// 不能导入其他包中访问修饰符为default的类。
// import com.test.accessspecifier.otherpackage.DefaultClassFromOtherPackage;

public class PublicClass {
    private DefaultClass defaultClass;
    public String publicStr;

    PublicClass(){
        defaultClass = new DefaultClass();
        publicStr = "publicstr";
    }
    public void printDefaultString(){
        System.out.println(defaultClass.getPublicStr());
        System.out.println(defaultClass.getProtectedStr());
    }
    public static void main(String[] args){
        PublicClass publicClass = new PublicClass();
        publicClass.printDefaultString();
    }
}
