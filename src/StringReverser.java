import java.util.Stack;

public class StringReverser {

    public String reverse(String input) {
        if (input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();
        var reverseString = "";

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));

        }
        while (!stack.empty())
            reverseString += stack.pop();

//        // alt way: foreach loop
//        for (char ch : input.toCharArray())
//            stack.push(ch);

        return reverseString;
    }
}
