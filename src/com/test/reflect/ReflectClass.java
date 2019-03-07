package com.test.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectClass {
    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();

        // 反射获取域
        Class klass = derivedClass.getClass();
        Field[] fields = klass.getFields();
        for (Field field : fields) {
            System.out.println(Modifier.toString(field.getModifiers()));
            System.out.println(field.getType().getName() + " " + field.getName());
        }
        System.out.println("所有的域：");
        Field[] declaredFields = klass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(Modifier.toString(field.getModifiers()));
            System.out.println(field.getType().getName() + " " + field.getName());
        }

        // 反射获取方法
        System.out.println("public加继承方法：");
        Method[] methods = klass.getMethods();
        for(Method method : methods){
            System.out.println(Modifier.toString(method.getModifiers()));
            System.out.println(method.getReturnType()+ " " + method.getParameterCount() + " " + method.getParameterTypes().toString());
        }
    }
}
