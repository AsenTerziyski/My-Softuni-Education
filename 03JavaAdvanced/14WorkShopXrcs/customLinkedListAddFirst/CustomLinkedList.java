package customLinkedListAddFirst;

public class CustomLinkedList {
    // elements will be presented as Nodes;
    // we need size as well;
    private Node head;
    private Node tail;
    private int size;

    // define class ot type Node:
    private static class Node {
        private int element;
        private Node next;
        private Node prev;

        // правим си конструктор, който приема елемент:
        public Node(int element) {
            this.element = element;
        }
    }

    public void addFirst(int elementToAdd) {
        Node newNode = new Node(elementToAdd);
        if (this.head != null) {
            newNode.next = this.head;
        }
        this.head = newNode;
        this.size++;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


}
