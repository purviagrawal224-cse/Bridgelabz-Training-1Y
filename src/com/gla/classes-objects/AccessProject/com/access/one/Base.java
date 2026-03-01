package com.access.one;
public class Base {
    public void pub() {
        System.out.println("Public method");
    }
    protected void pro() {
        System.out.println("Protected method");
    }
    void def() {
        System.out.println("Default method");
    }
    private void pri() {
        System.out.println("Private method");
    }
    public void test() {
        pri();
    }
}