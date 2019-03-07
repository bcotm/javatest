package com.test.accessspecifier;

class DefaultClass {
    private String privateStr;
    public String publicStr;
    protected String protectedStr;

    DefaultClass(){
        privateStr = "privatestr";
        publicStr = "publicstr";
        protectedStr = "protectedstr";
    }

    private String getPrivateStr(){
        return privateStr;
    }
    public String getPublicStr(){
        return publicStr;
    }
    protected String getProtectedStr(){
        return protectedStr;
    }
}
