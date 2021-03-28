package com.company
import java.lang.*;
import java.util.Scanner;

class Area2 {
    public static void main(String[] args) {
        float a, b, c, s, answer;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        s = (a+b+c) / 2;
//        System.out.println(s);
        answer = s * (s-a) * (s-b) * (s-c);
        area = Math.sqrt(answer);
        System.out.println("Area: " + area);
    }
}