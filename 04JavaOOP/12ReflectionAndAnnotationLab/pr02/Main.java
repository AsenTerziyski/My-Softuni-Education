import java.lang.reflect.Method;
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
//            Constructor<Reflection> constructor = clazz.getDeclaredConstructor();
//            Reflection reflection = constructor.newInstance();
            Method[] declaredMethods = clazz.getDeclaredMethods();
//            List<Method> getters = new ArrayList<>();
//            List<Method> setters = new ArrayList<>();
            Set<Method> getters = new TreeSet<>(new MethodComparator());
            Set<Method> setters = new TreeSet<>(new MethodComparator());
            for (Method m : declaredMethods) {
                if (m.getName().contains("get")) {
                    getters.add(m);
                } else if (m.getName().contains("set")) {
                    setters.add(m);
                }
            }

            for (Method getter : getters) {
                System.out.println(String.format("%s will return %s", getter.getName(), getter.getReturnType()));
            }
            for (Method setter : setters) {
                System.out.println(String.format("%s and will set field of %s", setter.getName(), setter.getParameterTypes()[0]));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
