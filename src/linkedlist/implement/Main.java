package linkedlist.implement;

public class Main {
    public static void main(String[] args) {
//        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        for (int i = 0; i <=10; i++) {
            list.insert(i);
        }
//        list.print();
        list.printReverse();

    }
}
