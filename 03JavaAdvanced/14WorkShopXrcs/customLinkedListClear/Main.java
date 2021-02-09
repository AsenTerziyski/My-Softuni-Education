package customLinkedListClear;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();

        for (int i = 0; i < 3; i++) {
            customLinkedList.addFirst(i + 1);
        }
        for (int i = 1; i <= 3; i++) {
            customLinkedList.addLast(i);
        }

        customLinkedList.forEach(el-> System.out.print(el + " "));
        System.out.println();
        customLinkedList.clear();
        customLinkedList.addFirst(1);
        customLinkedList.addLast(2);
        System.out.println(customLinkedList.get(1));

    }
}
