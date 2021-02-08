package customLinkedListRemoveFirst;

public class Main {

    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(customLinkedList.getSize());
        System.out.println(customLinkedList.isEmpty());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
       // System.out.println(customLinkedList.removeFirst());

        for (int i = 5; i <10; i++) {
            customLinkedList.addFirst(i+1);
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(customLinkedList.removeFirst());
//        //System.out.println(customLinkedList.get(3));
//        System.out.println(customLinkedList.get(0));
//        System.out.println(customLinkedList.get((customLinkedList.getSize() - 1)));
//        System.out.println(customLinkedList.removeFirst());

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(customLinkedList.getSize());
        System.out.println(customLinkedList.isEmpty());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");



        // write your code here
    }
}
