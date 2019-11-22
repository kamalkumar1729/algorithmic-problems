package recursion;

import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);
        stack.push(17);

        reverse(stack);

        for (Integer integer : stack) {
            System.out.println(integer);
        }
    }



    // TODO make this correct.

    private static void reverse(Stack<Integer> stack) {
        Integer ele = stack.pop();
        if (!stack.isEmpty()) reverse(stack);
        stack.push(ele);
    }

}
