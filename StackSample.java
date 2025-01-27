import java.util.Stack;

public class StackSample {

    //method to check if the parentheses are balanced

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.empty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {

        // check if the parentheses are balanced
        String parentheses1 = "((()))";
        String parentheses2 = "(()())";
        String parentheses3 = "((())";
        String parentheses4 = "())";

        System.out.println("Exercise 1: Check balanced parentheses");
        System.out.println("Parenthese 1: " + isBalanced(parentheses1));
        System.out.println("Parenthese 2: " + isBalanced(parentheses2));
        System.out.println("Parenthese 3: " + isBalanced(parentheses3));
        System.out.println("Parenthese 4: " + isBalanced(parentheses4));


        // exercise 2

        Stack<String> stack = new Stack<>();

        stack.push("Alice");
        stack.push("Bob");
        stack.push("Charlie");

        // pop elements from the stack and print them

        System.out.println("Popped Elements");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println(stack);
    }
}
