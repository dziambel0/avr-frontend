package com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.services;

import com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final String BASE_URL = "http://localhost:8080/api/users";

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public List<User> getAllUsers() {
        User[] users = restTemplate.getForObject(BASE_URL, User[].class);
        return Arrays.asList(users);
    }


}
