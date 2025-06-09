public class LinkedList {
    private Node first;
    private Node last;

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
    }

    // indexOf
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next; // otherwise
            index++;
        }
        return -1;
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
