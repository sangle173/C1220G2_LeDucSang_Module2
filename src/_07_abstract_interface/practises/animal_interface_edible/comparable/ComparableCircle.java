package _07_abstract_interface.practises.animal_interface_edible.comparable;

import _06_inheritance_polymorphism.practises.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {

    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) {
            return 1;
        }

        else if (getRadius() < o.getRadius()) {
            return -1;
        }

        else {
            return 1;
        }
    }
}
