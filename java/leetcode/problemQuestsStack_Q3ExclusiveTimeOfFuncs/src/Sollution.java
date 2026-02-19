import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        int prevTime = 0;
        String[] parts;
        int id, timestamp, prevFunc, finishedFunc;

        for (String log : logs) {
            parts = log.split(":");
            id = Integer.parseInt(parts[0]);
            String type = parts[1];
            timestamp = Integer.parseInt(parts[2]);

            if (type.equals("start")) {
                if (!stack.isEmpty()) {
                    prevFunc = stack.peek();
                    result[prevFunc] += timestamp - prevTime;
                }
                stack.push(id);
                prevTime = timestamp;
            } else {
                finishedFunc = stack.pop();
                result[finishedFunc] += timestamp - prevTime + 1;

                prevTime = timestamp + 1;
            }
        }

        return result;
    }
}