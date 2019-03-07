package com.test.object.equalsandhashcode;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String id;
    private String name;

    Student(String id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object other){
       if(other == null){
           return false;
       }
       if( this == other){
           return true;
       }
       if(!(other instanceof Student)){
           return false;
       }
       Student otherStudent = (Student)other;
       return (otherStudent.id.equals(id));
    }

    @Override
    public int hashCode(){
        return id.hashCode();
    }

    public static void main(String[] args){
        /*
        如果不Override equals和hashCode方法
        * */
        Map<Student, Integer> mathScore = new HashMap<>();
        mathScore.put(new Student("123", "小明"), 99);
        mathScore.put(new Student("123", "小明"), 100);

        /*
        未重载或只重载equals：
        小明
        123
        小明
        123
        * */
        /*
        重载：
        小明
        123
        * */
        for( Student student : mathScore.keySet()){
            System.out.println(student.name);
            System.out.println(student.id);
        }
    }
}
