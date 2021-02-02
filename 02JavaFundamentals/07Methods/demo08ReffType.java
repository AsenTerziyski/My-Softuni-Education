public class demo08ReffType {
    public static void main(String[] args) {
        int[] nums = {0};
        //програмата минава през инкремент метода прави кода в него и понеже
        // са референтен тип, променя стойността на нулевия елемент:
        increment(nums, 15);
        System.out.println(nums[0]);

        // ако сложа метода преди принтирането, ще принтира нула? Отговор да.
        // Виж ProgramExecution на стр.52 от презентацията.
        //0
        //
        //Process finished with exit code 0
        //increment(nums, 15);
    }

    public static void increment(int[] nums, int value) {
        nums[0] += value;
    }

}
