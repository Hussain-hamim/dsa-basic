import java.util.Stack;

public class Expression {

    // "(1 + 2)"
    // ( push to top of our stack
    // ignore other
    // ) pop to top

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(')
                stack.push(input.charAt(i));
            else if (input.charAt(i) == ')') {
                if (stack.empty()) return false;
                stack.pop();
            }
        }

        return stack.empty();
    }
}
