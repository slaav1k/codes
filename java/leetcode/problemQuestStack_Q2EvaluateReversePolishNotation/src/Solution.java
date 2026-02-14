import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {

            if (token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/")) {

                int a = stack.pop();
                int b = stack.pop();
                int result;

                switch (token) {
                    case "+" -> result = b + a;
                    case "-" -> result = b - a;
                    case "*" -> result = b * a;
                    default  -> result = b / a;
                }

                stack.push(result);

            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
