package com.school.util;
import com.school.data.Student;
public class Analyzer {
    public double calculateAverage(Student s) {
        return (s.getM1() + s.getM2() + s.getM3()) / 3.0;
    }
    public String findGrade(double a) {
        if (a >= 90) return "A+";
        else if (a >= 75) return "A";
        else if (a >= 60) return "B";
        else if (a >= 50) return "C";
        else return "F";
    }
}