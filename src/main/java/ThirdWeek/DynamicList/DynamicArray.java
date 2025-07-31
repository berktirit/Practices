package ThirdWeek.DynamicList;

public class DynamicArray<T> {
    private T[] array;
    private int size = 0;
    private int capacity;

    @SuppressWarnings("unchecked")
    public DynamicArray() {
        this.capacity = 10;
        this.array = (T[]) new Object[this.capacity];
    }

    @SuppressWarnings("unchecked")
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[this.capacity];
    }

    public int size() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(T data) {
        if (size >= capacity) {
            expandCapacity();
        }
        array[size++] = data;
    }

    @SuppressWarnings("unchecked")
    private void expandCapacity() {
        this.capacity *= 2;
        T[] newArray = (T[]) new Object[this.capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        this.array = newArray;
    }

    public T get(int index) {
        if (index < 0 || index >= size) return null;
        return array[index];
    }

    public T remove(int index) {
        if (index < 0 || index >= size) return null;
        T removed = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null;
        return removed;
    }

    public T set(int index, T data) {
        if (index < 0 || index >= size) return null;
        T old = array[index];
        array[index] = data;
        return old;
    }

    public String toString() {
        if (size == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(array[i]).append(", ");
        }
        sb.append(array[size - 1]).append("]");
        return sb.toString();
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == null && data == null) return i;
            if (array[i] != null && array[i].equals(data)) return i;
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i] == null && data == null) return i;
            if (array[i] != null && array[i].equals(data)) return i;
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public DynamicArray<T> subList(int start, int finish) {
        if (start < 0 || finish >= size || start > finish) return null;
        DynamicArray<T> sub = new DynamicArray<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            sub.add(array[i]);
        }
        return sub;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }
}