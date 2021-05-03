package IOUtils;

public class PrintArray {
    private int[] intArray;

    public PrintArray() {

    }

    public static void PrintIntegerArray(int... inputArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <inputArray.length; i++) {
            sb.append(inputArray[i] + "*");
        }
        System.out.println(sb.substring(0, sb.length()-1).trim());
    }
}
