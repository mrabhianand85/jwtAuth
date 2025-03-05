package com.jwt.jwtExample.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.jwt.jwtExample.Model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Abhishek", "abhishek@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Anand", "anand@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Rahul", "rahul@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Vinod", "vinod@gmail.com"));
    }

    public List<User> getUser(){
        return this.store;
    }
}
