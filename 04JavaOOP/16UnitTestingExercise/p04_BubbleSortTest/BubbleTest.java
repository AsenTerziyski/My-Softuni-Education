package p04_BubbleSortTest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BubbleTest {

    @Test
    public void when_notSortedArrayIsPassedToSort_then_returnArrayInAscendingOrder() {
        int[] array = new int[]{5, 14, -2, 20, 32, 0};
        //понеже сорт е направен статичен в бъбъл => може да го извикам без инстанция:
        Bubble.sort(array);
        int[] expectedArray = new int[]{-2, 0, 5, 14, 20, 32};
        assertEquals(expectedArray.length, array.length);
        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void when_sortedInAscendingOrderArrayIsPassedToSort_then_keepArray() {
        int[] sortedArray = new int[]{-100, -25, 0, 5, 13, 49, 100};
        Bubble.sort(sortedArray);
        int[] expectedArray = new int[]{-100, -25, 0, 5, 13, 49, 100};
        assertEquals(expectedArray.length, sortedArray.length);
        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void when_emptyArrayIsPassedToSort_then_emptyArray() {
        int[] array = new int[]{};
        Bubble.sort(array);
        Assert.assertEquals(0, array.length);

    }

    @Test
    public void when_arrayOfTwoNotSortedElementsIsPassedToSort_then_exchangeTheElements() {
        int[] array = new int[] {100, 1};
        Bubble.sort(array);
        int[] expectedArray = new int[]{1,100};
        assertEquals(expectedArray.length, array.length);
        Assert.assertArrayEquals(expectedArray, array);
    }

}