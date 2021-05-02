package demo01LystyOperator;

import java.util.ArrayList;
import java.util.Arrays;

public class ListOperator {
    private ArrayList<String> stringsData;
    private int stringIndex;

    public ListOperator(String... strings) {
        this.setStringsData(strings);
    }

    private void setStringsData(String... strings) {
        this.stringsData = new ArrayList<>(Arrays.asList(strings));
    }

    public boolean move() {
        if (hasNext()) {
            stringIndex++;
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        return stringIndex < stringsData.size();
    }

    public void print () {
        validatePrint();
        for (String stringsDatum : stringsData) {
            System.out.println(stringsDatum);
        }
        //System.out.println(this.stringsData.get(this.stringIndex));
    }

    private void validatePrint() {
        if (this.stringsData.isEmpty()) {
            throw new IllegalArgumentException(ExcMessages.EMPTY_COLLECTION);
        }
    }
}

