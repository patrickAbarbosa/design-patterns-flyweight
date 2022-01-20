package bank;

public interface ITransaction {
    public int getTransaction();
    public Double getValue();
    public User getFrom();
    public User getTo();
}
