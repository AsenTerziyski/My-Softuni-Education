import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChainblockImplTest {

    private Transaction transaction;
    private Chainblock chainblock;

    @Before
    public void setUp() {
        this.chainblock = new ChainblockImpl();
        this.transaction = new TransactionImpl(1, TransactionStatus.SUCCESSFUL, "Pesho", "Gosho", 10);
    }

    @Test
    public void testAddTransactionWithExistingIdShouldNotBeAdded() {
        Transaction transaction = new TransactionImpl(1, TransactionStatus.SUCCESSFUL, "Pesho", "Gosho", 10);
        this.chainblock.add(this.transaction);
        this.chainblock.add(transaction);
        int expectedSize = 1;
        int actualSize = this.chainblock.getCount();
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testContainsShouldReturnTrueForExistingTransaction() {
        this.chainblock.add(this.transaction);
        boolean actualResult = this.chainblock.contains(this.transaction);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void testContainsShouldReturnFalseForNonExistingTransaction() {
        boolean actualResult = this.chainblock.contains(this.transaction);
        assertFalse(actualResult);
    }

    @Test
    public void testContainsByIdShouldReturnTrueForExistingTransaction() {
        this.chainblock.add(this.transaction);
        boolean actualResult = this.chainblock.contains(1);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void testContainsByIdShouldReturnFalseForNonExistingTransaction() {
        boolean actualResult = this.chainblock.contains(250);
        assertFalse(actualResult);
    }

    @Test
    public void testGetCountShouldReturnTheNumberOfTransactionsInTheRecord() {
        this.chainblock.add(this.transaction);
        this.chainblock.add(new TransactionImpl(2, TransactionStatus.SUCCESSFUL, "Pesho", "Gosho", 10));
        this.chainblock.add(new TransactionImpl(3, TransactionStatus.SUCCESSFUL, "Pesho", "Gosho", 10));
        int actualCount = this.chainblock.getCount();
        int expectedCount = 3;
        Assert.assertEquals(3, actualCount);
    }

    @Test
    public void testChangeTransactionStatusShouldChangeStatus() {
        this.chainblock.add(this.transaction);
        this.generateTransactionsForTheTest();

        this.chainblock.changeTransactionStatus(1, TransactionStatus.UNAUTHORIZED);
        Transaction transaction = this.chainblock.getById(1);
        TransactionStatus actualStatus = transaction.getStatus();
        TransactionStatus expectedStatus = TransactionStatus.UNAUTHORIZED;
        Assert.assertEquals(expectedStatus, actualStatus);

        this.chainblock.changeTransactionStatus(5, TransactionStatus.UNAUTHORIZED);
        transaction = this.chainblock.getById(5);
        actualStatus = transaction.getStatus();
        expectedStatus = TransactionStatus.UNAUTHORIZED;
        Assert.assertEquals(expectedStatus, actualStatus);

        transaction = this.chainblock.getById(7);
        actualStatus = transaction.getStatus();
        expectedStatus = TransactionStatus.FAILED;
        Assert.assertEquals(expectedStatus, actualStatus);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChangeTransactionStatusShouldShouldThrowExceptionIfNoExistingId() {
        this.chainblock.changeTransactionStatus(2, TransactionStatus.FAILED);
        transaction.setStatus(TransactionStatus.SUCCESSFUL);
    }


    private void generateTransactionsForTheTest() {
        for (int i = transaction.getId(); i <= 10; i++) {
            this.chainblock.add(new TransactionImpl(i, TransactionStatus.FAILED, "A" + i, "B" + i, 10 * i));
        }
    }

}