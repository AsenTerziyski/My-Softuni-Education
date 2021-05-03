package CreatePointInRectangle;

import java.util.Arrays;

public class DmInputParser {

    public static int[] parsePointData(String pattern, String input) {
        int[] pointData = Arrays.stream(input.split(pattern)).mapToInt(Integer::parseInt).toArray();
        if (pointData.length > 2) {
            throw new IllegalArgumentException(DmExceptionMessages.NOT_CORRECT_DATA);
        }
        return pointData;
    }

    public static int[] parseRectangleData(String pattern, String input) {
        int[] rectangleData = Arrays.stream(input.split(pattern)).mapToInt(Integer::parseInt).toArray();
        if (rectangleData.length > 4) {
            throw new IllegalArgumentException(DmExceptionMessages.NOT_CORRECT_DATA);
        }
        return rectangleData;
    }
}
