package Pr06GreedyTimes;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

public class Bag {
    private long capacity;
    private long currentTotalQuantity;
    private long gold;
    private Map<String, Long> gems;
    private Map<String, Long> cash;

    public Bag(long capacity) {
        this.capacity = capacity;
        this.gems = new HashMap<>();
        this.cash = new HashMap<>();
    }

    public void addCash(String item, long quantity) {
        long totalGems = getTotalGems();
        long totalCash = getTotalCash();
        if (hasFreeCapacity(quantity) && totalGems >= totalCash + quantity) {
            if (!this.cash.containsKey(item)) {
                this.cash.put(item, quantity);
            } else {
                this.cash.put(item, this.cash.get(item) + quantity);
            }
            this.currentTotalQuantity += quantity;
        }
    }

    private long getTotalCash() {
        return this.cash.values().stream().mapToLong(c -> c).sum();
    }

    public void addGems(String item, long quantity) {
        long totalGems = getTotalGems();
        if (hasFreeCapacity(quantity) && totalGems + quantity <= this.gold) {
            if (!this.gems.containsKey(item)) {
                this.gems.put(item, quantity);
            } else {
                this.gems.put(item, this.gems.get(item) + quantity);
            }
            this.currentTotalQuantity += quantity;
        }
    }

    private long getTotalGems() {
        return this.gems.values().stream().mapToLong(g -> g).sum();
    }

    public void addGold(long quantity) {
        if (hasFreeCapacity(quantity)) {
            this.gold += quantity;
            this.currentTotalQuantity += quantity;
        }
    }

    private boolean hasFreeCapacity(long quantity) {
        return currentTotalQuantity + quantity <= capacity;
    }

    private Comparator<Map.Entry<String, Long>> getComparator() {
        return new Comparator<Map.Entry<String, Long>>() {
            @Override
            public int compare(Map.Entry<String, Long> e1, Map.Entry<String, Long> e2) {
                int result = e2.getKey().compareTo(e1.getKey());
                if (result == 0) {
                    result = e1.getValue().compareTo(e2.getValue());
                }
                return result;
            }
        };
    }

    public void printContent() {
        StringBuilder sb = new StringBuilder();
        if (this.gold >= 0) {
            sb
                    .append(String.format("<Gold> $%d", this.gold))
                    .append(System.lineSeparator());
            sb
                    .append(String.format("##Gold - %d", this.gold))
                    .append(System.lineSeparator());
        }


        if (!this.gems.isEmpty()) {
            sb
                    .append(String.format("<Gem> $%d", getTotalGems()))
                    .append(System.lineSeparator());

            this.gems
                    .entrySet()
                    .stream()
                    .sorted(getComparator())
                    .forEach(e ->
                            sb
                                    .append(String.format("##%s - %d", e.getKey(), e.getValue()))
                                    .append(System.lineSeparator()));
        }

        if (!this.cash.isEmpty()) {
            sb
                    .append(String.format("<Cash> $%d", getTotalCash()))
                    .append(System.lineSeparator());

            this.cash
                    .entrySet()
                    .stream()
                    .sorted(getComparator())
                    .forEach(e ->
                            sb
                                    .append(String.format("##%s - %d", e.getKey(), e.getValue()))
                                    .append(System.lineSeparator()));
        }

        System.out.println(sb.toString().trim());
    }
}
