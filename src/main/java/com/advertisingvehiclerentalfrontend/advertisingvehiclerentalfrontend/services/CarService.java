package com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.services;

import com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();
    Car getCarById(Long carId);
    void createCar(Car car);
    void updateCar(Car car);
    void deleteCar(Long carId);
}