package com.saddham.payroll.controller.exception;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id) {
        super(String.format("Employee with id %d not found", id));
    }
}
