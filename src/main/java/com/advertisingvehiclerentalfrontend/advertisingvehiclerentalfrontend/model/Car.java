package com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Car {

    private Long carId;
    private String brand;
    private String model;
    private int carYear;
    private String registrationNumber;
    private CarStatus carStatus;

    public Long getCarId() {
        return this.carId;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getCarYear() {
        return this.carYear;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public CarStatus getCarStatus() {
        return this.carStatus;
    }
}