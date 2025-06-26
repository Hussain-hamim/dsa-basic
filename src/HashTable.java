import java.util.LinkedList;

public class HashTable {
    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        var index = hash(key); // key where we should store our key value pair
        if (entries[index] == null) {
            entries[index] = new LinkedList<>();
        }

        var bucket = entries[index];
        for (var entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        var entry = new Entry(key, value); // we wrap the object in entry object
        bucket.addLast(entry); // get the linkedlist at index position and add the entry object
    }

    private int hash(int key) {
        return key % entries.length; // whatever key we have we reduce it to the size of our array
    }


    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
