package WorkShopDemo01;

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
//        for (int i = 0; i <smartArray.size(); i++) {
//            System.out.println(smartArray.get(i));
//        }

        for (int i = 0; i <= smartArray.size(); i++) {
            System.out.println(smartArray.get(i));
        }


        System.out.println();

    }
}
