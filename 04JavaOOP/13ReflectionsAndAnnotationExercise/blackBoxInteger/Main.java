package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);
//        BlackBoxInt blackBoxInt = new BlackBoxInt();
//        Constructor<?>[] declaredConstructors = BlackBoxInt.class.getDeclaredConstructors();
        // с долния ред казваме: дай конструктор, който приема параметър (в случая от тип инт.класс)
        //Constructor<BlackBoxInt> ctor = BlackBoxInt.class.getDeclaredConstructor(int.class);
        Constructor<BlackBoxInt> ctor = BlackBoxInt.class.getDeclaredConstructor();
        // правя си горния конструктор досъпен:
        ctor.setAccessible(true);
        // след като е досъпен, мога да създам нова инстанция на класа с ню.Инстанс:
        BlackBoxInt blackBoxInt = ctor.newInstance();
        // с долния ред казвам да взема методите в класа. Прави го в масив:
        Method[] declaredMethods = blackBoxInt.getClass().getDeclaredMethods();

        Field innerValue = blackBoxInt.getClass().getDeclaredField("innerValue");
        innerValue.setAccessible(true);

        String input = scanner.nextLine();
        while (!"end".equalsIgnoreCase(input)) {
            String[] tokens = input.split("_");

            String command = tokens[0];
            int param = Integer.parseInt(tokens[1]);


            Method method = Arrays.stream(declaredMethods).filter(m -> m.getName().equalsIgnoreCase(command)).findFirst().get();

            // горният ред дава метод като стринг, давам на долния ред сетАксесибъл:
            method.setAccessible(true);

            // може и така:
            //Method method1 = BlackBoxInt.class.getDeclaredMethod(input, int.class);

            // след това му дава инвоук
            method.invoke(blackBoxInt, param);
            System.out.println(innerValue.getInt(blackBoxInt));

            input = scanner.nextLine();
        }

    }
}
