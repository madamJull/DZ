package org.example.DZ_3;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(3);
        list.addNode(61);
        list.addNode(21);
        list.addNode(48);
        list.addNode(53);
        list.sortList();
        list.reverseList();
        list.printList();
    }
}
