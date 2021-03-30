package p03_IteratorTest;

import org.junit.Assert;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class ListIteratorTest {

    @Test (expected = OperationNotSupportedException.class)
    public void when_nullElementsArePassedToTheConstructor_then_exceptionIsExpected() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator(null);
    }

    @Test
    public void when_validElementsArePassedToTheConstructor_then_moveReturnsCorrectBoolean() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator("a", "b", "c");
        //points a
        assertTrue(listIterator.move());
        //points b
        assertTrue(listIterator.move());
        //points c
        assertFalse(listIterator.move());
    }

    @Test
    public void when_validElementsArePassedToTheConstructor_then_hasNextReturnsCorrectBoolean() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator("a", "aa", "aaa");

        boolean a = listIterator.hasNext();
        listIterator.move();
        assertTrue(a);

        boolean aa = listIterator.hasNext();
        listIterator.move();
        assertTrue(aa);

        boolean aaa = listIterator.hasNext();
        assertFalse(aaa);
    }

    @Test (expected = IllegalStateException.class)
    public void when_emptyListIterator_then_exceptionIsExpected () throws OperationNotSupportedException {
        new ListIterator().print();
    }

    @Test
    public void when_correctElementsInListOperatorArePassed_then_print() throws OperationNotSupportedException {
        String[] elements = new String[] {"a", "b", "c"};
        ListIterator listIterator = new ListIterator(elements);
        for (int i = 0; listIterator.hasNext(); listIterator.move()) {
            Assert.assertEquals(elements[i], listIterator.print());
            i++;
        }

    }

//    @Test
//    public void move() {
//    }
//
//    @Test
//    public void hasNext() {
//    }
//
//    @Test
//    public void print() {
//    }
}