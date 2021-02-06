package WorkShopDemo03RemoveElementMethod;

public class Main {

    public static void main(String[] args) {

        SmartArray smartArray = new SmartArray();
//        smartArray.add(13);
//        smartArray.add(42);
//        smartArray.add(69);

        for (int i = 0; i < 100; i++) {
            smartArray.add(i + 1);
        }
//
//        for (int i = 0; i < smartArray.size(); i++) {
//            System.out.println(smartArray.get(i));
//        }
//
//        //will throw exception:
//        for (int i = 0; i <= smartArray.size(); i++) {
//            System.out.println(smartArray.get(i));
//        }
//
//        int removedElement = smartArray.remove(0);
//        System.out.println(removedElement);
        while (!smartArray.isEmpty()) {
            System.out.println(smartArray.remove(0));
        }

        System.out.println();
    }
}
