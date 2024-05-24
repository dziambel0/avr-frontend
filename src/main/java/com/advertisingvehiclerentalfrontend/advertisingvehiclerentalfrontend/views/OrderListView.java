package com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.views;

import com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.model.Order;
import com.advertisingvehiclerentalfrontend.advertisingvehiclerentalfrontend.services.OrderService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route("orders")
public class OrderListView extends VerticalLayout{

    @Autowired
    private OrderService orderService;

    private Grid<Order> grid = new Grid<>(Order.class);

    @PostConstruct
    public void init() {
        List<Order> orders = orderService.getAllOrders();
        grid.setItems(orders);
        grid.setColumns("orderId", "startDate", "endDate", "price", "cars");
        add(grid);
    }
}
