package demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
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
        Arrays.stream(interfacesClazz).forEach(i -> System.out.println(i));


        try {
            Constructor<Reflection> constructor = clazz.getDeclaredConstructor(String.class, String.class, String.class);
            constructor.setAccessible(true);
            Reflection reflection = constructor.newInstance("First", "Second", "Third");

            Field zip = clazz.getDeclaredField("zip");
            Field[] declaredFields = clazz.getDeclaredFields();
//            clazz.getDeclaredField("zip");
            Field filedZip = Arrays.stream(clazz.getDeclaredFields()).filter(f -> f.getType() == int.class).findFirst().orElse(null);
            zip.setAccessible(true);
            //int oldValue = (int) zip.get(reflection);
            Object oldValue = zip.get(reflection);
            System.out.println("Old value: " + oldValue);
            zip.set(reflection, 1000);
            System.out.println("New value: " + zip.get(reflection));


            System.out.println(reflection.toString());
        } catch (NoSuchMethodException
                | InstantiationException | InvocationTargetException | IllegalAccessException | NoSuchFieldException e) {
        }

    }
}
