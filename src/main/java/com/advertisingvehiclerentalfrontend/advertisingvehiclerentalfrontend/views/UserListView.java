package com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.views;

import com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.model.User;
import com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.services.UserService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route("users")
public class UserListView extends VerticalLayout {

    @Autowired
    private UserService userService;

    private Grid<User> grid = new Grid<>(User.class);

    @PostConstruct
    public void init() {
        List<User> users = userService.getAllUsers();
        grid.setItems(users);
        grid.setColumns("userId", "username", "email");
        add(grid);
    }

}
