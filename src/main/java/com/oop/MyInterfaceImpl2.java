package com.oop;

public class MyInterfaceImpl2 implements MyInterface{
    @Override
    public void doIt(String str) {
        System.out.println("Print string: " + str.toUpperCase());
    }
}
