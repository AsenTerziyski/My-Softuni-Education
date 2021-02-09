package demoLinkedListRemoveFirst;

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

    public int removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException(String.format("Collection is empty: size = %d", this.size));
        }
        int removedElement = this.head.element;
        this.head = this.head.next;
        this.size--;
        if (this.isEmpty()) {
            this.head = null;
        }
        return removedElement;
    }

    public int get(int index) {
        // first validate index:
        validateIndex(index);
        // second find element at given index:
        Node currentElement = this.head;

        int currentIndex = 0;
        int element = 0;

        while (currentElement != null) {
            if (index == currentIndex) {
                element = currentElement.element;
                break;
            }
            currentIndex++;
            currentElement = currentElement.next;
        }
        return element;
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException(String.format("Index %d, size %d => Index is not valid.", index, this.size));
        }
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


}
