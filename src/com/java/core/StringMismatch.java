package com.java.core;

import java.util.Stack;

public class StringMismatch {
	// Function to check if brackets are balanced
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);  // Push opening brackets onto the stack
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    return false;  // If the stack is empty and we encounter a closing bracket, it's unbalanced
                }
                
                // Check if the bracket matches the top of the stack
                char openBracket = stack.pop();
                if (ch == '}' && openBracket != '{' || 
                    ch == ']' && openBracket != '[' || 
                    ch == ')' && openBracket != '(') {
                    return false;  // Mismatched bracket
                }
            }
        }
        
        return stack.isEmpty();  // If the stack is empty, all brackets were matched
    }

    public static void main(String[] args) {
        String n = "}[()]{";  // Original string with mismatched brackets
        
        // Check if the string has balanced brackets
        boolean isValid = isBalanced(n);
        
        if (isValid) {
            System.out.println("The string has balanced brackets.");
        } else {
            System.out.println("The string has mismatched brackets.");
            // Fixing the mismatched string manually
            String correctedString = "{[()]}";
            System.out.println("Corrected String: " + correctedString);
        }
    }
}
