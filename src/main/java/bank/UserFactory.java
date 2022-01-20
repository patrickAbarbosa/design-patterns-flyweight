package bank;

import java.util.HashMap;
import java.util.Map;

public class UserFactory {
    private static Map<String, User> users = new HashMap<>();

    public static User getUser(String cpf, String name) {
        User user = users.get(cpf);
        if (user == null) {
            user = new User(cpf, name);
            users.put(cpf, user);
        }

        return user;
    }

    public static int getTotalUsers() {
        return users.size();
    }
}
