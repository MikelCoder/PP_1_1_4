package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.saveUser("John", "Doe", (byte) 30);
        userService.saveUser("Jane", "Doe", (byte) 25);

        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        Util.shutdown(); // Закрытие SessionFactory
    }
}
