import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;


    // addLast
    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    // addFirst
    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    // indexOf
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next; // otherwise (else)
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        var current = first;
        while (current != null) {
            if (current.value == item) return true;
            current = current.next;
        }
        return false;
    }

    public boolean contains2(int item) {
        return indexOf(item) != -1; // is the same we just reuse the logic
    }

    public void removeFirst() {
        // [10 -> 20 -> 30]
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        }

        var second = first.next;
        first.next = null;
        first = second;

        size--;
    }

    public void removeLast() {
        // [10 -> 20 -> 30]
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
        }

        var previous = getPrevious(last);
        last = previous;
        last.next = null;

        size--;

    }

    public int size() {
        return size; //O(1)
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next; // this is the previous node like 20
        }
        return null;
    }


    private boolean isEmpty() {
        return first == null;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
