package com.bank.util;
import static java.lang.Math.*;
public class InterestCalculator {
    public double si(double p, double r, double t) {
        return (p * r * t) / 100.0;
    }
    public double ci(double p, double r, double t) {
        return p * pow((1 + r / 100.0), t) - p;
    }
}