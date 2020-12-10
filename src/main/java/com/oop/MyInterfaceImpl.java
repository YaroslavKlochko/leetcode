package com.oop;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void doIt(String str) {
        System.out.println("Print string: " + str);
    }
}
