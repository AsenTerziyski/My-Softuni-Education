package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      RichSoilLand richSoilLand = new RichSoilLand();
//		Field[] declaredFields1 = richSoilLand.getClass().getDeclaredFields();
//		int modifiers = declaredFields1[0].getModifiers();
//		String string = Modifier.toString(1);
//		Class<RichSoilLand> clazz = RichSoilLand.class;

        Scanner scanner = new Scanner(System.in);
        Field[] declaredFields = RichSoilLand.class.getDeclaredFields();
        String input = scanner.nextLine();
        while (!"HARVEST".equalsIgnoreCase(input)) {
            final String modifier = input;
            Field[] fields = Arrays
                    .stream(declaredFields)
                    .filter(f -> Modifier.toString(f.getModifiers()).equals(modifier))
                    .toArray(Field[]::new);
            if (fields.length == 0) {
                //print all fields
//                Arrays
//                        .stream(declaredFields)
//                        .forEach(f -> System.out.println(String.format("%s %s %s", Modifier.toString(f.getModifiers()),
//                                f.getType().getSimpleName(),
//                                f.getName())));
                printFields(declaredFields);
            } else {
                //print fields that match modifier
                printFields(fields);
            }
            input = scanner.nextLine();
        }
    }

    private static void printFields(Field[] fields) {
        Arrays
                .stream(fields)
                .forEach(f -> System.out.println(String.format("%s %s %s", Modifier.toString(f.getModifiers()),
                        f.getType().getSimpleName(),
                        f.getName())));
    }
}
