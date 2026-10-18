public class ArrayMe {
    // this is items for declared array and decide type of array
    private int[] items;
    private int count;

    // here we will allocation array and decide size by constructor
    // the parameter is decide the index of array
    ArrayMe(int size) {
        items = new int[size];
        count = 0;
    }

    public int getCount() {
        return count;
    }


    //this methode for add new element in array if there is any space left in array we will use count to decide the position where the element will store

    void Append(int item) {
        if (isFull()) {
        } else
            items[count++] = item;
    }

    //this methode for display all element in array
    void travers() {
        for (int i = 0; i < count; i++) {
            IO.println("the items is  :" + items[i]);
        }
    }

    // now we make methode if we are looking for element in our array we use if and loob
    //Loob  to through on all element in array
    // if to see if on of element = our item

    boolean search(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return true;
            }

        }
        return false;
    }
    //Now we are facing big problem in array insert make something called overhead
    // we will use count bc we need number of element
    // why we don't use array.length bc it show something called capacity of array
    // this work if there's space in array so will check
    // and dont forget to make count ++ bc u just add new element in array

    void Insert(int pos, int item) {

        if (isInvalidPos(pos)) {
            return;
        }
        if (isFull()) {
            return;
        }
        for (int i = count; i > pos; i--) {
            items[i] = items[i - 1];
        }
        items[pos] = item;
        count++;
    }

// this methode to delete item by position bc we in array if we use by item or date  we will delete multi data if there  are the same 

    void Delete(int pos) {


        for (int i = pos; i < count - 1; i++) {
            items[i] = items[i + 1];
        }

        count--;

    }


    //  this methode for check is array is full or not
    boolean isFull() {
        if (count == items.length) {
            IO.println("Sorry we can add new Element in this Array ");
            return true;
        } else
            return false;
    }


    // this methode for check is the position available in array
    boolean isInvalidPos(int pos) {
        if (pos < 0 || pos > count) {
            IO.println("Invalid position: " + pos);
            return true;
        }
        return false;
    }

}
 