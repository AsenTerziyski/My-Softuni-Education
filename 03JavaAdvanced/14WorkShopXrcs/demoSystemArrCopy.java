public class demoSystemArrCopy {
    public static void main(String[] args) {
        int[] arrOne = new int[15];
        int[] arrTwo = {1, 2, 3, 4, 5, 1500};
        System.arraycopy(arrTwo, 0, arrOne, 3, 6);
    }
}
