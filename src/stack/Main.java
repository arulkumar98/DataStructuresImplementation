package stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>();

        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }

        System.out.println(stack.pop());
    }
}
