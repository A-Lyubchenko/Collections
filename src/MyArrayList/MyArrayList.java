package MyArrayList;

public class MyArrayList<E> {
    private Object[] array = new Object[10];
    private int size;


    public void add(E element) {
        if (size >= array.length) {
            getNewArray();
        }
        array[size++] = element;
    }

    public void getNewArray() {
        Object[] newArray = new Object[array.length * 3 / 2 + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public int size() {
        return size;
    }

    public void clear() {
        array = new Object[10];
        size = 0;
    }

    public Object get(int index) {
        return array[index];
    }

    public void remove(int index) {
        int removeElement = size - index - 1;
        System.arraycopy(array, index + 1, array, index, removeElement);
        array[--size] = null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(array[i]).append(" ");
        }
        return stringBuilder.toString();
    }
}