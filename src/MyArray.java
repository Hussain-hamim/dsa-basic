public class MyArray {
    private int[] items; // private array variable
    private  int count;

    public  MyArray(int length){
        items = new int[length]; // constructor
}

public void add(int item){
// if array is full, resize
    if(items.length == count){
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

 public void print(){ //print method
     for (int i = 0; i < count; i++) {
        System.out.println(items[i]);
    }
}


}
