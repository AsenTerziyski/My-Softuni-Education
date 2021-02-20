import java.util.Scanner;

public class Pr02Bomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int sizeFiled = Integer.parseInt(scanner.nextLine());
        String[] inputCommands = scanner.nextLine().split(",");
        char[][] matrixFiled = new char[sizeFiled][sizeFiled];

        int startRow = 0;
        int startCol = 0;
        int startBombs = 00;
        for (int row = 0; row < sizeFiled; row++) {
            String[] inputRow = scanner.nextLine().split("\\s+");
            for (int col = 0; col < matrixFiled[row].length; col++) {
                matrixFiled[row][col] = inputRow[col].charAt(0);
                if (matrixFiled[row][col] == 's') {
                    startRow = row;
                    startCol = col;
                }
                if (matrixFiled[row][col] == 'B') {
                    startBombs++;
                }
            }
        }


        int i = 0;
        char currentPlace = ' ';
        char startPlace = matrixFiled[startRow][startCol];

        int finalRowPosition = startRow;
        int finalColPosition = startCol;

        int foundedBombs = 0;
        while (i <= inputCommands.length - 1) {
            String currentCommand = inputCommands[i];
            switch (currentCommand) {
                case "left":
                    finalRowPosition = finalRowPosition;
                    finalColPosition = finalColPosition - 1;
                    if (finalColPosition - 1 < 0) {
                        finalColPosition = 0;
                    }
                    currentPlace = matrixFiled[finalRowPosition][finalColPosition];
                    if (currentPlace == 'B') {
                        System.out.println("You found a bomb!");
                        foundedBombs++;
                        char symbolToReplace = '+';
                        currentPlace = symbolToReplace;
                        matrixFiled[finalRowPosition][finalColPosition] = symbolToReplace;
                        if (foundedBombs == startBombs) {
                            System.out.println("Congratulations! You found all bombs!");
                            return;
                        }
                    }
                    if (currentPlace == 'e') {
                        System.out.println(String.format("END! %d bombs left on the field", startBombs - foundedBombs));
                        return;
                    }
                    break;

                case "right":
                    finalRowPosition = finalRowPosition;
                    finalColPosition = finalColPosition + 1;
                    if (finalColPosition + 1 > matrixFiled.length - 1) {
                        finalColPosition = matrixFiled.length - 1;
                    }
                    currentPlace = matrixFiled[finalRowPosition][finalColPosition];
                    if (currentPlace == 'B') {
                        System.out.println("You found a bomb!");
                        foundedBombs++;
                        char symbolToReplace = '+';
                        currentPlace = symbolToReplace;
                        matrixFiled[finalRowPosition][finalColPosition] = symbolToReplace;

                        if (foundedBombs == startBombs) {
                            System.out.println("Congratulations! You found all bombs!");
                            return;
                        }
                    }
                    if (currentPlace == 'e') {
                        System.out.println(String.format("END! %d bombs left on the field", startBombs - foundedBombs));
                        return;
                    }

                    break;

                case "down":
                    finalRowPosition = finalRowPosition + 1;
                    finalColPosition = finalColPosition;
                    if (finalRowPosition + 1 > matrixFiled.length - 1) {
                        finalRowPosition = matrixFiled.length - 1;
                    }
                    currentPlace = matrixFiled[finalRowPosition][finalColPosition];
                    if (currentPlace == 'B') {
                        System.out.println("You found a bomb!");
                        foundedBombs++;
                        char symbolToReplace = '+';
                        currentPlace = symbolToReplace;
                        matrixFiled[finalRowPosition][finalColPosition] = symbolToReplace;
                        if (foundedBombs == startBombs) {
                            System.out.println("Congratulations! You found all bombs!");
                            return;
                        }
                    }
                    if (currentPlace == 'e') {
                        System.out.println(String.format("END! %d bombs left on the field", startBombs - foundedBombs));
                        return;
                    }

                    break;

                case "up":
                    finalRowPosition = finalRowPosition - 1;
                    finalColPosition = finalColPosition;
                    if (finalRowPosition - 1 < 0) {
                        finalRowPosition = 0;
                    }
                    currentPlace = matrixFiled[finalRowPosition][finalColPosition];
                    if (currentPlace == 'B') {
                        System.out.println("You found a bomb!");
                        foundedBombs++;
                        char symbolToReplace = '+';
                        currentPlace = symbolToReplace;
                        matrixFiled[finalRowPosition][finalColPosition] = symbolToReplace;
                        if (foundedBombs == startBombs) {
                            System.out.println("Congratulations! You found all bombs!");
                            return;
                        }
                    }
                    if (currentPlace == 'e') {
                        System.out.println(String.format("END! %d bombs left on the field", startBombs - foundedBombs));
                        return;
                    }

                    break;
            }
            i++;
        }
        int bombsLeft = startBombs - foundedBombs;
        System.out.println(String.format("%d bombs left on the field. Sapper position: (%d,%d)", bombsLeft, finalRowPosition, finalColPosition));
        //System.out.println();

    }
}
