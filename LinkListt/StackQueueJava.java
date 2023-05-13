package LinkListt;

import java.util.Stack;

public class StackQueueJava {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        for (Integer integer:myStack) {
            System.out.println(integer+" ");
        }
    }
}
