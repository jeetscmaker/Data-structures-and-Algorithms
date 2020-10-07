package com.jk;

import java.util.Stack;

public class StackPostfix {
    public static void main(String[] args) {
        String s = "123*+5-";
        System.out.println("The stack postfix operation on " + s + " is " + evaluateExpression(s));
    }

    /* This method evaluates the postfix operation on the given string. */
    public static int evaluateExpression(String s) {
        Stack<Integer> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (char token : arr) {
            if (token == '+') {
                int op1 = stack.pop();
                int op2 = stack.pop();
                int result = op1 + op2;
                stack.push(result);
            } else if (token == '-') {
                int op1 = stack.pop();
                int op2 = stack.pop();
                int result = op2 - op1;
                stack.push(result);
            } else if (token == '*') {
                int op1 = stack.pop();
                int op2 = stack.pop();
                int result = op1 * op2;
                stack.push(result);
            } else if (token == '/') {
                int op1 = stack.pop();
                int op2 = stack.pop();
                int result = op2 / op1;
                stack.push(result);
            } else {
                stack.push((int)token);
            }
        }
        return stack.pop();
    }
}