import java.util.Arrays;

public class ArrayQueue {
    private int[] items;  // Array to store queue elements
    private int rear;     // Points to the end of the queue (where new elements are added)
    private int front;    // Points to the front of the queue (where elements are removed)
    private int count;    // Tracks the number of elements in the queue
    //All pointers (front, rear) start at 0 by default
    //Count starts at 0 (empty queue)

    // constructor
    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if (count == items.length)
            throw new IllegalStateException();

        items[rear] = item;
        rear = (rear + 1) % items.length; //Moves rear forward by 1
        //Uses modulo operation (% items.length) to wrap around to start when reaching end
        count++;
    }

    public int dequeue() {
        var item = items[front]; //Get front item: Store the item at front before removal
        items[front] = 0; //Clear position: Set the front position to 0 (optional)
        front = (front + 1) % items.length;
        count--; //Decrement count: Track the removed element
        return item;
    }

//    Time Complexity:
//    enqueue(): O(1) - constant time operation
//    dequeue(): O(1) - constant time operation


    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
