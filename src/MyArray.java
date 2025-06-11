public class MyArray {
    private int[] items; // private array variable
    private int count;

    // constructor
    public MyArray(int length) {
        items = new int[length];
    }

    public void add(int item) {
// if array is full, resize
        if (items.length == count) {
            // create new array (twice the size)
            int[] newItems = new int[count * 2];
            // copy all the existing items
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            // set items to this new array
            items = newItems;
        }
        items[count] = item;
        count++;
    }

    public void removeAt(int index) {
        // validate index
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        // shift the items to the left to fill the hole
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1]; // loop until the given index come then replace with next item which is i + 1
        }
        count--;
    }

    public int indexOf(int item) {
        // if we find it, return index
        // otherwise, return
        // the runtime complexity of this is O(n)
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;

    }

    public int max() {
        if (count == 0)
            throw new IllegalStateException("Array is empty");

        int max = items[0];
        for (int i = 1; i < count; i++) {
            if (items[i] > max)
                max = items[i];
        }
        return max;
    }

    public MyArray intersect(MyArray other) {
        MyArray common = new MyArray(count);

        for (int i = 0; i < count; i++) {
            if (other.indexOf(items[i]) != -1)
                common.add(items[i]);
        }

        return common;
    }

    public void reverse() {
        int start = 0;
        int end = count - 1;

        while (start < end) {
            int temp = items[start];
            items[start] = items[end];
            items[end] = temp;

            start++;
            end--;
        }
    }

    public void insertAt(int item, int index) {
        if (index < 0 || index > count)
            throw new IllegalArgumentException();

        if (count == items.length) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
        }

        for (int i = count - 1; i >= index; i--) {
            items[i + 1] = items[i];
        }

        items[index] = item;
        count++;
    }


    public void print() { //print method
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }


}
