import java.util.*;
import java.util.stream.Collectors;

public class ChainblockImpl implements Chainblock {

    private Map<Integer, Transaction> transactions;

    public ChainblockImpl() {
        this.transactions = new LinkedHashMap<>();
    }

    public int getCount() {
        if (transactions.isEmpty()) {
            return 0;
        }
        return transactions.size();
    }

    public void add(Transaction transaction) {
        if (!this.contains(transaction)) {
            this.transactions.put(transaction.getId(), transaction);
        }
    }

    public boolean contains(Transaction transaction) {
//        for (Map.Entry<Integer, Transaction> entry : this.transactions.entrySet()) {
//            if (transaction.getId() == entry.getKey()) {
//                return true;
//            }
//        }
//        return false;
        return this.contains(transaction.getId());
    }

    public boolean contains(int id) {
//        for (Map.Entry<Integer, Transaction> entry : this.transactions.entrySet()) {
////            if (id == entry.getKey()) {
////                return true;
////            }
////        }
//        return false;
        return this.transactions.containsKey(id);
    }

    public void changeTransactionStatus(int id, TransactionStatus newStatus) {
        if (!this.transactions.containsKey(id)) {
            throw new IllegalArgumentException();
        }
        this.transactions.get(id).setStatus(newStatus);
    }

    public void removeTransactionById(int id) {
        if (this.transactions.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (!this.transactions.containsKey(id)) {
            throw new IllegalArgumentException();
        } else {
            this.transactions.remove(id);
        }
    }

    public Transaction getById(int id) {
        if (!this.transactions.containsKey(id)) {
            throw new IllegalArgumentException();
        }
        return this.transactions.get(id);
    }

    public Iterable<Transaction> getByTransactionStatus(TransactionStatus status) {
        List<Transaction> tr = this.transactions
                .entrySet()
                .stream()
                .filter(t -> t.getValue().getStatus().equals(status))
                .sorted((tr1, tr2) -> Double.compare(tr2.getValue().getAmount(), tr1.getValue().getAmount()))
                .map(e -> e.getValue())
                .collect(Collectors.toList());
        return tr;
    }

    public Iterable<String> getAllSendersWithTransactionStatus(TransactionStatus status) {
        List<String> senders = this.transactions
                .entrySet()
                .stream()
                .filter(t -> t.getValue().getStatus().equals(status))
                .sorted((tr1, tr2) -> Double.compare(tr1.getValue().getAmount(), tr2.getValue().getAmount()))
                .map(e -> e.getValue().getSender())
                .collect(Collectors.toList());
        this.throwExceptionIfCollectionIsNull(senders);
        return senders;
    }


    public Iterable<String> getAllReceiversWithTransactionStatus(TransactionStatus status) {
        List<String> receivers = this.transactions
                .entrySet()
                .stream()
                .filter(t -> t.getValue().getStatus().equals(status))
                .sorted((tr1, tr2) -> Double.compare(tr1.getValue().getAmount(), tr2.getValue().getAmount()))
                .map(e -> e.getValue().getReceiver())
                .collect(Collectors.toList());
        this.throwExceptionIfCollectionIsNull(receivers);
        return receivers;
    }

    public Iterable<Transaction> getAllOrderedByAmountDescendingThenById() {
        return this.transactions.entrySet().stream().sorted((t1, t2) -> {
            int result = Double.compare(t1.getValue().getAmount(), t2.getValue().getAmount());
            if(result==0) {
                return Integer.compare(t1.getValue().getId(), t2.getValue().getId());
            }
            return result;
        }).map(Map.Entry::getValue).collect(Collectors.toList());
    }

    public Iterable<Transaction> getBySenderOrderedByAmountDescending(String sender) {
        return null;
    }

    public Iterable<Transaction> getByReceiverOrderedByAmountThenById(String receiver) {
        return null;
    }

    public Iterable<Transaction> getByTransactionStatusAndMaximumAmount(TransactionStatus status, double amount) {
        return null;
    }

    public Iterable<Transaction> getBySenderAndMinimumAmountDescending(String sender, double amount) {
        return null;
    }

    public Iterable<Transaction> getByReceiverAndAmountRange(String receiver, double lo, double hi) {
        return null;
    }

    public Iterable<Transaction> getAllInAmountRange(double lo, double hi) {
        return null;
    }

    public Iterator<Transaction> iterator() {
        return null;
    }

    private void throwExceptionIfCollectionIsNull(List<String> collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }
}
