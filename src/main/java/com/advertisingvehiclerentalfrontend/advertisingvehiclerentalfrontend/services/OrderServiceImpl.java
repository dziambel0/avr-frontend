package com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.services;

import com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
@Service
public class OrderServiceImpl implements OrderService{

    private final String BASE_URL = "http://localhost:8080/api/orders";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Order> getAllOrders() {
        Order[] order = restTemplate.getForObject(BASE_URL, Order[].class);
        return Arrays.asList(order);
    }

}
