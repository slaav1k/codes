import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s == null) return;
        s = s.trim();

        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');

        Deque<Character> stack = new ArrayDeque<>();
        boolean isValid = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (brackets.containsKey(c)) {
                if (stack.isEmpty() || stack.peekLast() != brackets.get(c)) {
                    isValid = false;
                    break;
                }
                stack.removeLast();
            } else {
                stack.addLast(c);
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        if (isValid && stack.isEmpty()) {
            out.println("YES");
        } else {
            out.println("NO");
        }

        out.flush();
        out.close();
    }
}