package com.driver;

import org.w3c.dom.ls.LSOutput;

public class Main {
  String temp1=A.meth();
  String temp2=B.meth();
}
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