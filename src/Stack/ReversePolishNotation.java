package Stack;

import java.util.Objects;
import java.util.Stack;

public class ReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> operands = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+" -> {
                    operands.push(operands.pop() + operands.pop()
                    );
                }
                case "-" -> {
                    if (operands.isEmpty())
                        return 0;
                    int b = operands.pop();
                    int a = operands.pop();
                    operands.push(a - b);
                }
                case "*" -> {
                    int b = operands.pop();
                    int a = operands.pop();
                    operands.push(a * b);
                }
                case "/" -> {
                    if (operands.isEmpty())
                        return 0;
                    int b = operands.pop();
                    int a = operands.pop();
                    operands.push(a / b);
                }
                default -> operands.push(Integer.valueOf(token));
            }
        }
        return operands.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(tokens));
    }
}
