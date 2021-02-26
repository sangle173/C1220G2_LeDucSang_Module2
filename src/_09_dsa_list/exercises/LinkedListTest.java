package _09_dsa_list.exercises;

import org.junit.jupiter.api.Test;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        System.out.println(linkedList);
        linkedList.remove(1);
        System.out.println(linkedList);
    }
}
