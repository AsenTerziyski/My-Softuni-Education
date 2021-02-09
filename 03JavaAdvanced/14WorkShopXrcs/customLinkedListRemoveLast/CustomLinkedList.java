package customLinkedListRemoveLast;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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
            this.head.prev = newNode;
        }
        this.head = newNode;
        if (isEmpty()) {
            this.tail = this.head;
        }
        this.size++;
    }

    public void addLast(int elementToAddLast) {
        if (isEmpty()) {
            addFirst(elementToAddLast);
            return;
        }
        Node newNode = new Node(elementToAddLast);
        this.tail.next = newNode;
        newNode.prev = this.tail;
        this.tail = newNode;
        this.size++;
    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException(String.format("Collection is empty: size = %d", this.size));
        }
        int removedElement = this.head.element;
        this.head = this.head.next;
        if (this.size > 1) {
            this.head.prev = null;
        }
        this.size--;
        if (this.isEmpty()) {
            this.head = this.tail = null;
        }
        return removedElement;
    }

    public int removeLast() {
        if (this.size<2) {
            return removeFirst();
        }
        int removeElement = this.tail.element;
        this.tail = this.tail.prev;
        this.tail.next = null;
        this.size--;
        return removeElement;
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

    public void forEach(Consumer<Integer> consumer) {
        Node current = this.head;
        while (current != null) {
            consumer.accept(current.element);
            current = current.next;
        }
    }

    public int[] toArray() {
        int[] array = new int[this.size];
        Node current = this.head;
        int index = 0;
        while (current != null) {
            array[index] = current.element;
            index = index + 1;
            current = current.next;
        }
        List<Integer> list = new ArrayList<>();
        forEach(e -> list.add(e));
        return list.stream().mapToInt(i -> i).toArray();
        //return array;
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
