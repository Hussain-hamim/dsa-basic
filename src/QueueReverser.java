import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
    public static void reverse(Queue<Integer> queue, int k) {
        if (k < 0 || k > queue.size()) {
            throw new IllegalArgumentException("k is out of bounds");
        }

        Stack<Integer> stack = new Stack<>();

        // Push first k elements into stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        // Pop from stack and enqueue back to queue (now reversed)
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Move remaining elements (size - k) to the back
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.remove());
        }
    }
}