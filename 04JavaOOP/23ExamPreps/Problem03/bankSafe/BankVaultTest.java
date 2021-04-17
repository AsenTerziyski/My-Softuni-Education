package bankSafe;


import org.junit.Assert;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class BankVaultTest {

    @Test
    public void testEmptyTest() {
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetVaultCellsShouldReturnUnmodifiableCollection() {
        BankVault bankVault = new BankVault();
        Item xItem = new Item("X", "X1");
        bankVault.getVaultCells().put("X", xItem);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddItemThrowsExceptionIfCellDoesNotExist() throws OperationNotSupportedException {
        BankVault bankVault = new BankVault();
        Item xItem = new Item("X", "X1");
        bankVault.addItem("A10", xItem);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddItemShouldReturnExceptionIfExistingCellIsNotEmpty() throws OperationNotSupportedException {
        BankVault bankVault = new BankVault();
        Item xItem = new Item("X", "X1");
        Item xxItem = new Item("X", "X1");
        bankVault.addItem("A1", xItem);
        bankVault.addItem("A1", xxItem);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testAddItemShouldThrowExceptionIfItemIsAlreadyInCell() throws OperationNotSupportedException, IllegalArgumentException {
        BankVault bankVault = new BankVault();
        Item xItem = new Item("X", "X1");
        bankVault.addItem("A1", xItem);
        bankVault.addItem("A1", xItem);
        boolean trueContains = bankVault.getVaultCells().containsKey(xItem);
        Assert.assertTrue(trueContains);
    }

    @Test
    public void testAddItemShouldReturnCorrectStringFormat() throws OperationNotSupportedException {
        BankVault bankVault = new BankVault();
        Item xItem = new Item("X", "X1");
        Item xItem2 = new Item("X", "X2");
        bankVault.addItem("A1", xItem);
        bankVault.addItem("A2", xItem2);
        String expected = String.format("Item:%s saved successfully!", xItem.getItemId());
        String actual = String.format("Item:%s saved successfully!",bankVault.getVaultCells().get("A1").getItemId());
        Assert.assertEquals(expected, actual);

    }


    //TODO: Write your tests here

}