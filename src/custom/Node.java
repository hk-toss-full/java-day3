package custom;

public class Node<T> implements CustomList<T>{
    private Node<T> next;
    private T data;
    private int size;
    @Override
    public void add(T item) {
        Node<T> current = this;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node<>(item);
        size++;
    }
    public static void main(String[] args) {
        CustomList<String> list  = new Node<>("t");
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list.get(2));
        System.out.println(list.size());
    }
    public Node(T data) {
        this.data = data;
        size = 1;
    }



    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void remove(T item) {

    }

    @Override
    public T get(int index) {
        Node<T> current = this;
        int count = 0;
        while (current.next != null){
            current = current.next;
            count++;
            if(count == index) return current.data;

        }
        return null;
    }
}
