package ru.AndJava2020.Ex4;

public class Circle extends Shape{
    private double rad;
    public Circle(){

    }

    @Override
    public double getArea() {
        return 0;
    }

    public Circle(double rad) {
        this.rad = rad;
    }

    public Circle(String color, boolean filled, double rad) {
        super(color, filled);
        this.rad = rad;
    }

    public double getRadius() {
        return rad;
    }

    public void setRadius(double rad) {
        this.rad = rad;
    }
    public double getPerimeter(){
        return Math.PI*rad*2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "rad=" + rad +
                '}';
    }
}
