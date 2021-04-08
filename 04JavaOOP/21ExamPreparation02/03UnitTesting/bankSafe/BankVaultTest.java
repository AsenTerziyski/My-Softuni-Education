package bankSafe;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SplittableRandom;

public class BankVaultTest {
    private BankVault bankVault;
    private Item item;

    @Before
    public void init() {
        this.bankVault = new BankVault();
        this.item = new Item("TestOwner", "TestID000");
    }

    @Test
    public void test1() {

    }

    @Test
    public void testGetVaultCellsShouldReturnCells() {
        Map<String, Item> expectedMap = new LinkedHashMap<>();
        expectedMap.put("A1", null);
        expectedMap.put("A2", null);
        expectedMap.put("A3", null);
        expectedMap.put("A4", null);
        expectedMap.put("B1", null);
        expectedMap.put("B2", null);
        expectedMap.put("B3", null);
        expectedMap.put("B4", null);
        expectedMap.put("C1", null);
        expectedMap.put("C2", null);
        expectedMap.put("C3", null);
        expectedMap.put("C4", null);
        Map<String, Item> actualMap = this.bankVault.getVaultCells();
        Assert.assertEquals(expectedMap, actualMap);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetVaultCellsShouldReturnExceptionWhenTryToGetCollectionAndPutAnItem() {
        this.bankVault.getVaultCells().put("C5", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddItemShouldThrowExceptionIfVaultDoesNotContainsCell() throws OperationNotSupportedException {
        this.bankVault.addItem("C5", this.item);
        this.bankVault.addItem("C5", this.item);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddSameItemToCellShouldThrowONSE() throws OperationNotSupportedException {
        this.bankVault.addItem("A1", this.item);
        this.bankVault.addItem("A2", this.item);
    }

    @Test
    public void testAddToCellShouldReturnMessage() throws OperationNotSupportedException {
        String expectedMessage = String.format("Item:%s saved successfully!", this.item.getItemId());
        String actualMessage = this.bankVault.addItem("A1", this.item);
        Item actual = this.bankVault.getVaultCells().get("A1");
        Assert.assertEquals(expectedMessage, actualMessage);
        Assert.assertEquals(this.item, actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemoveShouldReturnExceptionIfCellDoesNotExists(){
        //Cell doesn't exists
        this.bankVault.removeItem("Does not exist", this.item);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemoveItemShouldThrowExceptionIfItemDoesNotExist () throws OperationNotSupportedException {
        Item item2 = new Item("TestOwnerXXX", "TestIDXXX");
        this.bankVault.addItem("A1", this.item);
        this.bankVault.removeItem("A1", item2);
    }

    @Test
    public void testRemoveItemShouldReturnMessageIfItemExists() throws OperationNotSupportedException {
        String expectedMessage = String.format("Remove item:%s successfully!", this.item.getItemId());
        this.bankVault.addItem("A1", this.item);
        String actualMessage = this.bankVault.removeItem("A1",this.item);
        Assert.assertEquals(expectedMessage, actualMessage);
        Assert.assertNull(this.bankVault.getVaultCells().get("A1"));
    }




}