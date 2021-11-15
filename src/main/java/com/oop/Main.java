package com.oop;

public class Main {
    private MyInterface myInterface;

    public Main(MyInterface myInterface) {
        this.myInterface = myInterface;
    }

    public static void main(String[] args) {
//        MyInterface myInterface = new MyInterfaceImpl2();
        Main main = new Main(new MyInterfaceImpl());
        main.myInterface.doIt("str");

        UkrainianPeople people = new UkrainianPeople();
//        people.get
    }

}
