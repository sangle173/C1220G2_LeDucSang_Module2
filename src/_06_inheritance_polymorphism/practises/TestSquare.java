package _06_inheritance_polymorphism.practises;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.4);
        System.out.println(square);

        square = new Square(10.9, "red", true);
        System.out.println(square);
    }
}
