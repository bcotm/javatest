package com.test.accessspecifier.otherpackage;

 class DefaultClassFromOtherPackage {
    private String privateStr;
     DefaultClassFromOtherPackage(){
        privateStr = "privatestr";
    }
    public String getPrivateStr(){
        return privateStr;
    }
}
