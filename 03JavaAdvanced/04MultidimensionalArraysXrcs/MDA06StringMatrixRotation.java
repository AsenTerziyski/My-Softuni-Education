import java.util.Scanner;

public class MDA06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rotationInput = scanner.nextLine().split("[\\(\\)]");
        int rotations = Integer.parseInt(rotationInput[1]);

        String line = "";
        int maxLength = 0;
        String input = scanner.nextLine();

        while (!"END".equals(input)) {
            line += input + "\n";
            if (input.length() > maxLength) {
                maxLength = input.length();
            }

            input = scanner.nextLine();
        }

        String[] matrix = line.split("\n");

        String output = "";
        rotations %= 360;

        switch (rotations) {

            case 0:
                //System.out.println(line);
                System.out.println(String.join("\n", matrix));
                break;

            case 90:

                for (int i = 0; i < maxLength; i++) {

                    for (int j = matrix.length - 1; j >= 0; j--) {

                        try {
                            output += matrix[j].charAt(i);
                        } catch (Exception e) {
                            output += " ";
                        }
                    }

                    output += "\n";
                }

                System.out.println(output);
                break;

            case 180:
                StringBuilder sb = new StringBuilder();
                sb.append(line);
                sb.reverse();
                System.out.println(sb.toString());
                break;

            case 270:

                for (int i = 0; i < maxLength; i++) {

                    for (int j = matrix.length - 1; j >= 0; j--) {

                        try {
                            output += matrix[j].charAt(i);
                        } catch (Exception e) {
                            output += " ";
                        }

                    }

                    output += "\n";
                }

                System.out.println(new StringBuilder(output).reverse());
                break;

        }
    }
}
