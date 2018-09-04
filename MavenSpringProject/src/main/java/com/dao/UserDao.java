package com.dao;

import com.model.User;
import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

/**
 * Created by max on 9/3/18.
 */
@Repository
public class UserDao {
    private List<User> users = Arrays.asList(new User("admin", "admin"), new User("user", "user"), new User("sa", "sa"));
    public List<User> getUsers() {
        return users;
    }
}
