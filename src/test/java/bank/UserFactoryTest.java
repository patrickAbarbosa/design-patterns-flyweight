package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {
    @Test
    public void shouldReturnUser() {
        User user = UserFactory.getUser("61133184006", "Patrick");

        assertEquals("Patrick", user.getName());
    }

    @Test
    public void shouldContainOnlyOneUser() {
        User user = UserFactory.getUser("61133184006", "Patrick");
        User userB = UserFactory.getUser("61133184006", "Patrick Barbosa");

        assertEquals(1, UserFactory.getTotalUsers());
    }
}