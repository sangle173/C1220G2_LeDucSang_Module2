package _07_abstract_interface.practises.animal_interface_edible.comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0]= new ComparableCircle(4.1);
        circles[1]= new ComparableCircle();
        circles[2]= new ComparableCircle("red", false, 5.6);
        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
