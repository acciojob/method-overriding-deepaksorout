package com.driver;

import org.w3c.dom.ls.LSOutput;
class A{
    public static String meth(){
        return"Invoking method from class A";
    }
}
class B extends A{
    public static String meth() {
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
    B obj=new B();
  String temp1=obj.meth();
  String temp2=obj.meth();
}
