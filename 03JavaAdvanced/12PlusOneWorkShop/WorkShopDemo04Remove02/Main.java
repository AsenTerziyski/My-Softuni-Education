package WorkShopDemo04Remove02;

public class Main {

    public static void main(String[] args) {

        SmartArray smartArray = new SmartArray();

        for (int i = 0; i < 8; i++) {
            smartArray.add(i + 1);
        }
        System.out.println();

        boolean isTrue = true;
        while (isTrue) {
            smartArray.add(13);
            smartArray.remove(smartArray.size()-1);
        }
//        while (smartArray.isEmpty()) {
//            System.out.println(smartArray.remove(0));
//        }

        System.out.println();
    }
}
