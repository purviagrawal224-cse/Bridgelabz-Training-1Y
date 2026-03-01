package com.company.analytics.sales;
public class SalesReport {
    private String r;
    private double a;
    public SalesReport(String r, double a) {
        this.r = r;
        this.a = a;
    }
    public void show() {
        System.out.println("Region : " + r);
        System.out.println("Sales  : " + a);
    }
}