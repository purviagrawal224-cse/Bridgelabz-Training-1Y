package com.access.two;
import com.access.one.Base;
public class Derived extends Base {
    public static void main(String[] args) {
        Derived d = new Derived();
        System.out.println("---Accessible Methods--");
        d.pub();
        d.pro();
        System.out.println("\nDefault and Private not accessible here.");
    }
}