package com.ciclo4.reto.repositorio;


import com.ciclo4.reto.interfaces.InterfaceOrder;
import com.ciclo4.reto.modelo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OrderRepositorio {

    @Autowired
    private InterfaceOrder interfaceorder;

    public List<Order> getAll() {
        return (List<Order>) interfaceorder.findAll();
    }

    public Optional<Order> getOrder(int id) {
        return interfaceorder.findById(id);
    }

    public Order create(Order order) {
        return interfaceorder.save(order);
    }

    public void update(Order order) {
        interfaceorder.save(order);
    }

    public void delete(Order order) {
        interfaceorder.delete(order);
    }

    public Optional<Order> lastUserId(){
        return interfaceorder.findTopByOrderByIdDesc();
    }


    public List<Order> findByZone(String zone) {
        return interfaceorder.findByZone(zone);
    }
}
