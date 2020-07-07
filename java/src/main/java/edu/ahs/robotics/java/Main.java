package edu.ahs.robotics.java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World! My name is Ave");
        Point a = new Point(1,2);
        System.out.println(a.getX());
        System.out.println(a.distanceFromOrigin());
        System.out. println(a.getQuadrant());
    }
}