import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("DSA!!!!!!!!!!!!");

        HashTable table = new HashTable();
        table.put(6, "A"); // 1
        table.put(8, "B"); // 3
        table.put(11, "C"); // 1
        table.put(6, "A+"); // 1
        table.remove(6); // 1
        System.out.println(table.get(6));


    }

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.empty()) {
            queue.add(stack.pop());
        }
    }

    public static void log(int[] numbers) {
        // O(1) => big O one
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
    }

    //  ARRAY:
// the cost of copying item from one array to another (insert) is O(n)
// delete is also O(n)
    public static void arr() {
        int[] numbers = new int[3];
        System.out.println(Arrays.toString(numbers));

    }

    public void log2(int[] numbers) {
        // O(n) => big O of N => n = cost of the input
        // cost grow linearly to size of our input
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void log3(int[] numbers) {
// O(2 + n) => so we can drop the constant => O(n)
        System.out.println(); // O(1)
        for (int i = 0; i < numbers.length; i++) { // O(n)
            System.out.println(numbers[i]);
        }
        System.out.println(); // O(1)
    }

    public void log4(int[] numbers) {
// O(n + n) => O(2n) also so we can drop the constant => O(n)
        for (int i = 0; i < numbers.length; i++) { // O(n)
            System.out.println(numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++) { // O(n)
            System.out.println(numbers[i]);
        }
    }

    public void log5(int[] numbers, String[] names) {
// O(n + m) => O(n) because the run time complexity increase linearly
        for (int i = 0; i < numbers.length; i++) { // O(n)
            System.out.println(numbers[i]);
        }

        for (String name : names) // O(m)
            System.out.println(name);
    }

    public void log6(int[] numbers) {
// O(n * n) => O(n * n) => O(n^2) because the run time complexity increases quadratically
        // increase quadratically
        for (int i = 0; i < numbers.length; i++) { // O(n)
            System.out.println(numbers[i]);

            for (int second : numbers) // O(n)
                System.out.println(i + ", " + second);
        }

    }

    // logarithmic growth => O(log n) eg; binary search
    // an algorithm with logarithmic growth is more scalable, then linear growth one

// exponential growth: O(2^n) => this grow faster and faster
// not scalable, is very slow. and is opposite of logarithmic growth

    public void log7(int[] numbers) {
// O(n * n * n) => O(n * n * n) => O(n^3) because the run time complexity increases cube
        // increase cube like
        for (int i = 0; i < numbers.length; i++) { // O(n)
            System.out.println(numbers[i]);

            for (int second : numbers) // O(n)
                System.out.println(i + ", " + second);
            for (int third : numbers) // O(n)
                System.out.println(i + ", " + third);
        }

    }

    ;

    // space complexity:
    public void greet(String[] names) {
        // O(n) space
        String[] copy = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Hi " + names[i]);
        }
        // we always look to the additional space size of the input
    }


}

