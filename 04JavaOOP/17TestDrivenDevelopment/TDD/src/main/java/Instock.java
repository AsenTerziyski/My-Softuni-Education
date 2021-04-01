import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Instock implements ProductStock {
    //private List<Product> products;
    Map<String, Product> products;

    public Instock() {
        this.products = new LinkedHashMap<>();
    }

    @Override
    public Integer getCount() {
        return products.size();
    }

    @Override
    public Boolean contains(Product product) {
        return this.products.containsKey(product.getLabel());
    }

    @Override
    public void add(Product product) {
        if (!contains(product)) {
            products.put(product.getLabel(), product);
        }
    }

    @Override
    public void changeQuantity(String label, int quantity) {
        validateLabelExists(label);
        int quantityBeforeChange = products.get(label).getQuantity();
        products.get(label).setQuantity(quantityBeforeChange + quantity);
    }

    @Override
    public Product find(int index) {
        return new ArrayList<>(this.products.values()).get(index);
    }

    @Override
    public Product findByLabel(String label) {
        validateLabelExists(label);
        return products.get(label);
    }



    @Override
    public Iterable<Product> findFirstByAlphabeticalOrder(int count) {
        if (count <= 0 || count > this.getCount()) {
            return new ArrayList<>();
        }
        return products
                .values()
                .stream()
                .sorted(Comparator.comparing(Product::getLabel))
                .limit(count)
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Product> findAllInRange(double lo, double hi) {

        return this.products
                .values()
                .stream()
                .filter(p -> p.getPrice() > lo && p.getPrice() <= hi)
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Product> findAllByPrice(double price) {
        return products.values().stream().filter(p-> p.getPrice() == price).collect(Collectors.toList());
    }

    @Override
    public Iterable<Product> findFirstMostExpensiveProducts(int count) {
//        if (count <= 0 || count > this.getCount()) {
//            return new ArrayList<>();
//        }
//        return products
//                .values()
//                .stream()
//                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
//                .limit(count)
//                .collect(Collectors.toList());
        return fetchFirstCountMatching(count, Comparator.comparingDouble(Product::getPrice).reversed());
    }

    @Override
    public Iterable<Product> findAllByQuantity(int quantity) {
        return getAllMatched(p->p.getQuantity() == quantity);
    }

    @Override
    public Iterator<Product> iterator() {
        return products.values().iterator();
    }

    private Iterable<Product> fetchFirstCountMatching(int count, Comparator<Product> comparator) {
        if (count <= 0 || count > this.getCount()) {
            return new ArrayList<>();
        }
        return products
                .values()
                .stream()
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .limit(count)
                .collect(Collectors.toList());

    }

    private void validateLabelExists(String label) {
        if (!products.containsKey(label)) {
            throw new IllegalArgumentException();
        }
    }

    private Iterable<Product> getAllMatched (Predicate<Product> productPredicate) {
        return products.values().stream().filter(productPredicate).collect(Collectors.toList());

    }

}
