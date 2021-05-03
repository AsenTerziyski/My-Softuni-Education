package CreatePointInRectangle;

public class Main {
    public static void main(String[] args) {
        DmConsoleReader demoConsoleReader = new DmConsoleReader();
        String inputPointData = demoConsoleReader.readLine();
        int[] checkPointInfo = DmInputParser.parsePointData(", ", inputPointData);
        DmPoint checkPoint = new DmPoint(checkPointInfo[0], checkPointInfo[1]);


        String inputRectangleInfo = demoConsoleReader.readLine();
        int[] rectangleInfo = DmInputParser.parseRectangleData("-", inputRectangleInfo);
        DmRectangle rectangle = new DmRectangle(new DmPoint(rectangleInfo[0], rectangleInfo[1]),
                new DmPoint(rectangleInfo[2], rectangleInfo[3]));

        System.out.println(rectangle.checkIfPointIsInRectangle(checkPoint));
    }
}
