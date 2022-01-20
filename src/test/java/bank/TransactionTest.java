package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    @Test
    public void shouldReturnTransactionValue() {
        User from = UserFactory.getUser("61133184006", "Patrick");
        User to = UserFactory.getUser("63485572004", "Larissa");

        Transaction transaction = new Transaction(22, from, to, 535.0);

        assertEquals(535.0, transaction.getValue());
    }

    @Test
    public void shouldReturnFromUser() {
        User from = UserFactory.getUser("61133184006", "Patrick");
        User to = UserFactory.getUser("63485572004", "Larissa");

        Transaction transaction = new Transaction(22, from, to, 535.0);

        assertEquals(from.getName(), transaction.getFrom().getName());
    }

    @Test
    public void shouldReturnToUser() {
        User from = UserFactory.getUser("61133184006", "Patrick");
        User to = UserFactory.getUser("63485572004", "Larissa");

        Transaction transaction = new Transaction(22, from, to, 535.0);

        assertEquals(to.getName(), transaction.getTo().getName());
    }

    @Test
    public void shouldStoreOnlyThreeUsers() {
        User userA = UserFactory.getUser("61133184006", "Patrick");
        User userB = UserFactory.getUser("63485572004", "Larissa");
        User to = UserFactory.getUser("63485572004", "Larissa");

        Transaction transactionA = new Transaction(
                22,
                UserFactory.getUser("61133184006",
                "Patrick"),
                UserFactory.getUser("63485572004", "Larissa"),
                535.0
        );

        Transaction transactionB = new Transaction(
                22,
                UserFactory.getUser("61133184006",
                        "Patrick"),
                UserFactory.getUser("46162986020", "Karina"),
                1000.0
        );

        Transaction transactionC = new Transaction(
                22,
                UserFactory.getUser("46162986020",
                        "Patrick"),
                UserFactory.getUser("61133184006", "Karina"),
                1100.0
        );

        assertEquals(3, UserFactory.getTotalUsers());
    }
}