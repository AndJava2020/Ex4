package ru.AndJava2020.Ex4;

public class Square extends Rectangle{
    public Square(){}

    public Square(double width) {
        super(width, width);
    }
    public double getSide() {
        return width;
    }

    public void setSide(double width) {
        this.width = width;
    }
    public Square(String color, boolean filled, double width) {
        super(color, filled, width, width);
    }
    public void setWidth(double width){
        this.width = width;
    }
    public  void setLength(double length){
        this.length=length;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
