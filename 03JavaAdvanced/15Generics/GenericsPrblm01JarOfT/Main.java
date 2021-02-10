package GenericsPrblm01JarOfT;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jar<Integer> jar = new Jar<>();
        jar.add(7);
        jar.add(9);
        jar.add(18);
        jar.add(20);
        System.out.println();
        jar.remove();
        jar.remove();
        System.out.println();
        Jar<String> jarJar = new Jar<>();
        jarJar.add("x");
        jarJar.add("xy");
        jarJar.add("xyz");
        System.out.println();

	// write your code here
    }
}
