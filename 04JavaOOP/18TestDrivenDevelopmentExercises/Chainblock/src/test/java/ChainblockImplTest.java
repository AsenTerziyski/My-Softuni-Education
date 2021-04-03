import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class ChainblockImplTest {

    private Transaction transaction;
    private Chainblock chainblock;
    private List<Transaction> transactionList;

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

    @Test
    public void testRemoveTransactionByIdShouldRemoveTransactionWithValidId() {
        this.chainblock.add(this.transaction);
        this.generateTransactionsForTheTest();
        chainblock.removeTransactionById(1);
        int actualSize = chainblock.getCount();
        int expectedSize = 9;
        Assert.assertEquals(expectedSize, actualSize);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveTransactionByIdShouldThrowExceptionIfNoValidId() {
        this.generateTransactionsForTheTest();
        chainblock.removeTransactionById(2000000);
    }

    @Test
    public void testGetByValidShouldReturnCorrectTransaction() {
        chainblock.add(this.transaction);
        generateTransactionsForTheTest();
        Transaction actualTransaction = chainblock.getById(1);
        Assert.assertEquals(this.transaction.getId(), actualTransaction.getId());
        Assert.assertEquals(this.transaction, actualTransaction);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByIdShouldThrowExceptionIfIdIsInvalid() {
        generateTransactionsForTheTest();
        this.chainblock.getById(0);
    }

    @Test
    public void testGetByTransactionStatusShouldReturnTransactionsWithTheGivenStatusOrderedByAmountDescending() {
        this.generateTransactionsForTheTest();
        Iterable<Transaction> actualTransactions = this.chainblock.getByTransactionStatus(TransactionStatus.FAILED);
        List<Transaction> actual = new ArrayList<>();
        actualTransactions.forEach(at -> actual.add(at));
        List<Transaction> expected = this.transactionList
                .stream()
                .sorted((t1, t2) -> Double.compare(t2.getAmount(), t1.getAmount()))
                .collect(Collectors.toList());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetByTransactionStatusShouldReturnListOfSendersNamesWithGivenTransactionStatus() {
        this.generateTransactionsForTheTest();
        Iterable<String> actualTransactions = this.chainblock.getAllSendersWithTransactionStatus(TransactionStatus.FAILED);
        List<String> actual = new ArrayList<>();
        actualTransactions.forEach(at -> actual.add(at));
        List<String> expected = this.transactionList
                .stream()
                .sorted((t1, t2) -> Double.compare(t1.getAmount(), t2.getAmount()))
                .map(Transaction::getSender)
                .collect(Collectors.toList());
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByInvalidTransactionStatusShouldThrowAnException() {
        this.generateTransactionsForTheTest();
        Iterable<String> actualTransactions = this.chainblock.getAllSendersWithTransactionStatus(TransactionStatus.SUCCESSFUL);
    }

    @Test
    public void testGetAllSendersByTransactionStatusShouldReturnListOfReceiversNamesWithGivenTransactionStatus() {
        this.generateTransactionsForTheTest();
        Iterable<String> actualTransactions = this.chainblock.getAllReceiversWithTransactionStatus(TransactionStatus.FAILED);
        List<String> actual = new ArrayList<>();
        actualTransactions.forEach(at -> actual.add(at));
        List<String> expected = this.transactionList
                .stream()
                .sorted((t1, t2) -> Double.compare(t1.getAmount(), t2.getAmount()))
                .map(Transaction::getReceiver)
                .collect(Collectors.toList());
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetAllReceiversByInvalidTransactionStatusShouldThrowAnException() {
        this.generateTransactionsForTheTest();
        Iterable<String> actualTransactions = this.chainblock.getAllReceiversWithTransactionStatus(TransactionStatus.SUCCESSFUL);
    }

    @Test
    public void getAllOrderedByAmountDescendingThenByIdShouldReturnAllTransactionsOrderedByAmountDescendingAndById() {
        this.generateTransactionsForTheTest();
        Iterable<Transaction> actualTransactions = this.chainblock.getAllOrderedByAmountDescendingThenById();
        List<Transaction> actual = new ArrayList<>();
        actualTransactions.forEach(at -> actual.add(at));
        List<Transaction> expected = this.transactionList.stream()
                .sorted((t1, t2) -> {
                    int result = Double.compare(t1.getAmount(), t2.getAmount());
                    if (result == 0) {
                        return Integer.compare(t1.getId(), t2.getId());
                    }
                    return result;
                })
                .collect(Collectors.toList());
        Assert.assertEquals(expected, actual);
    }


    private void generateTransactionsForTheTest() {
        this.transactionList = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            Transaction transaction = new TransactionImpl(i, TransactionStatus.FAILED, "A" + i, "B" + i, 10 * i);
            this.chainblock.add(transaction);
            this.transactionList.add(transaction);
        }
    }

//    private void generateListTransactions() {
//        Iterable<Transaction> tr = new ArrayList<>();
//        for (int i = 5; i >= 1; i--) {
//            Transaction transaction = new TransactionImpl(i, TransactionStatus.FAILED, "a" + i, "b" + i, 10 * i);
//            this.transactionList.add(transaction);
//        }
//    }

//    @Test
//    public void demoTestDelta() {
//        double a = 5.0001;
//        double b = 5.00;
//        double delta = (a-b)/10;
//        assertEquals(a,b,delta);
//    }

}