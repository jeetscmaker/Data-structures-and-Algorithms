package com.jk;

import java.util.Stack;

/**
 * A string is given. Find the validity of pairs of braces, brackets
 * or parentheses. Use Stack data structure.
 */
public class ValidBrackets {
    public static void main(String[] args) {
        String s1 = "{[()]}";
        System.out.println(s1 + " is valid with brackets: " + isValidBracketPattern(s1));
        String s2 = "{[(])}";
        System.out.println(s2 + " is valid with brackets: " + isValidBracketPattern(s2));
    }

    /**
     * Method which validates the brackets in the given string.
     */
    public static boolean isValidBracketPattern(String s) {
        if (s == null || s.length() == 0)
            return true;
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (!stk.isEmpty() && stk.peek() == '(')
                    stk.pop();
                else
                    return false;
            } else if (s.charAt(i) == ']') {
                if (!stk.isEmpty() && stk.peek() == '[')
                    stk.pop();
                else
                    return false;
            } else if (s.charAt(i) == '}') {
                if (!stk.isEmpty() && stk.peek() == '{')
                    stk.pop();
                else
                    return false;
            } else
                stk.push(s.charAt(i));
        }
        if (stk.isEmpty())
            return true;
        else
            return false;
    }
}
