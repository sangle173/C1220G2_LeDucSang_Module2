package _07_abstract_interface.exercises;

import _07_abstract_interface.exercises.colorable.ColorAble;

public class Square extends Rectangle implements ColorAble {
    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        double newArea = getArea() * percent;
        System.out.println("New area of Square is " + newArea);
    }
}
