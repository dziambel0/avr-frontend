package com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Order {

    private Long orderId;

    private LocalDate startDate;

    private LocalDate endDate;

    private double price;

    private List<Car> cars;

    public Long getOrderId() {
        return orderId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public double getPrice() {
        return price;
    }

    public List<Car> getCars() {
        return cars;
    }
}
