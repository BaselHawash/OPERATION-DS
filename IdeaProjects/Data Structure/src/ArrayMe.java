
class ArrayMe {
    private int[] items;
    private int count;

    ArrayMe(int size) {
        items = new int[size];
        count = 0;
    }


    void AddElement(int item) {
        if (isFull()) {
            return;
        }

        items[count++] = item;

    }

    void display() {
        for (int i = 0; i < count; i++)
            IO.println(items[i]);
    }

    boolean search(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return true;
            }
        }
        return false;
    }

    void Insert(int pos, int item) {
        if (InvalidInsertPosition(pos)) {
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

    void Delete(int pos) {

        if (InvalidDeletePosition(pos)) {
            return;
        }

        for (int i = pos; i < count - 1; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    boolean isFull() {
        if (count == items.length) {
            IO.println("Array is full");
            return true;
        }
        return false;
    }


    void Enlarger2(int newSize) {
        int[] newArray2 = new int[newSize];
        if (newSize > items.length) {
            for (int i = 0; i < count; i++) {

                newArray2[i] = items[i];
            }
            items = newArray2;
        }
    }

    boolean InvalidInsertPosition(int pos) {
        if (pos < 0 || pos > count) {
            IO.println("Invalid position");
            return true;
        }
        return false;
    }

    boolean InvalidDeletePosition(int pos) {
        if (pos < 0 || pos >= count) {
            IO.println("Invalid position");
            return true;
        }
        return false;
    }

}






