package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    public void shouldReturnCPF() {
        User user = new User("10579189031", "Larissa");

        assertEquals("10579189031", user.getCPF());
    }

    @Test
    public void shouldReturnName() {
        User user = new User("10579189031", "Larissa");

        assertEquals("Larissa", user.getName());
    }

    @Test
    public void shouldUpdateCPF() {
        User user = new User("60855564032", "Larissa");

        assertEquals("60855564032", user.getCPF());
    }

    @Test
    public void shouldUpdateName() {
        User user = new User("60855564032", "Larissa");

        user.setName("Patrick");

        assertEquals("Patrick", user.getName());
    }
}