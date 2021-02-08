package customLinkedListToArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        System.out.println(customLinkedList.getSize());
//        System.out.println(customLinkedList.isEmpty());
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//       // System.out.println(customLinkedList.removeFirst());
        for (int i = 5; i <10; i++) {
            customLinkedList.addFirst(i+1);
        }
        int[] arrayDemo = customLinkedList.toArray();
        System.out.println(Arrays.toString(arrayDemo));
        Arrays.stream(arrayDemo).forEach(el-> System.out.print(el + " "));

//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        customLinkedList.forEach(el-> System.out.println(el));
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        System.out.println(customLinkedList.removeFirst());
//        System.out.println(customLinkedList.getSize());
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        System.out.println(customLinkedList.removeFirst());
//        System.out.println(customLinkedList.getSize());
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        System.out.println(customLinkedList.removeFirst());
//        System.out.println(customLinkedList.getSize());
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        System.out.println(customLinkedList.removeFirst());
//        System.out.println(customLinkedList.getSize());
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        System.out.println(customLinkedList.removeFirst());
//        System.out.println(customLinkedList.getSize());
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        System.out.println(customLinkedList.removeFirst());
//        System.out.println(customLinkedList.isEmpty());
//        System.out.println(customLinkedList.getSize());
//        System.out.println(customLinkedList.removeFirst());
//        System.out.println(customLinkedList.get(3));
//        System.out.println(customLinkedList.get(0));
//        System.out.println(customLinkedList.get((customLinkedList.getSize() - 1)));
//        System.out.println(customLinkedList.removeFirst());
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        System.out.println(customLinkedList.getSize());
//        System.out.println(customLinkedList.isEmpty());
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        // write your code here
    }
}
