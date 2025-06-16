import java.util.Arrays;

public class ArrayQueue {
    // arrayqueue (arrayDeque)
    // enqueue
    // dequeue
    //peek
    // isEmpty
    //isFull
    // [10, 20, 30, 40, 50]
    //   F               R
    // pointers
    // F= 0
    // R = 4
    private int[] items;
    private int rear;
    private int front;
    private int count;

    // constructor
    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if (count == items.length)
            throw new IllegalStateException();

        items[rear++] = item;
        count++;
    }

    public int dequeue() {
        var item = items[front];
        items[front++] = 0;
        count--;
        return item;
    }

    @Override
    public String toString() {
//        var content = Arrays.copyOfRange(items, 0, count);
//        return Arrays.toString(content);
        return Arrays.toString(items);
    }
}
