package com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.views;

import com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.model.Car;
import com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.model.Company;
import com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.services.CompanyService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route("company")
public class CompanyListView extends VerticalLayout {

    @Autowired
    private CompanyService companyService;

    private Grid<Company> grid = new Grid<>(Company.class);

    @PostConstruct
    public void init() {
        List<Company> companies = companyService.getAllCompanys();
        grid.setItems(companies);
        grid.setColumns("companyId", "companyName", "contactInfo");
        add(grid);
    }
}
