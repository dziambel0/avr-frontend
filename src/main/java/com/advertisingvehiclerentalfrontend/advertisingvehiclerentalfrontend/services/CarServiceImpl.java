package com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.services;

import com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final String BASE_URL = "http://localhost:8080/api/cars";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Car> getAllCars() {
        Car[] cars = restTemplate.getForObject(BASE_URL, Car[].class);
        return Arrays.asList(cars);
    }

    @Override
    public Car getCarById(Long carId) {
        return restTemplate.getForObject(BASE_URL + "/" + carId, Car.class);
    }

    @Override
    public void createCar(Car car) {
        restTemplate.postForObject(BASE_URL, car, Car.class);
    }

    @Override
    public void updateCar(Car car) {
        restTemplate.put(BASE_URL + "/" + car.getCarId(), car);
    }

    @Override
    public void deleteCar(Long carId) {
        restTemplate.delete(BASE_URL + "/" + carId);
    }
}