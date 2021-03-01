package _11_dsa_stack_queue.exercises.reverse_stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ReverseTest {
//    public static List<Integer> inputNumber(){
//        List<Integer> listNumber=new ArrayList<Integer>();
//        Scanner scanner=new Scanner(System.in);
//        int number;
//        while (true){
//            number=scanner.nextInt();
//            listNumber.add(number);
//        }
//
//    }

    public static void main(String[] args) {
        ReverseStack reverseStack = new ReverseStack();
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean check = false;
        int count = 0;
        do {
            System.out.println("1.Enter number \n" + "2.Exit");
            int choice = scanner.nextInt();
            if (choice == 1) {
                count++;
                System.out.println("Enter number " + count);
                number = scanner.nextInt();
                reverseStack.stack.push(number);
                check = true;
            } else if (choice == 2) {
                check = false;
            } else {
                System.out.println("Plz choice again");
            }
        } while (check);
        System.out.println("Before reverse");
        System.out.println(reverseStack.stack);
        System.out.println("=======================");
        System.out.println("After reverse");
        reverseStack.reverse();
        System.out.println(reverseStack.stack);
    }
}
