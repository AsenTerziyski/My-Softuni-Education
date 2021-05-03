package CreatePointInRectangle;

public class DmGeometryFactory {

    public DmRectangle createRectangle(int[] inputInfo) {
        checkInputInfoData(inputInfo);
        DmPoint bottomLeftRectangle = new DmPoint(inputInfo[0], inputInfo[1]);
        DmPoint topRightRectangle = new DmPoint(inputInfo[2], inputInfo[3]);
        DmRectangle demoRectangle = new DmRectangle(bottomLeftRectangle, topRightRectangle);
        return demoRectangle;
    }

    private void checkInputInfoData(int[] inputInfo) {
        if (inputInfo.length > 4) {
            throw new IllegalArgumentException(DmExceptionMessages.INPUT_POINT_DATA_SHOULD_BE_FOUR_VALUES);
        }
    }

    public DmPoint createPoint(int[] inputPointXandY) {
        checkInputPointData(inputPointXandY);
        DmPoint demoPoint = new DmPoint(inputPointXandY[0], inputPointXandY[1]);
        return demoPoint;
    }

    private void checkInputPointData(int[] inputPointXandY) {
        if (inputPointXandY.length > 2) {
            throw new IllegalArgumentException(DmExceptionMessages.INPUT_POINT_DATA_SHOULD_BE_TWO_VALUES);
        }
    }
}
