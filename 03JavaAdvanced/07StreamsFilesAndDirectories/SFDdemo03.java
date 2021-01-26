import java.util.Scanner;

public class SFDdemo03 {
    public static void main(String[] args) {


        try {
            int number = Integer.parseInt("3o");
            System.out.println(number);
        } catch (NumberFormatException ex) {
            //System.out.println("!!!!!!!!!!!!!");
            //System.out.println(ex.getMessage());
            throw new IllegalStateException(ex);
        } finally {
            //винаги ще се изпълние кода в блок finally
            System.out.println("I will always");

        }



    }
}
