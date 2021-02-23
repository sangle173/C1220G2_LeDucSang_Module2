package _06_inheritance_polymorphism.practises;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.9);
        System.out.println(circle);
        circle = new Circle("red", false, 3.1);
        System.out.println(circle);
    }
}
