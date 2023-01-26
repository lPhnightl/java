package dz;

import java.util.*;
public class IP {
  
    public static String compute(String expr) throws
        ArithmeticException,
        EmptyStackException {
        Stack<Double> stack = new Stack<>();
        expr = expr.replace("Pi","3.1415926");
        for (String token : expr.split("\\s+")) {
            switch (token.toLowerCase()) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;
                case "^":
                    double exponent = stack.pop();
                    stack.push(Math.pow(stack.pop(), exponent));
                    break;
                case "sin":
                    stack.push(Math.sin(stack.pop()));
                    break;
                
                default:
                    stack.push(Double.parseDouble(token));
                    break;
            }
        }
        String result = String.format("%.2f",stack.pop());
        return result;
    }
    
}