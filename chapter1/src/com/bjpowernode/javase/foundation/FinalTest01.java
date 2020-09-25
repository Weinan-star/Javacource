package com.bjpowernode.javase.foundation;

public class FinalTest01 {
    public static void main(String[] args) {
        Person p = new Person();

    }
}

class Person{
    int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public  void m(){
    }
}

class Son extends Person{
    public void m(){

    }

}
