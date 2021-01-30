import java.util.function.Predicate;

public class MyString {

    public static Predicate<String> wordStartsWithUpperCase = str ->
    {
        return str != null && !str.isEmpty() && Character.isUpperCase(str.charAt(0));
    };

}
