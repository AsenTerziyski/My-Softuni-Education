package demo02Annotations;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Class<MyMethods> clazz = MyMethods.class;
        Method[] methods = clazz.getDeclaredMethods();

        Map<String, Method> methodByAuthors = new TreeMap<>();
        for (Method method : methods) {
            Author subject = method.getAnnotation(Author.class);

            if (subject != null) {
                methodByAuthors.put(subject.author(), method);
            } else {
                System.out.println("Method " + "\"" + method.getName() + "\"" + " ->" + " has no author");
            }
        }

        for (Map.Entry<String, Method> entry : methodByAuthors.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue().getName());
        }
    }
}
