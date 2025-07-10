package com.usemongo.mgdb.controller;

import com.usemongo.mgdb.model.Post;
import com.usemongo.mgdb.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/all")
    public List<Post> getall() {
        return customerService.getAllbooks();
    }

    @GetMapping("/update")
    public String update1() {
        return customerService.update1();
    }


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
}
