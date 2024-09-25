package custom;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T>{
    private Object[] arr;
    private int size;
    private final int INITIAL_SIZE = 10;
    public static void main(String[] args) {
        CustomList<String> strs = new CustomArrayList<>();
        strs.add("Hello");
        strs.add("World");
        strs.add("Java");
        System.out.println(strs);
        for (int i = 0; i < 10; i++) {
            strs.add(i+"index");
        }
        System.out.println(strs);
        System.out.println(strs.get(4));
        strs.remove(2);
        System.out.println(strs);
    }

    public CustomArrayList() {
        arr = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public String toString() {
        return "arr = " + Arrays.toString(arr) + ", size = " + size;
    }

    @Override
    public void add(Object item) {
        Object[] before = arr;
        if(size == arr.length) arr = new Object[arr.length+1];
        arr[size++] = item;
        for (int i = 0; i < before.length; i++) arr[i] = before[i];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(int index) {
        if(index >= size) return;
        Object[] after = arr.length > INITIAL_SIZE ? new Object[arr.length-1] : arr;
        for (int i = 0; i < after.length; i++){
            if(i == index) after[i] = arr[i+1];
            else after[i] = arr[i];
        }
        arr = after;
        size--;
    }

    @Override
    public void remove(Object item) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(item)) {
                remove(i);
                return;
            }
        }
    }

    @Override
    public T get(int index) {
        if (size <= index) return null;
        return (T) arr[index];
    }
}
