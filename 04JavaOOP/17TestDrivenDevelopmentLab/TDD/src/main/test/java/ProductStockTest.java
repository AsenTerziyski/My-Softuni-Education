import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

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
        Boolean contains = instock.contains(new Product("test_label", 100, 1));
        assertNotNull(contains);
        assertFalse(contains);
    }

    @Test
    public void testContainsShouldReturnFalseWhenEmpty() {
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

    @Test
    public void testFindFirstByAlphabeticalOrderShouldReturnEmptyCollectionIfCountIsOutOfRange() {
        addProducts();
        Iterable<Product> iterable = instock.findFirstByAlphabeticalOrder(instock.getCount() + 1);
        assertEmptySequence(iterable);
    }

    @Test
    public void testFindFirstByAlphabeticalOrderShouldReturnCorrectNumberOfProductsThatAreOrderedByLabel() {
        int expectedCount = 5;
        List<String> expectedLabels = addProducts().stream().sorted(Comparator.comparing(Product::getLabel))
                .limit(expectedCount).map(Product::getLabel)
                .collect(Collectors.toList());
        List<Product> actualProducts = getListFromIterable(instock.findFirstByAlphabeticalOrder(expectedCount));
        assertEquals(expectedCount, actualProducts.size());
        for (int i = 0; i < actualProducts.size(); i++) {
            assertEquals(expectedLabels.get(i), actualProducts.get(i).getLabel());
        }
    }

    @Test
    public void testFindAllInRangeShouldReturnEmptyCollectionIfNoProductsInTheRangeAreStored() {
        addProducts();
        Iterable<Product> iterable = instock.findAllInRange(10000, 11000);
        // трябва да върне итеръбъл, който не е нулл:
        assertEmptySequence(iterable);
    }

    @Test
    public void testFindAllInRangeShouldReturnCorrectRangeWithOrderedPricesDescending() {
        double lowRange = 0.10;
        double upperRange = 100.5;
        List<Product> expected = addProducts().stream().filter(p -> p.getPrice() > lowRange && p.getPrice() <= upperRange).
                sorted(Comparator.comparingDouble(Product::getPrice).reversed()).collect(Collectors.toList());
        List<Product> actual = getListFromIterable(instock.findAllInRange(0.1, 100.5));
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < actual.size(); i++) {
            assertEquals(expected.get(i).getPrice(), actual.get(i).getPrice(), 0.00);

        }
    }

    @Test
    public void testFindAllByPriceShouldReturnOnlyProductsWithEqualPrices() {
        instock.add(product);
        instock.add(new Product("testLabel", product.getPrice(), 1));
        List<Product> actual = getListFromIterable(instock.findAllByPrice(product.getPrice()));
        assertEquals(2, actual.size());
        assertTrue(actual.stream().allMatch(p -> p.getPrice() == product.getPrice()));
    }

    @Test
    public void testFindAllByPriceShouldReturnEmptyCollectionIfNoSuchAPrice() {
        addProducts();
        List<Product> actual = getListFromIterable(instock.findAllByPrice(100));
        assertTrue(actual.isEmpty());
    }

    @Test
    public void testFindFirstMostExpensiveProductsShouldReturnCorrectNumberOfProductsOrderedByPriceInDescending() {
        int expectedCount = 3;
        List<Double> expectedLabels = addProducts()
                .stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .limit(expectedCount)
                .map(Product::getPrice).collect(Collectors.toList());

        List<Product> actualProduct = getListFromIterable(instock.findFirstMostExpensiveProducts(expectedCount));

        assertEquals(expectedCount, actualProduct.size());
        for (int i = 0; i < actualProduct.size(); i++) {
            assertEquals(expectedLabels.get(i), actualProduct.get(i).getPrice(), 0);
        }
    }

    @Test
    public void testFindFirstMostExpensiveProductsShouldReturnEmptyCollectionIfCountIsOutOFRange() {
        addProducts();
        Iterable<Product> iterable = instock.findFirstMostExpensiveProducts(instock.getCount() + 1);
        assertEmptySequence(iterable);
    }

    @Test
    public void testFindAllByQuantityShouldReturnOnlyProductsWithEqualQuantity() {
        addProducts();
        instock.add(product);
        instock.add(new Product("testLabel", product.getPrice(), product.getQuantity()));
        List<Product> actual = getListFromIterable(instock.findAllByQuantity(product.getQuantity()));
        assertEquals(3, actual.size());
        assertTrue(actual.stream().allMatch(p -> p.getQuantity() == product.getQuantity()));
    }

    @Test
    public void testFindAllByQuantityShouldReturnEmptyCollectionIfNoSuchQuantityProductPresent() {
        addProducts();
        List<Product> actual = getListFromIterable(instock.findAllByQuantity(100000000));
        assertTrue(actual.isEmpty());
    }

    @Test
    public void testGetIterableShouldReturnAllProductsInOrderOffAddition() {
        List<Product> expected = addProducts();
        Iterator<Product> iterator = instock.iterator();
        List<Product> actual = new ArrayList<>();
        while (iterator.hasNext()) {
            actual.add(iterator.next());
        }
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i <expected.size() ; i++) {
            assertEquals(expected.get(i).getLabel(), actual.get(i).getLabel());
        }
    }

    private <T> List<T> getListFromIterable(Iterable<T> iterable) {
        assertNotNull(iterable);
        List<T> elements = new ArrayList<>();
        iterable.forEach(elements::add);
        return elements;
    }

    private void assertEmptySequence(Iterable<Product> iterable) {
        assertNotNull(iterable);
        List<Product> products = new ArrayList<>();
        iterable.forEach(products::add);
        assertTrue(products.isEmpty());
    }

    private List<Product> addProducts() {
        List<Product> products = Arrays.asList(new Product("label_0", 13, 1),
                new Product("label_1", 95.8, 10),
                new Product("label_2", 1000, 13),
                new Product("label_3", 100.5, 42),
                new Product("label_4", 42.69, 69),
                new Product("label_5", 10000, 32),
                new Product("label_6", 0.90, 2),
                new Product("label_7", 0.10, 7),
                new Product("label_8", 1, 99),
                new Product("label_9", 0.94, 63));
        for (Product p : products) {
            instock.add(p);
        }
        return products;
    }

    private void assertFindReturnsCorrectProduct(int index) {
        addProducts();
        assertEquals(Integer.valueOf(10), instock.getCount());
        Product product = instock.find(index);
        assertNotNull(product);
        assertEquals("label_" + index, product.getLabel());
    }
}