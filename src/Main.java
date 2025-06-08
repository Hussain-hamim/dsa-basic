public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public void  log(int[] numbers){
        // O(1) => big O one
        System.out.println(numbers[0]);
        System.out.println(numbers[0]);
    }

    public void  log2(int[] numbers){
        // O(n) => big O of N => n = cost of the input
    // cost grow linearly to size of our input
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
}
    }

    public void  log3(int[] numbers){
// O(2 + n) => so we can drop the constant => O(n)
        System.out.println(); // O(1)
        for (int i = 0; i < numbers.length; i++){ // O(n)
            System.out.println(numbers[i]);
        }
        System.out.println(); // O(1)
    }


    public void  log4(int[] numbers){
// O(n + n) => O(2n) also so we can drop the constant => O(n)
        for (int i = 0; i < numbers.length; i++){ // O(n)
            System.out.println(numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++){ // O(n)
            System.out.println(numbers[i]);
        }
    }

    public void  log5(int[] numbers, String[] names){
// O(n + m) => O(n) because the run time complexity increase linearly
        for (int i = 0; i < numbers.length; i++){ // O(n)
            System.out.println(numbers[i]);
        }

        for (String name : names) // O(m)
            System.out.println(name);
    }


    public void  log6(int[] numbers){
// O(n * n) => O(n * n) => O(n^2) because the run time complexity increases quadratically
      // increase quadratically
        for (int i = 0; i < numbers.length; i++){ // O(n)
            System.out.println(numbers[i]);

            for (int second : numbers) // O(n)
                System.out.println(i + ", " + second );
        }

    }
};
