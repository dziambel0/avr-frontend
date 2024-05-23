package com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.views;

import com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.model.Car;
import com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.services.CarService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route("cars")
public class CarListView extends VerticalLayout {

    @Autowired
    private CarService carService;

    private Grid<Car> grid = new Grid<>(Car.class);

    @PostConstruct
    public void init() {
        List<Car> cars = carService.getAllCars();
        grid.setItems(cars);
        grid.setColumns("carId", "brand", "model", "carYear", "registrationNumber", "carStatus");
        add(grid);
    }
}