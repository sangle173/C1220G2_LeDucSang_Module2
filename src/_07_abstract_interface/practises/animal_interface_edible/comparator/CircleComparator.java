package _07_abstract_interface.practises.animal_interface_edible.comparator;

import _04_object_class.exercises.Fan;
import _06_inheritance_polymorphism.practises.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    public CircleComparator() {
    }

    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()) {
            return 1;
        } else if (o1.getRadius() < o2.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}
