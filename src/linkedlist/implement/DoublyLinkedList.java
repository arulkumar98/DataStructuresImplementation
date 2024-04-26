package linkedlist.implement;

public class DoublyLinkedList<T> {
    private static class Node<V>{
        private V value;
        private Node<V> next;
        private  Node<V> prev;

        public Node(V value, Node<V> next, Node<V> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node(V value) {
            this.value = value;
        }
    }
    Node<T> head;
    Node<T> tail;

    public DoublyLinkedList() {

    }

    public void insert(T value){
        Node<T> newNode = new Node<>(value);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void print(){
        Node<T> node = head;
        while (node != null){
            System.out.print(node.value  +" -> ");
            node = node.next;
        }
    }

    public void printReverse(){
        Node<T> node = tail;
        do {
            System.out.print(node.value+ " -> ");
            node = node.prev;
        }while (node != head);
    }
}
