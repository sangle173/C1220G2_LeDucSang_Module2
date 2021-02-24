package _07_abstract_interface.exercises.colorable;

import _07_abstract_interface.exercises.Circle;
import _07_abstract_interface.exercises.Rectangle;
import _07_abstract_interface.exercises.Shape;
import _07_abstract_interface.exercises.Square;

public class ColorAbleTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4.6);
        shapes[1] = new Rectangle(5, 7);
        shapes[2] = new Square(9);
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Square) {
                System.out.println(shapes[i] + " and Area is " + shapes[i].getArea());
                ColorAble colorAble = (ColorAble) shapes[i];
                colorAble.howToColor();
            }
        }
    }
}
