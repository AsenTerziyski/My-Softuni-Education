package pr01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Class<Reflection> clazz = Reflection.class;
//        System.out.println(clazz.getSimpleName());
//        System.out.println(clazz.getName());
        System.out.println(clazz);

        Class<? super Reflection> baseClazz = clazz.getSuperclass();
//        System.out.println(baseClazz.getSimpleName());
//        System.out.println(baseClazz.getName());
        System.out.println(baseClazz);

        Class<?>[] interfacesClazz = clazz.getInterfaces();
        //Arrays.stream(interfacesClazz).forEach(i -> System.out.println(i.getSimpleName()));
        //Arrays.stream(interfacesClazz).forEach(i-> System.out.println(i.getName()));
        Arrays.stream(interfacesClazz).forEach(i-> System.out.println(i));


        try {
            // връща конструктор. хвърля ексепшън:
            Constructor<Reflection> constructor = clazz.getConstructor();
            Reflection reflection = constructor.newInstance();
            System.out.println(reflection.toString());
        } catch (NoSuchMethodException | InstantiationException | InvocationTargetException |
                IllegalAccessException e) {
        }

    }
}
