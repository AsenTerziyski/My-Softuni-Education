package Pr03;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static class MethodComparator implements Comparator<Method> {
        @Override
        public int compare(Method f, Method s) {
            return f.getName().compareTo(s.getName());
        }
    }

    public static void main(String[] args) {

        Class<Reflection> clazz = Reflection.class;

        try {

            Method[] declaredMethods = clazz.getDeclaredMethods();
            Set<Method> getters = new TreeSet<>(new MethodComparator());
            Set<Method> setters = new TreeSet<>(new MethodComparator());

            for (Method m : declaredMethods) {
                if (m.getName().contains("get")) {
                    getters.add(m);
                } else if (m.getName().contains("set")) {
                    setters.add(m);
                }
            }

            Arrays.stream(clazz.getDeclaredFields())
                    .filter(f-> !Modifier.isPrivate(f.getModifiers()))
                    .sorted(Comparator.comparing(f->f.getName()))
                    .forEach(f-> System.out.println(f.getName() + " must be private!"));

            for (Method getter : getters) {
                if (!Modifier.isPublic(getter.getModifiers())) {
                    System.out.println(getter.getName() + " have to be public!");
                }
            }

            for (Method setter : setters) {
                if (!Modifier.isPrivate(setter.getModifiers())) {
                    System.out.println(setter.getName() + " have to be private!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
