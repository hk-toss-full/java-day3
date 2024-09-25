package custom;

import java.util.Arrays;

public class CustomArrayList implements CustomList{
    private Object[] arr;
    private int size;

    public static void main(String[] args) {
        CustomList<String> strs = new CustomArrayList();
        strs.add("Hello");
        strs.add("World");
        strs.add("Java");
        System.out.println(strs);
        for (int i = 0; i < 10; i++) {
            strs.add(i+"index");
        }
        System.out.println(strs);
    }

    public CustomArrayList() {
        arr = new Object[10];
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

    }

    @Override
    public void remove(Object item) {

    }

    @Override
    public Object get(int index) {
        return null;
    }
}
