import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductStockTest {

    private Instock instock;
    private Product product;

    @Before
    public void setUp() {
        instock = new Instock();
        product = new Product("default_test_label 1", 100, 1);
    }

    @Test
    public void testGetCountShouldReturnTwoWhenTwoProductsAreAdded() {
        addProducts();
        assertEquals(Integer.valueOf(10), instock.getCount());
    }

    @Test
    public void testGetCountShouldReturnZeroWhenEmpty() {
        assertEquals(Integer.valueOf(0), instock.getCount());
    }

    @Test
    public void testAddProductShouldStoreTheProductByValidatingWithContains() {
        //Product product = new Product("test_label_1", 100, 1);
        instock.add(product);
        Boolean contains = instock.contains(product);
        assertNotNull(contains);
        assertTrue(contains);
    }

    @Test
    public void testAddShouldNotAllowAdditionOfTheSameProductTwice() {
        //Product product = new Product("test_label_1", 100, 1);
        instock.add(product);
        instock.add(product);
        Integer count = instock.getCount();
        assertNotNull(count);
        assertEquals(Integer.valueOf(1), count);
    }

    @Test
    public void testContainsShouldReturnFalseWhenProductIsNotPresent() {
        //Product product = new Product("label_1", 101, 1);
        Boolean contains = instock.contains(new Product("test_label", 100, 1));
        assertNotNull(contains);
        assertFalse(contains);
    }

    @Test
    public void testContainsShouldReturnFalseWhenEmpty() {
        //Boolean contains = instock.contains(new Product("test_label", 100, 1));
        Boolean contains = instock.contains(product);
        assertNotNull(contains);
        assertFalse(contains);
    }

    @Test
    public void testFindShouldReturnTheCorrectNthProductAdded() {
        addProducts();
        assertEquals(Integer.valueOf(10), instock.getCount());
        Product product = instock.find(6);
        assertNotNull(product);
        assertEquals("label_6", product.getLabel());
    }

    @Test
    public void testFindShouldReturnTheCorrect6thProductAdded() {
        assertFindReturnsCorrectProduct(6);
    }

    @Test
    public void testFindShouldReturnTheCorrect1stProductAdded() {
        assertFindReturnsCorrectProduct(1);
    }

    @Test
    public void testFindShouldReturnTheCorrect10thProductAdded() {
        assertFindReturnsCorrectProduct(9);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testFindShouldFailWhenIndexOutOfBoundsWhenNegativeIndex() {
        instock.find(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testFindShouldFailWhenIndexOutOfBoundsWhenIndexEqualsToCount() {
        addProducts();
        instock.find(instock.getCount());

    }

    @Test
    public void testChangeQuantityShouldUpdateTheProductQuantityValue() {
        instock.add(product);
        int quantityBeforeUpdate = product.getQuantity();
        instock.changeQuantity(product.getLabel(), 10);
        int quantityAfterUpdate = product.getQuantity();
        assertEquals(quantityBeforeUpdate + 10, quantityAfterUpdate);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChangeQuantityShouldFailWhenProductIsMissing() {
        addProducts();
        instock.changeQuantity(product.getLabel(), 10);
    }

    @Test
    public void testFindByLabelShouldReturnCorrectProduct() {
        addProducts();
        instock.add(product);
        Product foundByLabel = instock.findByLabel(product.getLabel());
        assertNotNull(foundByLabel);
        assertEquals(product.getLabel(), foundByLabel.getLabel());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindByLabelShouldThrowExceptionIfProductIsNotIncluded() {
        addProducts();
        instock.findByLabel(product.getLabel());
    }




    private void addProducts() {
        instock.add(new Product("label_0", 13, 1));
        instock.add(new Product("label_1", 95.8, 10));
        instock.add(new Product("label_2", 1000, 13));
        instock.add(new Product("label_3", 100.5, 42));
        instock.add(new Product("label_4", 42.69, 69));
        instock.add(new Product("label_5", 10000, 32));
        instock.add(new Product("label_6", 0.90, 2));
        instock.add(new Product("label_7", 0.10, 7));
        instock.add(new Product("label_8", 1, 99));
        instock.add(new Product("label_9", 0.94, 63));
    }

    private void assertFindReturnsCorrectProduct(int index) {
        addProducts();
        assertEquals(Integer.valueOf(10), instock.getCount());
        Product product = instock.find(index);
        assertNotNull(product);
        assertEquals("label_" + index, product.getLabel());

    }

}