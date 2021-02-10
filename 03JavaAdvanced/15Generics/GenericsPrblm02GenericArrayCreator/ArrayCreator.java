package GenericsPrblm02GenericArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {
    @SuppressWarnings("unchecked")
    public static <T> T[] create (int length, T item) {
        T[] arr = (T[]) Array
                .newInstance(item.getClass(), length);
        Arrays.fill(arr, item);
        return arr;
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] create (Class<T> clazz,int length, T item) {
        T[] arr = (T[]) Array
                .newInstance(clazz, length);
        Arrays.fill(arr, item);
        return arr;
    }
}

//public class ArrayCreator<T> {
//    private T[] array;
//
////    @SuppressWarnings("unchecked")
////    public T[] createArray(int length, T item) {
////        // Generic принадлеци на инстацниите
////        // static не е обвързано с Т?
////        //T[] arr = (T[]) new Object[length];
////        T[] arr = (T[]) Array.newInstance(item.getClass(), length);
////        Arrays.fill(arr, item);
////        this.array = arr;
////        return arr;
////    }
//
//}

