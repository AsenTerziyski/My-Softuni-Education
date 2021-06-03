package BoxSecond;


class BoxSecond {
    private double length;
    private double width;
    private double height;

    public BoxSecond(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setHeight(double height) {
        BoxValidator.validateSide(height);
        this.height = height;
    }

    private void setWidth(double width) {
        BoxValidator.validateSide(width);
        this.width = width;

    }

    private void setLength(double length) {
        BoxValidator.validateSide(length);
        this.length = length;
    }

    double calculateSurfaceArea() {
        return BoxCalculator.calcSurfaceArea(this.length, this.width, this.height);
    }

    double calculateLateralSurfaceArea () {
        return BoxCalculator.calcLatSurfaceArea(this.length, this.width, this.height);
    }

    double calculateVolume () {
        return BoxCalculator.calcVolume(this.length, this.width, this.height);
    }

    @Override
    public String toString() {
        String surfaceArea = String.format(BoxMessages.sa, calculateLateralSurfaceArea());
        String lateralArea = String.format(BoxMessages.la, calculateLateralSurfaceArea());
        String volume = String.format(BoxMessages.v, calculateVolume());
        StringBuilder sb = new StringBuilder();
        sb.append(surfaceArea).append(System.lineSeparator()).append(lateralArea).append(System.lineSeparator()).append(volume)
        .append(System.lineSeparator());
        sb.append("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        return sb.toString().trim();
    }
}
