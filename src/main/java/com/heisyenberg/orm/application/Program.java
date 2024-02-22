package com.heisyenberg.orm.application;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import com.heisyenberg.orm.models.User;

import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {
        HikariConfig config = new HikariConfig("/database.properties");
        OrmManager manager = new OrmManager(new HikariDataSource(config));
        try {
            manager.initialization();
            User user = new User(1L, "Danya", "Sadykov", 25);
            manager.save(user);
            user.setAge(26);
            manager.update(user);
            User user1 = manager.findById(1L, User.class);
            System.out.println(user1);
        } catch (SQLException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
