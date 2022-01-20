package bank;

public class Transaction implements ITransaction {
    private int id;
    private User from;
    private User to;
    private Double value;

    public Transaction(int id, User from, User to, Double value) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.value = value;
    }

    @Override
    public int getTransaction() {
        return this.id;
    }

    @Override
    public Double getValue() {
        return this.value;
    }

    @Override
    public User getFrom() {
        return this.from;
    }

    @Override
    public User getTo() {
        return this.to;
    }
}
