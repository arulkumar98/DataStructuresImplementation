package linkedlist.implement;

public class SingleLinkedList<T> {

    private static class Node<V> {
        private  V value;
        private Node<V> next;


        public Node(V value) {
            this. value = value;
        }


        public Node() {
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int index = 0;


    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        }else {
            tail.next = newNode;
        }
        tail = newNode;
        index++;
    }

    public void print(){
        Node<T> node = head;
        while (node != null){
            System.out.print(node.value);
            node = node.next;
        }
    }

    public T removeFirst(){
        Node<T> node = head;
        this.head = head.next;
        return node.value;
    }


}


