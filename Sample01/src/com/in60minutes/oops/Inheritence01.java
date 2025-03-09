package com.in60minutes.oops;

class A{
    public String m1(){
        return "A";
    }
}
class B extends A{
    public String m2(){
        return "B";
    }
}
public class Inheritence01 {
    public static void main(String[] args) {
        B a = new B();
        System.out.println(a.m1());
        System.out.println(a.m2());
    }
}
