import java.util.Stack;

public class Expression {

    // "(1 + 2)"
    // ( push to top of our stack
    // ignore other
    // ) pop to top

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);
            else if (isRightBracket(ch)) {
                if (stack.empty()) return false;

                var top = stack.pop();
                if (bracketNotMatch(top, ch)) return false;
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(char ch) {
        return ch == '(' || ch == '<' || ch == '[' || ch == '{';
    }

    private boolean isRightBracket(char ch) {
        return ch == ')' || ch == '>' || ch == ']' || ch == '}';
    }

    private boolean bracketNotMatch(char left, char right) {
        return (right == ')' && left != '(') ||
                (right == '>' && left != '<') ||
                (right == ']' && left != '[') ||
                (right == '}' && left != '{');
    }
}
