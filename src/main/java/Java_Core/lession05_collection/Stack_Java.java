package Java_Core.lession05_collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Stack_Java {

    // Stack la cau truc du lieu trong Java, LIFO

    // khong nen khuyen khich su dung vi no extends Vector


    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);


    }
}
