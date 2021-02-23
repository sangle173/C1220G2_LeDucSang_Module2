package _06_inheritance_polymorphism.practises;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.9, 3.7);
        System.out.println(rectangle);
        rectangle = new Rectangle(4.9, 2.5, "black", false);
        System.out.println(rectangle);
    }
}
